package boj_2941;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        String[] cr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < cr.length; i++) {
            if (str.contains(cr[i])) {
                str = str.replaceAll(cr[i], " ");
            }
        }
        System.out.println(str.length());
    }
}