public class Vehicle {
    // Instance variables defining the properties of a vehicle
    private final String engineType;  // Type of engine (e.g., V8, Electric)
    private final String transmission; // Transmission type (e.g., Automatic, Manual)
    private final String color;        // Color of the vehicle (e.g., Red, Black)
    private final boolean hasSunroof;  // Indicator for sunroof presence
    private final int numberOfDoors;   // Number of doors in the vehicle

    // Private constructor that initializes the vehicle using the builder
    private Vehicle(VehicleBuilder builder) {
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
        this.numberOfDoors = builder.numberOfDoors;
    }

    // Getter methods for accessing vehicle attributes
    public String getEngineType() {
        return engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Static nested Builder class for constructing Vehicle instances
    public static class VehicleBuilder {
        private String engineType;    // Engine type
        private String transmission;   // Transmission type
        private String color;          // Vehicle color
        private boolean hasSunroof;    // Sunroof flag
        private int numberOfDoors;     // Count of doors

        // Method to set the engine type
        public VehicleBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this; // Returning the builder for method chaining
        }

        // Method to set the transmission type
        public VehicleBuilder setTransmission(String transmission) {
            this.transmission = transmission;
            return this; // Returning the builder for method chaining
        }

        // Method to set the vehicle color
        public VehicleBuilder setColor(String color) {
            this.color = color;
            return this; // Returning the builder for method chaining
        }

        // Method to specify whether the vehicle has a sunroof
        public VehicleBuilder setSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this; // Returning the builder for method chaining
        }

        // Method to set the number of doors
        public VehicleBuilder setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this; // Returning the builder for method chaining
        }

        // Final method to construct and return a Vehicle instance
        public Vehicle create() {
            return new Vehicle(this); // Creating a new Vehicle using the builder
        }
    }

    // Overriding toString for better display of vehicle details
    @Override
    public String toString() {
        return "Vehicle Details: [Engine Type=" + engineType +
                ", Transmission=" + transmission +
                ", Color=" + color +
                ", Has Sunroof=" + hasSunroof +
                ", Number of Doors=" + numberOfDoors + "]";
    }
}

