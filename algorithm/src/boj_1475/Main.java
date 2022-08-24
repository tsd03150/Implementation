package boj_1475;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] arr = kb.next().toCharArray();
        int[] nums = new int[9];
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i] - '0';
            if (tmp == 9) {
                nums[6]++;
            } else {
                nums[tmp]++;
            }
        }
        if (nums[6] % 2 == 0) {
            nums[6] /= 2;
        } else {
            nums[6] = nums[6] / 2 + 1;
        }

        int max = Integer.MIN_VALUE;
        for (int ob : nums) {
            max = Math.max(max, ob);
        }
        System.out.println(max);
    }
}