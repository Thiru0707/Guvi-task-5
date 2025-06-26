package Task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        try {
            LocalDate birthDate = LocalDate.parse(input); // parse input string to LocalDate
            LocalDate currentDate = LocalDate.now();

            if (birthDate.isAfter(currentDate)) {
                System.out.println("Birthdate cannot be in the future.");
                return;
            }

            Period age = Period.between(birthDate, currentDate);

            System.out.printf("Your age is: %d years, %d months, and %d days.%n", 
                              age.getYears(), age.getMonths(), age.getDays());

        } catch (Exception e) {
            System.out.println("Invalid date format. enter date in yyyy-mm-dd format.");
        }
        
        scanner.close();
    }
}