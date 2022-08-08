package boj_1193;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        if (num == 1) {
            System.out.println("1/1");
        } else {
            int cnt = 2;
            int up = 1;
            int down = 1;
            while (num - cnt > 1) {
                num -= cnt;
                cnt++;
            }

            if (cnt % 2 == 0) {
                down = cnt;
                for (int i = 2; i < num; i++) {
                    down--;
                    up++;
                }
            } else {
                up = cnt;
                for (int i = 2; i < num; i++) {
                    up--;
                    down++;
                }
            }
            System.out.println(up + "/" + down);
        }
    }
}