package CarTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota chaser = new Toyota("chaser",1998,85600,"black");
        Bmw m5 = new Bmw("M5",2020,132000,"British Racing Green");
        Audi_Mercedes mercedes = new Audi_Mercedes("Mercedes","S class",2022,165300,"White");
        Tesla_Nio tesla = new Tesla_Nio("Tesla","Model S",2018,130000,"Grey");
        CydeoCar car = new CydeoCar("Cybertek",2020,111111,"Purple");

        chaser.drive();
        m5.start();
        mercedes.autoPark();
        tesla.selfDrive();
        car.Fly();

        System.out.println(chaser);
        System.out.println(m5);
        System.out.println(mercedes);
        System.out.println(tesla);
        System.out.println(car);


    }
}
