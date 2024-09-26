public class Vehicle {
    private final String engineType;
    private final String transmission;
    private final String color;
    private final boolean hasSunroof;
    private final int numberOfDoors;

    private Vehicle(VehicleBuilder builder) {
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
        this.numberOfDoors = builder.numberOfDoors;
    }

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

    public static class VehicleBuilder {
        private String engineType;
        private String transmission;
        private String color;
        private boolean hasSunroof;
        private int numberOfDoors;

        public VehicleBuilder withEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public VehicleBuilder withTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public VehicleBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public VehicleBuilder withSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public VehicleBuilder withNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    @Override
    public String toString() {
        return "Vehicle [engineType=" + engineType + ", transmission=" + transmission +
                ", color=" + color + ", hasSunroof=" + hasSunroof +
                ", numberOfDoors=" + numberOfDoors + "]";
    }
}
