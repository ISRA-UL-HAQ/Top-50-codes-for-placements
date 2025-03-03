import java.util.Scanner;

public class DigitCounter {
    // Method to count digits
    public static int countDigits(int num) {
        int count = 0;
        int temp = Math.abs(num); // Handle negative numbers

        while (temp > 0) {
            count++;
            temp /= 10; // Remove last digit
        }

        return (count == 0) ? 1 : count; // If num is 0, return 1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }
}
