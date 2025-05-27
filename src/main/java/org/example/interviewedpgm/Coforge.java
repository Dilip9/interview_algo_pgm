package org.example.interviewedpgm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Coforge {
    public static void main(String[] args) {

        int target = 40;
        List<Integer> lst = Arrays.asList(3,6,9,11,13,16,20,22,25,28,30,32,35,37,40);
        lst.stream().filter(n -> n >target)
                .min(Comparator.comparingInt(n -> Math.abs(n - target))).ifPresent(n -> {System.out.println("Closest number to " + target + " is: " + n);});
    }
}
