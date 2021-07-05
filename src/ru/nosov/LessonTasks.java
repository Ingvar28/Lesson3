package ru.nosov;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LessonTasks {
    //Task1
    public static String checkArraySorting(int[] array) {

        boolean state = true;

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            //System.out.println("i: " + array[i]);
            //System.out.println("i+1: " + array[i+1]);

            if (array[i] > array[i+1]) {
                state = false;
                break;
            }
        }
        //System.out.println("State after FOR: " + state);

        if (state == false) {
            System.out.println("Please, try again");
            return "Please, try again";
        } else {
            System.out.println("OK - array is sorted well");
            return "OK";
        }
    }

    //Task2
    public static void enterArrayFromKeyboard() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("Введите " + i + " элемент массива");
            array[i] = scanner.nextInt();
        }

        System.out.println("Результат: " + Arrays.toString(array));
    }

    //Task3
    public static int[] reverseArrayValues(int[] array) {
        int first = array[0];
        int last = array[array.length-1];

        array[0] = last;
        array[array.length-1] = first;

        return array;


    }
    //Task4
    public static int findUniqArrayValue(int[] array) {
        int[] sortedArray = array;
        int uniq = 0;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                /* если пара соседних элементов имеет неправильный порядок, он меняет их местами */
                if (array[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        for (int i = 1; i < sortedArray.length -1; i++) {
            if (array[i-1] < array[i] && array[i] < array[i+1]) {
                uniq = array[i];
                break;
            }
        }

        System.out.println("Uniq state: " + uniq);
        return uniq;
    }
    //task5
    public static int findFibonachi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N > 0 для расчета N-го числа Фибоначи");
        int n = scanner.nextInt();


        int[] array = new int[n];
        int fibonachi = 0;

        if (n > 0 && n != 0 && n != 1) {
            for (int i = 0; i < n; i++) {
                array[i] = i;
            }
            fibonachi = array[n-2]+ array[n-1];

        }else if (n == 0) {
            fibonachi = 0;

        }else  if(n ==1) {
            fibonachi = 1;

        }
            return fibonachi;
    }

    //task6
    public static void task6() {

    }
    //task7
    public static void task7() {

    }

}
