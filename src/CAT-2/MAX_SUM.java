//Max Equilibrium Sum

import java.util.Scanner;

class MES {
    public static int getMaxEquilibriumSumOptimized(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        int maxSum = Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
        totalSum += arr[i];
        }       
        for (int i = 0; i < arr.length; i++) {
           
            totalSum -= arr[i];   
            if (leftSum == totalSum && leftSum > maxSum) {
                maxSum = leftSum;
            }
            leftSum += arr[i];
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < n; i++) {
            // reading array elements from the user
            arr[i] = sc.nextInt();
        }
        int maxSum = getMaxEquilibriumSumOptimized(arr);
        System.out.println("Max Equilibrium Sum : " + maxSum);
        sc.close();
    }
}
