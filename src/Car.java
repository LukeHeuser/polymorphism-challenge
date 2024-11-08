public class Car {

    private String title;
    private String description;

    public Car (String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void startEngine() {
        System.out.println(title + ": " + description + ": Engine is started!");
    }

    public void drive() {
        System.out.println("The car is driving! The type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("The car is running!");
    }
    
}