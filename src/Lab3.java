import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);

        double savingsGoal = 0.00;
        double totalSaved = 0.00;
        double deposit = 0.00;
        double excessAmount = 0.00;
        double depositsCount = 0.00;

        boolean validGoal = false;
        boolean validDeposit;

        do {
            System.out.println("What is your savings goal?");

            if (scan.hasNextDouble()) {
                savingsGoal = scan.nextDouble();

                if (savingsGoal > 0) {
                    validGoal = true;
                } else {
                    System.out.println("Error: Your number must be positive");
                }
            } else {
                System.out.println("Error: You must enter in a positive number");
            }
        scan.nextLine();
        } while (!validGoal);

        do {
            validDeposit = false;
            do {
                System.out.println("How much would you like to deposit: ");

                if (scan.hasNextDouble()) {
                    deposit = scan.nextDouble();

                    if (deposit > 0) {
                        depositsCount += 1;
                        totalSaved += deposit;
                        validDeposit = true;
                    } else {
                        System.out.println("Error: Your number must be positive");
                    }
                } else {
                    System.out.println("Error: You must enter in a positive number");
                }
                scan.nextLine();
            } while (!validDeposit);

            excessAmount = totalSaved - savingsGoal;
            System.out.println("Number of deposits: " + depositsCount);
            System.out.println("Total Saved: $" + totalSaved);

            if (excessAmount > 0) {
                System.out.println("Excess: $" + excessAmount);
            }
        } while (savingsGoal > totalSaved);
    }
}