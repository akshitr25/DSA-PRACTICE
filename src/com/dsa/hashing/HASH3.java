package com.dsa.hashing;

import java.util.*;

public class HASH3 {
    public static int countSubarraysOptimized(int[] arr, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        int sum = 0, count = 0;
 
        prefixSumCount.put(0, 1);
 
        for (int num : arr) {
            sum += num;
 
            if (prefixSumCount.containsKey(sum - k)) {
                count += prefixSumCount.get(sum - k);
            }
 
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }
 
        return count;
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println("Number of subarrays with sum " + k + ": " + countSubarraysOptimized(arr, k));
    }
}
