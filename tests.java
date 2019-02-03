package com.hit.demo;


import java.util.Scanner;

/**
 * Created by lao_to on 2019/1/20.
 */
public class tests {
    public static void main(String[] args) {
        long sum = summation(100);

    }

    private static int summation(int num) {// 递归加循环

        int sum = 0;
        if (num == 1) {
            return 1;
        } else {
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            return sum + summation(num - 1);
        }
    }
}