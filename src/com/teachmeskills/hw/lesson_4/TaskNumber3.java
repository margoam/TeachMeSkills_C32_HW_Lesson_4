package com.teachmeskills.hw.lesson_4;

import java.util.Arrays;

/**
 * Создайте 2 массива из 5 чисел.
 * Выведите массивы на консоль в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и
 * сообщите, для какого из массивов это значение оказалось больше (либо
 * сообщите, что их средние арифметические равны).
 */

public class TaskNumber3 {

    public static void TaskNumber3Runner(){

        int[] firstArray = new int[5];
        int[] secondArray = new int[5];

        int sumFirstArray = 0;
        int sumSecondArray = 0;

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 100);
            sumFirstArray += firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * 100);
            sumSecondArray += secondArray[i];
        }

        double firstArrayAverage = (double) sumFirstArray / firstArray.length;
        double secondArrayAverage = (double) sumSecondArray / secondArray.length;

        System.out.println("First array is: " + Arrays.toString(firstArray) +
                "\nThe average is: " + firstArrayAverage);
        System.out.println("Second array is: " + Arrays.toString(secondArray) +
                "\nThe average is: " + secondArrayAverage);

        if (firstArrayAverage > secondArrayAverage) {
            System.out.println("The arithmetic average of the first array is greater than the second");
        } else if (firstArrayAverage < secondArrayAverage) {
            System.out.println("The arithmetic average of the second array is greater than the first");
        } else {
            System.out.println("The arithmetic averages of both arrays are equal");
        }
    }
}
