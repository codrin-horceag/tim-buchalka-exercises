package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder("Sydney", placesToVisit);
        addInOrder("Melbourne", placesToVisit);
        addInOrder("Brisbane", placesToVisit);
        addInOrder("Perth", placesToVisit);
        addInOrder("Canberra", placesToVisit);
        addInOrder("Adelaide", placesToVisit);
        addInOrder("Darwin", placesToVisit);
        visit(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedList){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as a destination" );
                return false;
            } else if(comparison > 0){
                //newCity should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0){
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> i = cities.listIterator();



        while(!quit){
            int action = Integer.valueOf(scanner.next());
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday over!");
                    quit = true;
                    break;
                case 1:
                    if(i.hasNext()){
                        System.out.println("Now visiting " + i.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        break;
                    }
                case 2:
                    if(i.hasPrevious()){
                        System.out.println("Now visiting " + i.previous());
                    } else {
                        System.out.println("Reached the start of the list");
                        break;
                    }
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("0. Quit");
        System.out.println("1. Move to next city");
        System.out.println("2. Move to previous city");
        System.out.println("3. Print menu");
    }
}
