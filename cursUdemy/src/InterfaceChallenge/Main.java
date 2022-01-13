package InterfaceChallenge;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> objects = new ArrayList<String>();
        objectToLoad.read(objects);
    }
}
