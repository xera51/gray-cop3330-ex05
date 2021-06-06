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
        int[] answers = myApp.performOperations(num1, num2);

        String output = myApp.generateOutputString(num1, num2, answers);
        myApp.displayOutput(output);
    }

    public int readNum(String ordinalNumber) {
        System.out.printf("What is the %s number? ", ordinalNumber);
        String input = in.nextLine();

        return Integer.parseInt(input);
    }

    public int[] performOperations(int num1, int num2) {
        int[] answers = new int[4];

        answers[0] = num1 + num2;
        answers[1] = num1 - num2;
        answers[2] = num1 * num2;
        answers[3] = num1 / num2;

        return answers;
    }

    public String generateOutputString(int num1, int num2, int[] answers) {
        return String.format("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d%n",
                num1, num2, answers[0], num1, num2, answers[1],
                num1, num2, answers[2], num1, num2, answers[3]);
    }

    public void displayOutput(String output) {
        System.out.println(output);
    }
}
