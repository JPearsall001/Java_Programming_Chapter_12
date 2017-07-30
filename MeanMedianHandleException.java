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
public class MeanMedianHandleException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        int median = 0;
        int middle;
        final int ARRAY_MAX = 5;
        int[] array = new int[5];
        boolean repeat = true;

        while (repeat) {
            try {

                Scanner input = new Scanner(System.in);
                for (int i = 0; i < ARRAY_MAX; i++) {
                    System.out.print("Enter a number: ");
                    array[i] = input.nextInt();
                    repeat = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("You didn't enter a number. Start over.");
                repeat = true;
            }
        }

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
            sum = sum + array[i];
            average = sum / array.length;
            middle = array.length / 2;
            median = array[middle];
        }

        System.out.println("The sorted array is: " + Arrays.toString(array));
        System.out.println("The average is: " + average);
        System.out.println("The median is: " + median);
    }
}
