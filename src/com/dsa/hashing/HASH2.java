package com.dsa.hashing;

class HASH2 {
    static int[] prefixSum(int[] nums) {
        int n = nums.length-1;
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }
 
    static int optimizedSum(int[] prefix, int l, int r) {
        return prefix[r] - prefix[l - 1];
    }
 
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] prefix = prefixSum(nums);
 
        int l = 3, r = 7; // Example range [l, r]
        System.out.println("Array: ");
        for(int i:nums)
        	System.out.print(i+" ");
        System.out.println("\nPrefix Sum: ");
        int psum[]=prefixSum(nums);
        for(int i=1;i<psum.length;i++)
        	System.out.print(psum[i]+" ");
        System.out.println("\nOptimized Sum: " + optimizedSum(prefix, l, r));
    }
}