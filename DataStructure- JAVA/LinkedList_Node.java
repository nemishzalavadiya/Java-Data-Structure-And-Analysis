import java.util.*;

public class LinkedList_Node {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        int k = s.nextInt();
        if(n!=0)
        addAtEnd(k);
        else{
            head=new Node(k);
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to add the element at the end of the list
    static void addAtEnd(int k) {
        // Write your code here
        Node temp = head;
        while(temp.next!=null)temp=temp.next;
        temp.next=new Node(k);
    }
}
