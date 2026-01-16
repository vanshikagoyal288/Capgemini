package level 1;

public class _6_CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void displayRentalDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("John Doe", "Toyota Camry", 5, 60.0);
        rental1.displayRentalDetails();

        System.out.println();

        CarRental rental2 = new CarRental("Jane Smith", "Tesla Model 3", 3, 120.0);
        rental2.displayRentalDetails();
    }
}