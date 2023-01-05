package CarTask;

public class CydeoCar extends Car implements AutoPilot,AutoPark,Flyable{
    public CydeoCar(String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
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

    @Override
    public void Fly() {
        System.out.println(getMake()+" "+getModel()+" can fly!");
    }
}
