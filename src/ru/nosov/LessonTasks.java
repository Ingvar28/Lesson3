package ru.nosov;

import java.util.Arrays;
import java.util.Scanner;

public class LessonTasks {

    public static void task1(int[] array) {

        boolean state = true;

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;


            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    state = false;
                    break;
                } else {
                    continue;
                }

            }

//            if (state = true) {
//                System.out.println("OK");
//            } else {
//                System.out.println("Please, try again");
//                break;
//            }

        }

    }


    public static void task2() {

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


    public static int[] task3(int[] array) {
        int first = array[0];
        int last = array[array.length-1];

        array[0] = last;
        array[array.length-1] = first;

        return array;


    }

    public static void task4() {


    }

    public static void task5() {

    }

    public static void task6() {

    }

    public static void task7() {

    }

}
