package Methods.level1;

import java.util.Scanner;

public class Q3 {

    static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;   // 5 km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);

        System.out.println("Number of rounds to complete 5 km: " + rounds);
    }
}

