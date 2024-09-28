public class VehicleDemo {
    public static void main(String[] args) {
        // Constructing a premium vehicle with all features
        Vehicle premiumVehicle = new Vehicle.VehicleBuilder()
                .setEngineType("V8")           // Setting engine type to V8
                .setTransmission("Automatic")   // Choosing Automatic transmission
                .setColor("Bright Red")         // Specifying color
                .setSunroof(true)               // Adding sunroof
                .setNumberOfDoors(4)            // Configuring 4 doors
                .create();                      // Building the vehicle instance

        // Constructing a basic vehicle with minimal options
        Vehicle basicVehicle = new Vehicle.VehicleBuilder()
                .setEngineType("Electric")      // Setting engine type to Electric
                .setTransmission("Manual")       // Choosing Manual transmission
                .setColor("Deep Black")          // Specifying color
                .setSunroof(false)               // No sunroof
                .setNumberOfDoors(2)             // Configuring 2 doors
                .create();                       // Building the vehicle instance

        // Displaying the details of both vehicle configurations
        System.out.println("Premium Vehicle: " + premiumVehicle);
        System.out.println("Basic Vehicle: " + basicVehicle);
    }
}
