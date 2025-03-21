package org.example.interviewedpgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Iris {

    //output: 2,6,8,-1,2,7,-1,9,4,5
    public static void main(String[] args) {
        int[] num = {1, 2, 6, 8, 2, 7, 3, 9, 4, 5};
        int[] result = printNextGreaterElement(num);
        System.out.println("::"+ Arrays.toString(result));
    }
    public static int[] printNextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return result;
    }
}
