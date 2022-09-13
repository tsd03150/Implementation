package boj_10886;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[2];
        for (int i = 0; i < n; i++) {
            int num = kb.nextInt();
            arr[num]++;
        }
        if (arr[0] > arr[1]) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }
    }
}