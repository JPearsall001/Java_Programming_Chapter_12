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
public class BadSubscriptCaught {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]names = {"Lisa", "Stephanie", "Meera", "Jennifer", "Todd", "Michael", "Karen", "John", "David", "Sara"};
        int value;
        
        try{
            System.out.println("Please enter a value between 1 and 10: ");
            Scanner input = new Scanner(System.in);
            value = input.nextInt();
            System.out.println(names[value-1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR!  That is not a number between 1 and 10!");
        }
    }
    
}
