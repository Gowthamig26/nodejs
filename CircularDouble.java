
package LinkedList;


public class CircularDouble {
   
    static class Node {
        int data;
        Node next;
        Node prev;
    };
    static Node start = null;
 
    static void insertBegin(int value)
    {
        if (start == null) {
            Node new_node = new Node();
            new_node.data = value;
            new_node.next = new_node.prev = new_node;
            start = new_node;
            return;
        }
        Node last = (start).prev;
        Node new_node = new Node();
        new_node.data = value;
        new_node.next = start;
        new_node.prev = last;
 
        last.next = (start).prev = new_node;
 
        start = new_node;
    }
 
    static void display()
    {
        Node temp = start;
        System.out.printf("\nTraversal in"
                          + " forward direction \n");
        while (temp.next != start) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d ", temp.data);
 
        System.out.printf("\nTraversal in "
                          + "reverse direction \n");
        Node last = start.prev;
        temp = last;
 
        while (temp.prev != last) {
            System.out.printf("%d ", temp.data);
            temp = temp.prev;
        }
        System.out.printf("%d ", temp.data);
    }

    public static void main(String[] args)
    {
 
        insertBegin(5);
 
       
        insertBegin(4);
 
       
        insertBegin(7);
 
        System.out.printf("Created circular doubly"
                          + " linked list is: ");
        display();
    }
}
