package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void printInstructions(){
        System.out.println("Press: ");
        System.out.println("0 -> to print the instructions");
        System.out.println("1 -> to print the grocery list");
        System.out.println("2 -> to add an item to the list");
        System.out.println("3 -> to change an item from the list");
        System.out.println("4 -> to remove an item from the list");
        System.out.println("5 -> to search for an item in the list");
        System.out.println("6 -> to quit working with the list");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Please specify item to be changed: ");
        String oldItem = scanner.nextLine();
        System.out.print("Please enter replacement item: ");
        String item = scanner.next();
        groceryList.changeGroceryItem(oldItem, item);
        groceryList.printGroceryList();
    }

    public static void removeItem(){
        System.out.println("Please specify item to remove: ");
        String oldItem = scanner.nextLine();
        groceryList.removeGroceryItem(oldItem);
        System.out.println("Item " + oldItem + " was removed!");
        groceryList.printGroceryList();
    }

    public static void searchItem(){
        System.out.print("Please specify the name of the item: ");
        String name = scanner.nextLine();
        if(groceryList.hasGroceryItem(name)){
            System.out.println("Item found!");
        } else {
            System.out.println("Item not found!");
        }

    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList()); //addAll adds an entire collection to another

        ArrayList<String> nextArray = groceryList.getGroceryList(); // this copies an array easily

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:

                case 7:
                    System.out.println("Thank you!");
                    quit = true;
                    break;
            }
        }
    }
}
