/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1HW;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lisa
 */
public class MeanMedian2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arraySize;
        int value;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value form 2 to 20: ");
        arraySize = input.nextInt();
        int arrayAverage[] = new int[arraySize];

        System.out.println("Enter a number: ");
        for (int h = 0; h < arrayAverage.length; h++) {
            arrayAverage[h] = input.nextInt();
        }

        for (int i = 0; i < arrayAverage.length; i++) {
            for (int j = 0; j < arrayAverage.length; j++) {
                if (arrayAverage[i] > arrayAverage[j]) {
                    value = arrayAverage[i];
                    arrayAverage[i] = arrayAverage[j];
                    arrayAverage[j] = value;
                }
            }
        }

        int average;
        int median;
        int sum = 0;
        int isEvenAmount;
        int isOddAmount;

        for (int m = 0; m < arrayAverage.length; m++) {
            Arrays.sort(arrayAverage);
            sum = sum + arrayAverage[m];
        }

        isEvenAmount = (arrayAverage[(arraySize - 1) / 2] + arrayAverage[(arraySize) / 2] / 2);
        isOddAmount = arrayAverage[arraySize / 2];
        average = sum / arraySize;

        if (arraySize % 2 == 0) {
            median = isEvenAmount;
        } else {
            median = isOddAmount;
        }

        System.out.print("The sorted array is: " + Arrays.toString(arrayAverage) + ". ");
        System.out.print("The average is: " + average + ". ");
        System.out.println("The median is: " + median + ".");
    }
}
