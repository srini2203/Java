import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        
        double hra = 0.10 * basicSalary; // HRA is 10% of Basic Salary
        double da = 0.37 * basicSalary;  // DA is 37% of Basic Salary
        
        double netSalary = basicSalary + hra + da;
        
        System.out.println("Net Salary: " + netSalary);
        
        scanner.close();
    }
}
