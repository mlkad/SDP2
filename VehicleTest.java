public class VehicleTest {
    public static void main(String[] args) {
        Vehicle fullyLoadedVehicle = new Vehicle.VehicleBuilder()
                .withEngineType("V8")
                .withTransmission("Automatic")
                .withColor("Red")
                .withSunroof(true)
                .withNumberOfDoors(4)
                .build();

        Vehicle basicVehicle = new Vehicle.VehicleBuilder()
                .withEngineType("Electric")
                .withTransmission("Manual")
                .withColor("Black")
                .withSunroof(false)
                .withNumberOfDoors(2)
                .build();

        System.out.println("Fully Loaded Vehicle: " + fullyLoadedVehicle);
        System.out.println("Basic Vehicle: " + basicVehicle);
    }
}
