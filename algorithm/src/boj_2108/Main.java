package boj_2108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Number implements Comparable<Number>{
    int num;
    int cnt;

    Number(int num, int cnt) {
        this.num = num;
        this.cnt = cnt;
    }

    @Override
    public int compareTo(Number o) {
        if (this.cnt == o.cnt) {
            return this.num - o.num;
        } else {
            return o.cnt - this.cnt;
        }
    }
}

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Math.round(sum / (double)n));
        System.out.println(arr[n / 2]);

        ArrayList<Number> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            boolean flag = false;
            for (int j = 0; j < tmp.size(); j++) {
                if (tmp.get(j).num == num) {
                    tmp.get(j).cnt++;
                    flag = true;
                }
            }
            if (!flag) {
                tmp.add(new Number(num, 0));
            }
        }
        Collections.sort(tmp);
        int min = tmp.get(0).num;
        int cnt = tmp.get(0).cnt;
        boolean flag = false;
        for (int i = 1; i < tmp.size(); i++) {
            if (cnt == tmp.get(i).cnt && min < tmp.get(i).num) {
                System.out.println(tmp.get(i).num);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(min);
        }
        int f = arr[0];
        int e = arr[n - 1];
        if (f == e) {
            System.out.println("0");
        } else if (f < 0 && e > 0) {
            System.out.println(Math.abs(f) + Math.abs(e));
        } else {
            System.out.println(Math.abs(f - e));
        }
    }
}