/*
 *  UCF COP3330 Summer 2021 Exercise 5 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int num1 = myApp.readNum("first");
        int num2 = myApp.readNum("second");

        String output = myApp.generateOutputString(num1, num2);
        myApp.displayOutput(output);
    }

    public int readNum(String ordinalNumber) {
        System.out.printf("What is the %s number? ", ordinalNumber);
        return Integer.parseInt(in.nextLine());
    }

    public String generateOutputString(int num1, int num2) {
        return String.format("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d%n",
                num1, num2, num1 + num2, num1, num2, num1 - num2,
                num1, num2, num1 * num2, num1, num2, num1 / num2);
    }

    public void displayOutput(String output) {
        System.out.println(output);
    }
}
