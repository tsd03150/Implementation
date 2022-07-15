package boj_15596;

import java.util.Scanner;

class Test {
    public long sum(int[] a) {
        long ans = 0;
        for (long num : a) {
            ans += num;
        }
        return ans;
    }

    public static void main(String[] args) {
        Test T = new Test();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.sum(arr));
    }
}