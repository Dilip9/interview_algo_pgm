package org.example.ds.linkedList;

public class SingleLLInsertPrint {
    SinglyLinkedNode head;

    public void insert(int data){
        SinglyLinkedNode newNode = new SinglyLinkedNode(data);
        if(head == null){
            head = newNode;
            return ;
        }
        SinglyLinkedNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print(){
        SinglyLinkedNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
