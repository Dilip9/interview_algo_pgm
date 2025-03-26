package org.example.interviewedpgm;

public class LinkedListPgm {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(23);
        //print node from first to last.
        traverseLinkedList(head);
        // Reverse linkedlist.
        reverseLinkedList(head);
    }
    public static void traverseLinkedList(Node head){
        while(head != null){
            System.out.println(":::: node data :: "+head.val+" address :"+head.next);
            head = head.next;
        }
    }
    public static void reverseLinkedList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        //return prev;
        Node temp = prev;
        while(temp!=null){
            System.out.println(":::: node data :: "+temp.val+" address :"+temp.next);
            temp = temp.next;
        }
    }

}
class Node {
    int val;
    Node next;

    Node(int new_data){
        this.val=new_data;
        this.next = null;

    }
}