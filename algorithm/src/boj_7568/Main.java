package boj_7568;

import java.util.ArrayList;
import java.util.Scanner;

class Human {
    int w;
    int h;
    int r;

    Human(int w, int h) {
        this.w = w;
        this.h = h;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Human> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            arr.add(new Human(a, b));
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr.get(j).w > arr.get(i).w && arr.get(j).h > arr.get(i).h) {
                    rank++;
                }
            }
            arr.get(i).r = rank;
        }

        for (Human h : arr) {
            System.out.print(h.r + " ");
        }
    }
}