package CarTask;

public class Tesla_Nio extends Car implements AutoPilot{
    public Tesla_Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" is now auto parking!");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" is now self driving!");
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
