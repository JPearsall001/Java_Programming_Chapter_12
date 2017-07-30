/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1HW;

import java.util.Scanner;

/**
 *
 * @author Lisa
 */
public class SqrtException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a positive number: ");
            number = input.nextInt();
            if (number < 0)
                throw new ArithmeticException();
            System.out.println("The square root of " + number + " is " + Math.sqrt(number));
        } catch (ArithmeticException e) {
            System.out.println("ERROR!  That is not a positive number!");
        }
    }
}
