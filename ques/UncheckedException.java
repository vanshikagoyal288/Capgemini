package exception.practiceproblems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.close();
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getLocalizedMessage());
        } 
    }
}
