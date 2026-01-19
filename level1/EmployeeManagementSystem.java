public class EmployeeManagementSystem {

    static class Employee {

        static String companyName = "TCS";
        static int totalEmployees = 0;

        String name;
        String designation;
        final int id;

        Employee(String name, int id, String designation) {
            this.name = name;
            this.id = id;
            this.designation = designation;
            totalEmployees++;
        }

        static void displayTotalEmployees() {
            System.out.println("Total Employees " + totalEmployees);
        }

        void display(Object obj) {
            if (obj instanceof Employee) {
                Employee e = (Employee) obj;
                System.out.println(companyName);
                System.out.println(e.name);
                System.out.println(e.id);
                System.out.println(e.designation);
            } else {
                System.out.println("Not an Employee object");
            }
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Rachit", 101, "Developer");
        Employee e2 = new Employee("Amit", 102, "Tester");

        e1.display(e1);
        e2.display(e2);

        Employee.displayTotalEmployees();
    }
}
