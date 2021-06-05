/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Retirement_Calculator {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Retirement_Calculator myApp = new Retirement_Calculator();
        myApp.retirementYear();
    }

    private int agePrompt() {
        System.out.print("What is your current age? ");
        return Integer.parseInt(in.nextLine());
    }

    private int retirePrompt() {
        System.out.print("At what age would you like to retire? ");
        return Integer.parseInt(in.nextLine());
    }

    private int yearsLeft(int age, int ret) {
        System.out.println("You have " + (ret - age) + " left until you can retire.");
        return ret - age;
    }

    private void retirementYear() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        System.out.println("It's " + format.format(date) + ", so you can retire in ");
    }
}
