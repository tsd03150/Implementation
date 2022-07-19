package boj_1316;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        int answer = 0;

        while (t-- > 0) {
            char[] ch = kb.next().toCharArray();
            ArrayList<Character> arr = new ArrayList<>();
            arr.add(ch[0]);
            boolean flag = false;
            for (int i = 1; i < ch.length; i++) {
                if (!arr.contains(ch[i])) {
                    arr.add(ch[i]);
                } else {
                    if (ch[i - 1] != ch[i]) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}