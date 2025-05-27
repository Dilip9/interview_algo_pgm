package org.example.interviewedpgm;

import java.util.HashSet;
import java.util.LinkedList;

public class Epam {
    public static void main(String[] args) {
        String s = "abcabcabd"; // O/P: 4
        // find missing number from given an array .
        int[] num = {1,2,5,3,9,1,6,4,10,8};
        System.out.println((num));
        int n = s.length();
        int left=0, right = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(right<n){

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(max);

        // Insert Data into LinkedList.
//         LinkedList<String> list = new LinkedList<>();
//         list.add("A");
//         list.add("B");
//         list.add("C");
//         list.add("D");
//         removeNthNodeFromEnd(list, 2);
    }
//
//    private static Node removeNthNodeFromEnd(Node head, int i) {
//        Node dummy = new Node(0);
//        Node temp = dummy;
//        Node slow = head;
//        int counter =0;
//        int n = 5; // nth nod need to be deleted from end;
//        while (head !=null){
//            temp = head.next;
//            counter++;
//        }
//        if(counter - n == 0){
//            return temp.next;
//        }
//        for (int j = 0; j < counter - n; j++) {
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//
//        return head;
//    }

    public static int missingNumber(int[] num) {
        int n = num.length;
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return (total - sum)+1;
    }



}
