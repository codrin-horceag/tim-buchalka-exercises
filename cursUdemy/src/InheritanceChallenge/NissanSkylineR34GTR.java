package InheritanceChallenge;

import java.util.Scanner;

public class NissanSkylineR34GTR extends Car {
    private int roadServiceMonths;

    public NissanSkylineR34GTR(int wheels, int doors, int gears, boolean isManual, int roadServiceMonths) {
        super("Nissan Skyline R34 GT-R", "Mid-size", 4, doors, gears, isManual);
        this.roadServiceMonths = roadServiceMonths;
        if (isManual)
            gears = 6;
        else
            gears = 4;
    }


    public void changeGear() {
        Scanner gear = new Scanner(System.in);
        if (isManual() == true) {
            System.out.println("Change gear!");
            super.changeGear(gear.nextInt());
        } else {
            super.changeGear(getCurrentGear());
        }
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 30)
            changeGear(1);
        else if (newVelocity < 30 && newVelocity <= 60)
            changeGear(2);
        else if (newVelocity < 60 && newVelocity <= 90)
            changeGear(3);
        else if (newVelocity < 90 && newVelocity <= 120)
            changeGear(4);
        else if (newVelocity < 120 && newVelocity <= 150)
            this.changeGear();
        else
            this.changeGear();

        if (newVelocity > 0)
            changeVelocity(newVelocity, getCurrentDirection());
    }


    public void brake(int rate) {

    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    public void setRoadServiceMonths(int roadServiceMonths) {
        this.roadServiceMonths = roadServiceMonths;
    }
}
