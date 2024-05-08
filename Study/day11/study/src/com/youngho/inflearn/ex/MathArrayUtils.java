package com.youngho.inflearn.ex;

public class MathArrayUtils {

    private MathArrayUtils() {}

    public static int sum(int[] array) {
        int sum = 0;

        if (array.length == 0) return -1;
        else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static double average(int[] array) {
        double aver = 0;

        if (array.length == 0) return -1;
        else {
            for (int i = 0; i < array.length; i++) {
                aver += (double) array[i];
            }
            aver = aver / array.length;
        }
        return aver;
    }

    public static int min(int[] array) {
        int min = 0;

        if (array.length == 0) return -1;
        else {
            min = array[0];
            for (int i : array) {
                if (min > i) {
                    min = i;
                }
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = 0;

        if (array.length == 0) return -1;
        else {
            max = array[0];
            for (int i : array) {
                if (max < i) {
                    max = i;
                }
            }
        }
        return max;
    }
}
