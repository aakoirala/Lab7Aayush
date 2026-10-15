import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);

        String userPhrase;
        String lowercaseUserPhrase;
        String palindromeCheck = "";

        int length;

        System.out.println("Enter a String to Check if it is a Palindrome: ");
        userPhrase = scan.nextLine();

        lowercaseUserPhrase = userPhrase.toLowerCase();
        length = lowercaseUserPhrase.length();

        for (int i = length - 1; i >= 0 ; i--) {
            palindromeCheck += lowercaseUserPhrase.substring(i, i+1);
        }

        if (lowercaseUserPhrase.equals(palindromeCheck)) {
            System.out.println("Your word, " + userPhrase + ", was a palindrome!");
        } else {
            System.out.println("Your word, " + userPhrase + ", was not a palindrome!");
        }
    }
}
