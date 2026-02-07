package exception.practiceproblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("exception\\files\\hello.txt"))) {
            String firstLine = br.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
