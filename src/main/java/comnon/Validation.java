/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comnon;

import java.util.Scanner;
public class Validation {
    Scanner scanner = new Scanner(System.in);
    String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
            + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";
    
    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
        }
    public String checkInputString() {
        while (true) {
            String result = scanner.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    public boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    
    public int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }
    public String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(VALID_PHONE)) {
                return result;
            }
            System.out.println("Please input Phone flow\n"
                              + "1234567890\n"
                               + "123-456-7890\n"
                                +"123-456-7890 x1234\n"
                               +"123-456-7890 ext1234\n"
                                +"(123)-456-7890\n"
                                +"123.456.7890\n"
                                +"123 456 7890\n");
            System.out.print("Enter again: ");
        }
    }
}
