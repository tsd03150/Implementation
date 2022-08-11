package boj_10757;

import java.math.BigInteger;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        BigInteger num1 = kb.nextBigInteger();
        BigInteger num2 = kb.nextBigInteger();
        System.out.println(num1.add(num2));
    }
}
