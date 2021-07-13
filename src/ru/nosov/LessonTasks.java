package ru.nosov;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class LessonTasks {

    //Task1
    /*
        Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
        Если он отсортирован по возрастанию то выводится “OK”, если нет,
        то будет выводиться текст “Please, try again”
         */
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
    /*
    Напишите программу, которая считывает с клавиатуры длину массива
    (например, пользователь вводит цифру 4),
    затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов.
    Пример вывода:

   Array length: 4
   Numbers of array:
   5
   6
   7
   2
   Result: [5, 6, 7, 2]

     */
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
    /*
    Напишите метод, который меняет местами первый и последний элемент массива.
    Пример вывода:
    Array 1: [5, 6, 7, 2]
    Array 2: [2, 6, 7, 5]
     */

    public static int[] reverseArrayValues(int[] array) {
        int first = array[0];
        int last = array[array.length-1];

        array[0] = last;
        array[array.length-1] = first;

        return array;


    }
    //Task4
    /*
    Дан массив чисел. Найдите первое уникальное в этом массиве число.
    Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
     */
    public static int findUniqueArrayValue(int[] array) {
        int firstUniqueValue = 0;
        int uniqueIndex;
        int[] uniqueIndexList = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            Arrays.fill(uniqueIndexList, 0);

            for (int j = 0; j < array.length; j++) {

                if (i != j && array[i] == array[j])
                    uniqueIndexList[j] = 1;
            }
            //Посмотреть массив сравнения уникальности для каждого элемента исходного массива
            //System.out.println(Arrays.toString(uniqueIndexList));

            uniqueIndex = 0;

            for (int k = 0; k < uniqueIndexList.length; k++) {

                uniqueIndex += uniqueIndexList[k];

            }
            if (uniqueIndex == 0) {
                firstUniqueValue = array[i];
                break;
            }
        }
        if (firstUniqueValue == 0)
            System.out.println("No unique values in array");
        return firstUniqueValue;
    }

    //task5
    /*
    Вычислить N-е число Фибоначчи. Не использовать рекурсию и массивы, только циклы.
     */
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
    /*
    Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.
     */
    public static int[] fillArrayRandomValues(int[] array, int lowerEdge, int upperEdge) {
        var random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperEdge - lowerEdge);
        }
        return mergesort(array);

    }

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }


    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }


    //task7
    /*
    ***Дан массив и число K. Найдите первые K самых часто встречающихся
    элементов.
     */
    public static int[] findKUniqueArrayValue(int[] array, int K) {
        int[] uniqueValues = new int[array.length];
        int uniqueIndex;
        int uniqueValue;
        int[] uniqueIndexList = new int[array.length];
        int[] result = new int[uniqueValues.length];

        for (int i = 0; i < array.length; i++) {
            Arrays.fill(uniqueIndexList, 0);

            for (int j = 0; j < array.length; j++) {

                if (i != j && array[i] == array[j])
                    uniqueIndexList[j] = 1;
            }
            //Посмотреть массив сравнения уникальности для каждого элемента исходного массива
            System.out.println(Arrays.toString(uniqueIndexList));

            uniqueIndex = 0;

            for (int k = 0; k < uniqueIndexList.length; k++) {

                uniqueIndex += uniqueIndexList[k];
            }

            if (uniqueIndex == 0) {
                uniqueValue = array[i];
                for (int j = i; j < array.length - 1; j++) {
                    uniqueValues[j] = uniqueValue;
                }
                uniqueValue = 0;
            }

        }
        System.out.println("Array " +  Arrays.toString(uniqueValues));
        for (int i = 0; i <= K - 1; i++) {
            result[i] = uniqueValues[i];
        }

        return result;
    }



}