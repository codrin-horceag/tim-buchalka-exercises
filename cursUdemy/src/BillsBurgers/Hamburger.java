package BillsBurgers;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    private String addition1Name;
    private double addtion1Price;
    private String addition2Name;
    private double addtion2Price;
    private String addition3Name;
    private double addtion3Price;
    private String addition4Name;
    private double addtion4Price;

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addtion1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addtion2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addtion3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addtion4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll, with " + this.meat + ", price is " + this.price);
        if(this.addition1Name != null && this.addtion1Price != 0){
            System.out.println("Added " +this.addition1Name+ " for " + this.addtion1Price);
            hamburgerPrice += this.addtion1Price;
        }

        if(this.addition2Name != null && this.addtion2Price != 0){
            System.out.println("Added " +this.addition2Name+ " for " + this.addtion2Price);
            hamburgerPrice += this.addtion2Price;
        }

        if(this.addition3Name != null && this.addtion3Price != 0){
            System.out.println("Added " +this.addition3Name+ " for " + this.addtion3Price);
            hamburgerPrice += this.addtion3Price;
        }

        if(this.addition4Name != null && this.addtion4Price != 0){
            System.out.println("Added " +this.addition4Name+ " for " + this.addtion4Price);
            hamburgerPrice += this.addtion4Price;
        }
        System.out.println("Total " + this.name + " price is " + hamburgerPrice);
        return hamburgerPrice;

    }
}
