public class ElectricCar extends Car{
    private double avgMilesPerCharge;
    private int batterySize;


    public ElectricCar(String title, String description) {
        super(title, description);
    }
    public ElectricCar (String title, String description, double avgMilesPerCharge, int batterySize) {
        super(title, description);
        this.avgMilesPerCharge = avgMilesPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("There is no engine! The car is electric and is on with a batter size of %d%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.println("There is no engine! The battery is running with an average miles per charge of " + avgMilesPerCharge);
    }
}
