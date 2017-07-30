/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1HW;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lisa
 */
public class NegativeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String arraySize;
        int size;

        try {
            System.out.print("Enter a size for your array: ");
            Scanner input = new Scanner(System.in);
            arraySize = input.nextLine();
            size = Integer.parseInt(arraySize);
            int array[] = new int[size];
            System.out.println("Your array was succesfully created! Your array size is: " + arraySize);

            try {
                System.out.println("Enter " + arraySize + " values:");
                for (int i = 0; i < array.length; i++) {
                    array[i] = input.nextInt();
                }
                System.out.print("The sorted array is: " + Arrays.toString(array) + ". ");
                
            } catch (Exception e) {
                System.out.println("That is not a numeric value!  Your array could not create!  Start over!  Enter " + arraySize + " values.");
                Scanner input2 = new Scanner(System.in);
                for (int i = 0; i < array.length; i++) {
                    array[i] = input2.nextInt();
                }
                System.out.print("The sorted array is: " + Arrays.toString(array) + ". ");
            }

        } catch (NegativeArraySizeException e) {
            System.out.println("ERROR! You entered a negative value!  Array did not create!");
        } catch (NumberFormatException e) {
            System.out.println("Error!  That is not a number!  Array did not create!");
        }
    }
}
