package com.teachmeskills.hw.lesson_4;

import java.util.Scanner;

public class TaskNumber0 {
    /*0. Создайте массив целых чисел. Напишете программу, которая выводит
    сообщение о том, входит ли заданное число в массив или нет.
    Пусть число для поиска задается с консоли (класс Scanner). */
    
    public static void TaskNumber0Runner(){
        int[] integerArray = {14, -5, -123, -34, 44, 6, 87, 45, 35, 3};
        System.out.println("Please, enter a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        boolean isArrayContainsEnteredNumber = false;

        for (int i = 0; i < integerArray.length; i++){
            if (userInput == integerArray[i])
            {
                isArrayContainsEnteredNumber = true;
                break;
            }
        }

        if (isArrayContainsEnteredNumber)
        {
            System.out.println("The array contains the entered number");
        }
        else {
            System.out.println("The array doesn't contain the entered number");
        }
    }
}
