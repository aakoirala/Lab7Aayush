import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);

        double savingsGoal;
        double totalSaved = 0.00;
        double depositsCount;
        double excessAmound;

        boolean validGoal = false;

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
    }
}
