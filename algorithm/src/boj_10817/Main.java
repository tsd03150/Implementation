package boj_10817;

import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
