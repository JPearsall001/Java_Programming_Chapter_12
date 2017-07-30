/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1HW;

import java.util.Arrays;

/**
 *
 * @author Lisa
 */
public class MeanMedian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayAverage[] = {21, 98, 102, 78, 34};
        int sum = 0;
        int average = 0;
        int median = 0;
        int middle = 0;

        for (int i = 0; i < arrayAverage.length; i++) {
            Arrays.sort(arrayAverage);
            sum = sum + arrayAverage[i];
            average = sum / arrayAverage.length;
            middle = arrayAverage.length / 2;
            median = arrayAverage[middle];
        }
        
        System.out.println("The sorted array is: " + Arrays.toString(arrayAverage));
        System.out.println("The average is: " + average);
        System.out.println("The median is: " + median);

    }

}
