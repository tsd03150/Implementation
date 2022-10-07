package boj_1076;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String color;
    int val;
    int num;

    Product(String color, int val, int num) {
        this.color = color;
        this.val = val;
        this.num = num;
    }
}

class Main {

    public static void main(String[] args) {
        ArrayList<Product> arr = new ArrayList<>();
        arr.add(new Product("black", 0, 1));
        arr.add(new Product("brown", 1, 10));
        arr.add(new Product("red", 2, 100));
        arr.add(new Product("orange", 3, 1000));
        arr.add(new Product("yellow", 4, 10000));
        arr.add(new Product("green", 5, 100000));
        arr.add(new Product("blue", 6, 1000000));
        arr.add(new Product("violet", 7, 10000000));
        arr.add(new Product("grey", 8, 100000000));
        arr.add(new Product("white", 9, 1000000000));

        Scanner kb = new Scanner(System.in);
        long answer = 0;
        String str1 = kb.next();
        for (Product tmp : arr) {
            if (str1.equals(tmp.color)) {
                answer = tmp.val * 10L;
            }
        }
        String str2 = kb.next();
        for (Product tmp : arr) {
            if (str2.equals(tmp.color)) {
                answer += tmp.val;
            }
        }
        String str3 = kb.next();
        for (Product tmp : arr) {
            if (str3.equals(tmp.color)) {
                answer *= tmp.num;
            }
        }
        System.out.println(answer);
    }
}