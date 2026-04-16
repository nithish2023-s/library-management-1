package com.library;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter number of books issued: ");
        int booksCount = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] books = new String[booksCount];
        for (int i = 0; i < booksCount; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            books[i] = scanner.nextLine();
        }

        System.out.print("Enter number of days borrowed: ");
        int daysBorrowed = scanner.nextInt();

        int allowedDays = 14;
        int finePerDay = 10;
        int fine = calculateFine(daysBorrowed, allowedDays, finePerDay);

        System.out.println("\n--- Borrowing Status ---");
        System.out.println("User: " + name + " (ID: " + id + ")");
        System.out.println("Books Borrowed:");
        for (String book : books) {
            System.out.println("- " + book);
        }
        System.out.println("Total Fine: Rs. " + fine);
        
        scanner.close();
    }

    public static int calculateFine(int daysBorrowed, int allowedDays, int finePerDay) {
        if (daysBorrowed > allowedDays) {
            return (daysBorrowed - allowedDays) * finePerDay;
        }
        return 0;
    }
}
