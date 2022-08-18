package boj_2108;

import java.util.*;

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
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Number> tmp = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int num = kb.nextInt();
            sum += num;
            if (arr.contains(num)) {
                boolean flag = false;
                for (Number number : tmp) {
                    if (number.num == num) {
                        flag = true;
                        number.cnt++;
                    }
                }
                if (!flag) {
                    tmp.add(new Number(num, 1));
                }
            }
            arr.add(num);
        }
        Collections.sort(arr);
        // 평균값
        System.out.println(Math.round(sum / (double) n));
        // 중앙값
        System.out.println(arr.get(n / 2));
        // 최빈값
        if (tmp.size() == 0) {
            if (arr.size() == 1) {
                System.out.println(arr.get(0));
            } else {
                System.out.println(arr.get(1));
            }
        } else if (tmp.size() == 1) {
            System.out.println(tmp.get(0).num);
        } else {
            Collections.sort(tmp);
            int num = tmp.get(0).num;
            int max = tmp.get(0).cnt;
            boolean flag = false;
            int idx = 0;
            for (int i = 1; i < tmp.size(); i++) {
                if (max == tmp.get(i).cnt && num < tmp.get(i).num) {
                    flag = true;
                    idx = i;
                    break;
                }
            }
            if (flag) {
                System.out.println(tmp.get(idx).num);
            } else {
                System.out.println(num);
            }
        }
        // 범위 값
        int a = arr.get(0);
        int b = arr.get(n - 1);
        if (a < 0 && b < 0) {
            System.out.println(Math.abs(a) - Math.abs(b));
        } else if (a >= 0 && b > 0) {
            System.out.println(Math.abs(a - b));
        } else {
            System.out.println(Math.abs(a) + Math.abs(b));
        }
    }
}