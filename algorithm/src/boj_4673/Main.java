package boj_4673;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 10000; i++) {
            int sum = i;
            char[] c = String.valueOf(i).toCharArray();
            for (int j = 0; j < c.length; j++) {
                sum += c[j] - '0';
            }
            arr.add(sum);
        }

        for (int i = 1; i < 10000; i++) {
            if (!arr.contains(i)) {
                System.out.println(i);
            }
        }
    }
}