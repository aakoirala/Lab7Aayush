import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);

        int amountOfTerms;
        int startTerm = 0;
        int currentTerm = 1;
        int fibNum = 0;

        boolean isValid = false;


        System.out.println("How many terms of the Fibonacci Sequence would you like to be displayed?");
        do {
            if (scan.hasNextInt()) {
                amountOfTerms = scan.nextInt();
                if (amountOfTerms > 2) {
                    System.out.print("0 1 ");
                    for (int i = 0; i < amountOfTerms - 2; i++) {
                        fibNum = startTerm + currentTerm;

                        System.out.print(fibNum + " ");

                        startTerm = currentTerm;
                        currentTerm = fibNum;
                    }
                    isValid = true;
                } else if (amountOfTerms > 0) {
                    if (amountOfTerms == 1) {
                        System.out.println(startTerm);
                    } else {
                        System.out.println(startTerm + " " + currentTerm);
                    }
                } else {
                    System.out.println("Error: You must enter in a positive integer value");
                }
            } else {
                System.out.println("Error: You must enter in a positive integer value");
            }
            scan.nextLine();
        } while (!isValid);
    }
}