package PolymorphismChallenge;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi -> Starting engine!");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi -> Accelerating!");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi -> Braking!");
    }
}
