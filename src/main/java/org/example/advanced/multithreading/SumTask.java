package org.example.advanced.multithreading;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer> {

    private final int  nums;
    public SumTask(int nums) {
        this.nums = nums;
    }

    @Override
    public Integer call() throws Exception{
        int sum = 0;
        for(int i=0;i<nums;i++){
            sum += i;
            Thread.sleep(100);
        }
        return sum;
    }
}
