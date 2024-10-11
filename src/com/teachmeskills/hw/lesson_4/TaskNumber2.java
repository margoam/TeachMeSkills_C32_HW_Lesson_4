package com.teachmeskills.hw.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  2. Создайте и заполните массив случайным числами и выведете
 *максимальное, минимальное и среднее значение.
 *Для генерации случайного числа используйте метод Math.random().
 *Пусть будет возможность создавать массив произвольного размера.
 *Пусть размер массива вводится с консоли.
 */

public class TaskNumber2 {

    public static void TaskNumber2Runner(){

        System.out.println("Please enter the length of an array: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int[] integerArray = new int[userInput];

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = (int) (Math.random() * 100);
        }

        System.out.println("Newly created array is: " + Arrays.toString(integerArray));
        System.out.println("Max number is: " + Arrays.stream(integerArray).max().getAsInt());
        System.out.println("Min number is: " + Arrays.stream(integerArray).min().getAsInt());
        System.out.println("Average number is: " + Arrays.stream(integerArray).average().getAsDouble());
    }
}
