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
        // check cycle in linked list
        boolean cyclic = detectCycleInLL(head);
        // remove the cycle loop from linkedList
        removeCycleLoopInLL(head);
    }

    private static boolean detectCycleInLL(Node head) {
        boolean isCycle = false;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow== fast) {
                isCycle = true;
            }
        }
        System.out.println(" Testing Cycle detected in the linkedlist ::::"+isCycle);
        return isCycle;
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
    public static void removeCycleLoopInLL(Node head){
        if (head == null || head.next == null) {
            return; // No cycle in an empty or single-node list
        }

        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
        System.out.println("Removing cycle in LL :");
    }

}
