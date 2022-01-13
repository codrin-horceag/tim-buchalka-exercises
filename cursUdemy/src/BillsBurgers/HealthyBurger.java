package BillsBurgers;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, "Brown rye", price);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = this.getPrice();
        System.out.println(this.getName() + " hamburger on a " + this.getBreadRollType() + " roll, with " + this.getMeat() + ", price is " + this.getPrice());
        if(this.healthyExtra1Name != null && this.healthyExtra1Price != 0){
            System.out.println("Added " +this.healthyExtra1Name+ " for " + this.healthyExtra1Price);
            hamburgerPrice += this.healthyExtra1Price;
        }

        if(this.healthyExtra2Name != null && this.healthyExtra2Price != 0){
            System.out.println("Added " +this.healthyExtra2Name+ " for " + this.healthyExtra2Price);
            hamburgerPrice += this.healthyExtra2Price;
        }
        System.out.println("Total " + this.getName() + " price is " + hamburgerPrice);
        return hamburgerPrice;
    }
}
