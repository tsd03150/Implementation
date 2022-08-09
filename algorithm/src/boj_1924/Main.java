package boj_1924;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int mon = kb.nextInt();
        int day = kb.nextInt();
        int[] mArr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] mDay = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int sum = day;
        for (int i = 0; i < mon; i++) {
            sum += mArr[i];
        }
        System.out.println(mDay[sum % 7]);
    }
}