package task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter average books read per month (v): ");
        int v = input.nextInt();

        System.out.print("Enter number of visitors per year (n): ");
        int n = input.nextInt();

        double k = (v * 12.0) / n;

        System.out.println("Average number of books read per visitor per year: " + k);
    }
}