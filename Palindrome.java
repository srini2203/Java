import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNum = number;
        int reversedNum = 0;
        
        while (number > 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number /= 10;
        }
        
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
        
        scanner.close();
    }
}
