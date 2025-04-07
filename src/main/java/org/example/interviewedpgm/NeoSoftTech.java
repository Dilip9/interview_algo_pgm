package org.example.interviewedpgm;

public class NeoSoftTech {

    public static void main(String[] args) {
        System.out.println("Hello, NeoSoft Tech!");
        // convert given number into bit format.
        int number = 15;
        // convertToBinary(number);
        System.out.println("Binary format of " + number + " is: " + convertToBinary(number));
        System.out.println("Binary format of without using StringBuilder " + number + " is: " + convertToBinarys(number));
    }
    public static String convertToBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2;
            binary.insert(0, remainder);
            number = number / 2;
        }
        return binary.toString();
    }

    public static String convertToBinarys(int number) {
        int numbers =0;
        while (number > 0) {
            int remainder = number % 2;
            //binary.insert(0, remainder);
            numbers = numbers + remainder;
            number = number / 2;
        }
        return numbers+"";
    }
}
