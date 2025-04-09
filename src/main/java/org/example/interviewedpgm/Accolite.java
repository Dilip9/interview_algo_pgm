package org.example.interviewedpgm;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Accolite {

    public static void main(String[] args) {

        String str = "I Love Java programming";
        str.replaceAll("\\s","").chars()
                .mapToObj(ch ->(char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(ch -> ch.getValue()>1)
                .forEach((k) -> System.out.println("key "+k.getKey()+ " value : "+k.getValue()));

        //Write SQL query to fetch 3rd highest salary from employee table with and without using subquery, limit offset;
        //select Distinct salary from employee order by salary desc limit 1 offset (N-1);
        //Check 3rd highest salary.
        //example: select Distinct salary from employee order by salary desc limit 1 offset 2;
        // Using DENSE_RANK
        //select salary from (Select, dense_rank() over (order by salary desc ) as rank from employees ) ranked where rank = N;

        // 2nd Round Interview Questions
        int[] arr = {1, 2, 3, 7, 8, 9, 4, 5};
        int target = 15;
        int[] result = consicutivieSum(arr, target);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] consicutivieSum(int[] arr, int target) {
        int sum = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum > target) {
                sum -= arr[start++];
            }
            if (sum == target) {
                return new int[]{start, i};
            }
        }
        return new int[]{-1, -1}; // Not found
    }

}
