package boj_2920;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = kb.nextInt();
        }
        if (arr[0] == 1) {
            for (int i = 1; i < 8; i++) {
                if (arr[i] != i + 1) {
                    System.out.println("mixed");
                    System.exit(0);
                }
            }
            System.out.println("ascending");
        } else if (arr[0] == 8) {
            for (int i = 8; i > 0; i--) {
                if (arr[8 - i] != i) {
                    System.out.println("mixed");
                    System.exit(0);
                }
            }
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}