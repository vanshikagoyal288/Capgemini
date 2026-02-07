package exception.practiceproblems;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        //System.out.println();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("enter an index : " );
        int k = sc.nextInt();
        sc.close();
        try {
            System.out.println("element at index " + k +" is :" + arr[k]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (NullPointerException e) {
            System.out.println("array is null");
        }
    }
}
