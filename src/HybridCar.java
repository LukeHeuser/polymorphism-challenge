public class HybridCar extends Car {
    private double avgMilesPerGallon;
    private int batterySize;
    private int cylinders = 4;
    public HybridCar (String title, String description,double avgMilesPerGallon, int batterySize, int cylinders) {
        super(title, description);
        this.avgMilesPerGallon = avgMilesPerGallon;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public HybridCar(String title, String description) {
        super(title, description);
    }

    @Override
    public void startEngine() {
        System.out.printf("The hybrid engine is running on all %d cylinders!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("The engine is running at the optimal " + avgMilesPerGallon + " MPG with a battery size of %d!%n", batterySize);
    }
}
