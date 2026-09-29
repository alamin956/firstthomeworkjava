import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        System.out.print("Enter price per square unit: ");
        double price = input.nextDouble();

        double area = length * width;
        double totalArea = area * 1.05;
        double totalCost = totalArea * price;

        System.out.println("Total cost: " + totalCost);
    }
}