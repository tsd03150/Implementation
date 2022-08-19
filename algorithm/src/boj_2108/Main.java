package boj_2108;

import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        int cnt = 0;
        int max = -1;
        int mod = arr[0];
        boolean flag = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                cnt++;
            } else {
                cnt = 0;
            }

            if (max < cnt) {
                max = cnt;
                mod = arr[i];
                flag = true;
            } else if (max == cnt && flag) {
                mod = arr[i];
                flag = false;
            }
        }
        System.out.println(Math.round(sum / n));
        System.out.println(arr[(n - 1) / 2]);
        System.out.println(mod);
        System.out.println(arr[n - 1] - arr[0]);
    }
}