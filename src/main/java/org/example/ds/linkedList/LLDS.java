package org.example.ds.linkedList;

public class LLDS {
    /**
     * LinkedList
     *      A LinkedList is a linear data structure where elements are stored in nodes, and each node points to the next node in the sequence.
     *      Unlike arrays, linked lists do not store elements in contiguous memory locations. This allows for efficient insertions and deletions.
     * Types of Linked Lists
     *      Singly Linked List: Each node points to the next node.
     *      Doubly Linked List: Each node points to both the next and the previous node.
     *      Circular Linked List: The last node points back to the first node.
     * Basic Operations
     *      Insertion: Adding a new node to the list.
     *      Deletion: Removing a node from the list.
     *      Traversal: Accessing each node in the list.
     *      Search: Finding a node with a specific value.
     *
     * */
    public static void main(String[] args) {
        SingleLLInsertPrint list = new SingleLLInsertPrint();
        list.insert(10);
        list.insert(22);
        list.insert(30);
        list.insert(52);
        list.insert(90);
        list.insert(67);
        list.insert(105);
        list.insert(220);
        list.insert(38974);
        list.insert(5564);
        list.insert(99);
        list.insert(89);
        list.print();

    }
}
