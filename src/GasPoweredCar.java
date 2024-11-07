public class GasPoweredCar extends Car{

    private double avgMphPerGallon;
    private int cylinders;

    public GasPoweredCar(String title, String description) {
        super(title, description);
    }

public GasPoweredCar (String title, String description, double avgMilesPerGallon, int cylinders) {
    super(title, description);
    this.avgMphPerGallon = avgMilesPerGallon;
    this.cylinders = cylinders;
}

    @Override
    public void startEngine() {
        System.out.printf("Gas powered car is firing all %d cylinders! %n", cylinders);
    }

    @Override
    protected void runEngine() {
        if(cylinders <= 0) {
            System.out.println("The engine can not run!");
            return;
        }
        System.out.println("The gas powered car is thundering down the road!");
    }


    public void cylinderCount() {

        if(cylinders <= 0) {
            System.out.println("Where are the cylinders!");
            return;
        }
        System.out.println("The car has " + cylinders + " Cylinders!");
    }

    public void avgMPG() {
        System.out.println("The car gets " + avgMphPerGallon + " miles to the gallon!");
    }


}
