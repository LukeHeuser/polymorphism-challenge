public class Main {
    public static void main(String[] args) {

        Car car = new Car("Ford", "Focus");
        runRace(car);

        Car ferrari = new GasPoweredCar("488", "Ferrari", 18, 8);
        runRace(ferrari);
        gasPoweredCarStats((GasPoweredCar)ferrari);

        Car brokenCar = new GasPoweredCar("F150", "Ford", 8, 0);
        gasPoweredCarStats((GasPoweredCar) brokenCar);

        Car tesla = new ElectricCar("Tesla", "Model Y", 350, 30_000);
        runRace(tesla);

        Car toyota = new HybridCar("Toyota", "Prius", 78.56, 15_000, 4);
        runRace(toyota);

    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
        System.out.println("----");
    }

    public static void gasPoweredCarStats(GasPoweredCar car) {
        car.cylinderCount();
        car.runEngine();
        car.avgMPG();
        System.out.println("----");
    }

}
