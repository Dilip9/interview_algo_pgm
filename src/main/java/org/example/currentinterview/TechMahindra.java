package org.example.currentinterview;

import java.util.Arrays;
import java.util.stream.Stream;

public class TechMahindra {

    //private User user;

    public static void main(String[] args){

        int [] arr = {3,0,2,0,0,5,4,0,1,0};
        sortNumberwithaddingZeroAtLast(arr);

    }
    public static void sortNumberwithaddingZeroAtLast(int [] unsortedarr){
        int countNonZero=0;
        for(int i=0;i<unsortedarr.length;i++){
            if(unsortedarr[i] !=0){
                unsortedarr[countNonZero++] = unsortedarr[i];
            }
        }
        Arrays.sort(unsortedarr, 0, countNonZero);
        int totalzero = unsortedarr.length - countNonZero;
        for(int i=0;i<totalzero;i++){
            unsortedarr[countNonZero++] = 0;
        }
        Arrays.stream(unsortedarr).forEach(System.out::println);


    }


}
