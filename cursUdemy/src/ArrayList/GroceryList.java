package ArrayList;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("Your grocery list size is " + groceryList.size());
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void changeGroceryItem(String currentItem, String item){
        int position = findItem(currentItem);
        if(position >= 0){
            changeGroceryItem(position, item);
        }
    }
    public void changeGroceryItem(int position, String item){
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String item){
        return groceryList.indexOf(item);
    }

    public boolean hasGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0)
            return true;
        else
            return false;
    }
}
