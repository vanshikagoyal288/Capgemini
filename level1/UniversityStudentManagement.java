public class UniversityStudentManagement {

    static class Student {

        static String universityName = "Chitkara University";
        static int totalStudents = 0;

        String name;
        final int rollNumber;
        char grade;

        Student(String name, int rollNumber, char grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
            totalStudents++;
        }

        static void displayTotalStudents() {
            System.out.println("Total Students " + totalStudents);
        }

        void display(Object obj) {
            if (obj instanceof Student) {
                Student s = (Student) obj;
                System.out.println(universityName);
                System.out.println(s.name);
                System.out.println(s.rollNumber);
                System.out.println(s.grade);
            } else {
                System.out.println("Not a Student object");
            }
        }

        void updateGrade(Object obj, char newGrade) {
            if (obj instanceof Student) {
                Student s = (Student) obj;
                s.grade = newGrade;
                System.out.println("Grade updated");
            } else {
                System.out.println("Cannot update grade");
            }
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Rachit", 101, 'A');
        Student s2 = new Student("Amit", 102, 'B');

        s1.display(s1);
        s2.updateGrade(s2, 'A');

        Student.displayTotalStudents();
    }
}
