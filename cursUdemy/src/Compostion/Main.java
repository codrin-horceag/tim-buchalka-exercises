package Compostion;

public class Main {
    public static void main(String[] args) {
//        Dimensions caseDimensions = new Dimensions(200, 400, 100);
//        Case pcCase = new Case("220b", "Dell", "600w", caseDimensions);
//
//        Monitor monitor = new Monitor("saracie", "Samsung", 24, new Resolution(1366, 720));
//        Motherboard motherboard = new Motherboard("B450", "ASUS ROG", 4, 2, "v. 2.0");
//
//        PersonalComputer myPC = new PersonalComputer(pcCase, motherboard, monitor);
//        myPC.powerUp();

        Wall nWall = new Wall("North");
        Wall sWall = new Wall("South");
        Wall eWall = new Wall("East");
        Wall wWall = new Wall("West");
        Ceiling bedroomCeiling = new Ceiling(15, "White");
        Bed myBed = new Bed("Extensible", 1, 10, 2, 4);
        Lamp myLamp = new Lamp("Table", false, 10);

        Bedroom myBedroom = new Bedroom(nWall,sWall,eWall,wWall,bedroomCeiling,myBed,myLamp);

        myBedroom.makeBed();
        myBedroom.getLamp().turnOn();

    }
}
