package CarTask;

public class Audi_Mercedes extends Car implements AutoPark{
    public Audi_Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" is now auto parking!");
    }

    @Override
    public void start() {
        System.out.println(getMake()+" is starting up");
    }

    @Override
    public void drive() {
       System.out.println(getMake()+" "+getModel()+" is driving");
    }
}
