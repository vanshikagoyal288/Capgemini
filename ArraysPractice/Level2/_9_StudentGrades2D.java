import java.util.Scanner;

public class _9_StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            double p = sc.nextDouble();
            double c = sc.nextDouble();
            double m = sc.nextDouble();

            if (p < 0 || c < 0 || m < 0) {
                i--;
                continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;

            double total = p + c + m;
            percentages[i] = (total / 300.0) * 100;

            if (percentages[i] >= 90) grades[i] = 'A';
            else if (percentages[i] >= 80) grades[i] = 'B';
            else if (percentages[i] >= 70) grades[i] = 'C';
            else if (percentages[i] >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2] + 
                               " | Percentage: " + percentages[i] + "% | Grade: " + grades[i]);
        }
    }
}