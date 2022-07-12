package boj_2577;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int num = a * b * c;
        int[] arr = new int[10];
        while (num != 0) {
            arr[num % 10]++;
            num /= 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}