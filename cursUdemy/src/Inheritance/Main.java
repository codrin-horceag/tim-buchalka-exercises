package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Alice", 1, 1, 10, 13);

        Dog dog = new Dog("Lassie", 20, 15, 2, 4, 1, 28, "Smooth");
//        dog.eat();
        dog.run();
    }
}
