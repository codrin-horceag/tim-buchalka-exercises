package BillsBurgers;

public class Main {
    public static void main(String[] args) {
        Hamburger myBurger = new Hamburger("Travis Scott", "Beef", "Black", 4.50);
        myBurger.addHamburgerAddition1("Cheese", 0.5);
        myBurger.addHamburgerAddition2("Cocktail Sauce", 1);
        myBurger.itemizeHamburger();

        System.out.println("");

        DeluxeBurger myDeluxeBurger = new DeluxeBurger();
        myDeluxeBurger.addHamburgerAddition1("Cheese", 1.0);
        myDeluxeBurger.itemizeHamburger();

        System.out.println("");

        HealthyBurger myHealthyBurger = new HealthyBurger("Falafel", 14.0);
        myHealthyBurger.addHealthyAddition1("Lettuce", 0.4);
        myHealthyBurger.addHamburgerAddition2("Onions", 0.5);
        myHealthyBurger.itemizeHamburger();
    }
}
