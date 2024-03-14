import java.util.NoSuchElementException;
public class linkList<E> {
    private listNode<E> firstNode;
    private listNode<E> lastNode;
    private String name;

    public linkList(){
        this("Linked List");
    }

    public linkList(String listName){
        name = listName;
        firstNode = lastNode = null;
    }

    private boolean isEmpty(){
        return firstNode == null;
    }

    public void insertAtFront(E insertItem){
        listNode newNode = new listNode<E>(insertItem);
        if(isEmpty()){
            firstNode = lastNode = new listNode<E>(insertItem);
        }
        else{
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }
    public E removeFromBack() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException(name+" Kosong");
        }
        E removedItem = lastNode.data;

        if(firstNode == lastNode){
            firstNode = lastNode = null;
        }

        else{
            listNode<E> current = firstNode;
            while(current.next != lastNode){
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }

    public E removeFromFront() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException(name+" Kosong");
        }
        E removedItem = firstNode.data;

        if(lastNode == firstNode){
            lastNode = firstNode = null;
        }

        else{
            listNode<E> current = lastNode;
            while(current.next != firstNode){
                current = current.next;
            }
            firstNode = current;
            current.next = null;
        }
        return removedItem;
    }

    public void printFront(){
        if(isEmpty()){
            System.out.printf("The %s is %n", name);
            return;
        }
        System.out.printf("The %s is %n", name);
        listNode<E> current = firstNode;
        while(current!=null){
            System.out.printf("%s",current.data);
            current = current.next;
        }
        System.out.println();
    }
    public void printBack(){
        if(isEmpty()){
            System.out.printf("The %s is %n", name);
            return;
        }
        System.out.printf("The %s is %n", name);
        listNode<E> current = lastNode;
        while(current!=null){
            System.out.printf("%s",current.data);
            current = current.next;
        }
        System.out.println();
    }
}
