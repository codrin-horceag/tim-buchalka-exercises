package AbstractClassChallenge;

public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            //list was empty, so the item becomes the head of the list.
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if (comparison > 0){
                //new item is greater, so we need to move right, if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if(comparison < 0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                } else {
                    item.setNext(this.root);
                    root.setPrevious(item);
                    this.root = item;
                }
            } else {
                System.out.println("The item already exists!");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(this.root == null){
            //list was empty, so the item becomes the head of the list.
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            if(currentItem.getValue() == item.getValue()){
                currentItem.previous().setNext(currentItem.next());
                currentItem.next().setPrevious(currentItem.previous());
                return true;
            } else {
                currentItem = currentItem.next();
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty");
        } else {
            while(root != null){
                System.out.println(" " + String.valueOf(root.getValue()));
                root = root.next();
            }
        }
    }
}
