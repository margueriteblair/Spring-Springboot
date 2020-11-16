package com.margieblair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	// write your code here
        List<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(4);
        test.add(5);
        test.add(3);
        test.add(7);
        test.add(8);
        minimizeBias(test);
    }


    public static int minimizeBias(List<Integer> ratings) {
        // Write your code here
        Integer totalBias = 0;
        Integer[] ratingStream = ratings.stream().sorted().toArray(Integer[]::new);
        for (int i = 0; i < ratingStream.length - 1; i = i + 2) {
            totalBias = totalBias + (ratingStream[i+1] - ratingStream[i]);
        }
        System.out.println(totalBias);
        return totalBias;
    }
}
