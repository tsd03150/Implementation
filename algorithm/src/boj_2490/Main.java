package boj_2490;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();

        while (kb.hasNextInt()) {
            int[] arr = new int[2];
            for (int i = 0; i < 4; i++) {
                int num = kb.nextInt();
                arr[num]++;
            }
            switch (arr[0]) {
                case 1:
                    answer.append("A" + "\n");
                    break;
                case 2:
                    answer.append("B" + "\n");
                    break;
                case 3:
                    answer.append("C" + "\n");
                    break;
                case 4:
                    answer.append("D" + "\n");
                    break;
                default:
                    answer.append("E" + "\n");
            }
        }
        System.out.println(answer);
    }
}