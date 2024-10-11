package com.teachmeskills.hw.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Создайте массив целых чисел. Удалите все вхождения заданного
 * числа из массива.
 * Пусть число задается с консоли (класс Scanner). Если такого числа нет -
 * выведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */

public class TaskNumber1 {

    public static void TaskNumber1Runner() {

        int[] integerArray = {14, -5, -123, -34, 44, 6, 87, 45, 35, 3, 45};
        System.out.println("Please enter the number to be removed from the array: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int counter = 0;

        for (int j : integerArray) {
            if (userInput == j) {
                counter++;
            }
        }
        int[] newArray = new int[integerArray.length - counter];
        int newArrayIndex = 0;

        for (int j : integerArray) {
            if (j != userInput) {
                newArray[newArrayIndex] = j;
                newArrayIndex++;  // index for a new array
            }
        }

        if (newArray.length != integerArray.length) {
            System.out.println("Initial array is: " + Arrays.toString(integerArray));
            System.out.println("New array is: " + Arrays.toString(newArray));
        } else {
            System.out.println("The array isn't changed.");
        }
    }
}
