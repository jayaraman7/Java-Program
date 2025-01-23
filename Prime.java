import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt(); // Read the user input

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close(); // Close the Scanner object
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, it's not a prime number
            }
        }
        return true; // Otherwise, it's a prime number
    }
}
