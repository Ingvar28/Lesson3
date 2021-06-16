package ru.nosov;

import java.util.Random;

public class AlgorithmTask {

    //Дан массив целых чисел и одно целое число,
    // удалите все вхождения этого числа из массива
    public static int[] removeDigit (int[] array, int digit) {

        int[] tmp = new int[array.length];

        int newIndex = 0;

        for (int i : array) {
            if (i != digit) {
                tmp[newIndex] = i;
                newIndex++;
            }
        }

        int[] result = new int[newIndex];
        for (int j = 0; j < result.length; j++) {
            result[j] = tmp[j];
        }

        return result;
    }

    public static int PositiveIntegerSum (int[] array) {

        int Sum = 0;

        for (int j:array) {
            if (j > 0) {
                Sum += j;
            }
        }

        //System.out.println(Sum);
        return Sum;

    }

    public static void Randomizer (int[] array, int low, int up) {
        var random = new Random();
        int bound = up - low;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + low;
        }

    }

    public static void Print (int[] array) {
        for (int j: array
             ) {
            System.out.print(" " + j);


        }
        System.out.println("\n");
    }


}
