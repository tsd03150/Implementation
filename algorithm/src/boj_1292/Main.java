package boj_1292;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int[] arr = new int[1001];

        int cnt = 0;
        int num = 1;
        for (int i = 1; i <= 1000; i++) {
            arr[i] = num;
            cnt++;
            if (cnt == num) {
                num++;
                cnt = 0;
            }
        }
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}