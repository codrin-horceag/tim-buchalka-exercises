package PolymorphismChallenge;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford -> Starting engine!");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford -> Accelerating!");
    }

    @Override
    public void brake() {
        System.out.println("Ford -> Braking!");
    }
}
