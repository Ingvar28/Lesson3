package ru.nosov;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Algorithm Task1
        //int[] AT1array = {1, 2, 3, 4, 2, 7, 8, 10};
        //System.out.println(Arrays.toString(AlgorithmTask.removeDigit(AT1array, 2)));

        //Algorithm Task 2
        //int[] AT2array = new int[10];
       // AlgorithmTask.Randomizer(AT2array, -20, 20);
        //AlgorithmTask.Print(AT2array);
        //System.out.println(AlgorithmTask.PositiveIntegerSum(AT2array));

        //Домашние задачи:


        //Lesson task 1
        System.out.println("Task1:");
        int[] example1 = {1, 2, 6, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(example1));
        LessonTasks.checkArraySorting(example1);

        //Lesson task 2
        System.out.println("Task2:");
//        LessonTasks.enterArrayFromKeyboard();

        //Lesson task 3
        System.out.println("Task3:");
        int[] example3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array original: " + Arrays.toString(example3));
        System.out.println("Mixed array: " + Arrays.toString(LessonTasks.reverseArrayValues(example3)) +"\n");

        //Lesson task 4
        System.out.println("Task4:");
        int[] example4 = {1, 5, 2, 1, 2, 4};
        System.out.println(LessonTasks.findUniqArrayValue(example4));

        //Lesson task 5
        System.out.println("Task5:");
        System.out.println(LessonTasks.findFibonachi());







    }


}
