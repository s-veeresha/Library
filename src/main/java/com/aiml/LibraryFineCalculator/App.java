
package com.aiml.LibraryFineCalculator;

import java.util.Scanner;

public class App {

    public double calculateFine(int days) {

        if (days <= 0)
            return 0;

        else if (days <= 5)
            return days * 2;

        else
            return days * 5;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        App a = new App();

        System.out.println("Library Fine Calculator");
        System.out.print("Enter overdue days: ");

        int days = sc.nextInt();

        System.out.println("Fine Amount: Rs. " +
                           a.calculateFine(days));

        sc.close();
    }
}
