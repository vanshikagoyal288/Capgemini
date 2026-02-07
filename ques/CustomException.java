package exception.practiceproblems;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String age) {
        super(age);
    }
}

public class CustomException {

    static void validateAge(int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("age must be 18 years old or above");
        }
        System.out.println("access granted");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int age = sc.nextInt();
            CustomException.validateAge(age);
            sc.close();
        } catch (InvalidAgeException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (InputMismatchException e)  {
            System.out.println("age should must me number");
        }
    }
}
