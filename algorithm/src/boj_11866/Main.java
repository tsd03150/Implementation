package boj_11866;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            Q.offer(i);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (!Q.isEmpty()) {
            for (int i = 0; i < k; i++) {
                if (i == k - 1) {
                    arr.add(Q.poll());
                } else {
                    Q.offer(Q.poll());
                }
            }
        }
        System.out.print("<");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr.get(i));
            } else {
                System.out.print(arr.get(i) + ", ");
            }
        }
        System.out.print(">");
    }
}