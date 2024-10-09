package com.teachmeskills.hw.lesson_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a task name to launch: Task0, Task1, Task2, Task3");
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();
        //Task 0
        switch (userChoice)
        {
            case("Task0"):
            {
                System.out.println("Task number 0 is launched.");
                TaskNumber0.TaskNumber0Runner();
                break;
            }
            case("Task1"):
            {
                System.out.println("Task number 1 is launched.");
                TaskNumber1.TaskNumber1Runner();
                break;
            }
            case("Task2"):
            {
                System.out.println("Task number 2 is launched.");
                TaskNumber2.TaskNumber2Runner();
                break;
            }
            default:
            {
                System.out.println("Incorrect task is selected. Please, try again.");
            }
        }
    }
}
