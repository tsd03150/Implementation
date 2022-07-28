package boj_2775;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Man implements Comparable<Man>{
    int w;
    int h;
    int r;
    int o;

    Man(int w, int h, int o) {
        this.w = w;
        this.h = h;
        this.o = o;
    }

    @Override
    public int compareTo(Man o) {
        if (this.w == o.w) {
            return o.h - this.h;
        } else {
            return o.w - this.w;
        }
    }
}

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Man> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int w = kb.nextInt();
            int h = kb.nextInt();
            arr.add(new Man(w, h, i));
        }

        Collections.sort(arr);
        int preWeight = arr.get(0).w;
        int preHeight = arr.get(0).h;
        int rank = 1;
        arr.get(0).r = rank;
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (preHeight > arr.get(i).h && preWeight > arr.get(i).w) {
                preHeight = arr.get(i).h;
                preWeight = arr.get(i).w;
                arr.get(i).r = ++rank + cnt;
                cnt = 0;
            } else {
                arr.get(i).r = rank;
                cnt++;
            }
        }
    }
}
