package PolymorphismChallenge;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Holden -> Starting engine!");
    }

    @Override
    public void accelerate() {
        System.out.println("Holden -> Accelerating!");
    }

    @Override
    public void brake() {
        System.out.println("Holden -> Braking!");
    }
}
