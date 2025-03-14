import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Check if the user provided a command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci <n>");
            System.out.println("Where n is the number of Fibonacci numbers to compute.");
            return;
        }

        // Parse the command-line argument into an integer
        int n = Integer.parseInt(args[0]);

        // Check if the input is a valid number
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
            return;
        }

        // Compute Fibonacci numbers using the Scanner class
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first two Fibonacci numbers:");
        
        // set up the first two Fibonacci numbers
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        
        System.out.println("Fibonacci sequence:");
        System.out.println(first);
        System.out.println(second);
        
        // Computing and printing the Fibonacci numbers up to the nth number
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
        
        scanner.close();
    }
}
