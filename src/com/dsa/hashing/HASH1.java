package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
 
public class HASH1 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1, 1, 2, 3, 3, 3};
 
        Map<Integer, Integer> mp = new HashMap<>();
        int maxiFreq = Integer.MIN_VALUE, maxiElement = arr[0];
        int miniFreq = Integer.MAX_VALUE, miniElement = arr[0];
 
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
 
        for (Map.Entry<Integer, Integer> num : mp.entrySet()){
            if (num.getValue() >= maxiFreq){
                maxiFreq = num.getValue();
                maxiElement = num.getKey();
            }
            if (num.getValue() <= miniFreq){
                miniFreq = num.getValue();
                miniElement = num.getKey();
            }
        }
 
 
 
        System.out.println("Max frequency element: " + maxiElement + " with frequency: " + maxiFreq);
        System.out.println("Min frequency element: " + miniElement + " with frequency: " + miniFreq);
    }
}