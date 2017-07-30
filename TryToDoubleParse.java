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
public class TryToDoubleParse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number;
        String string;
        
        try{
            System.out.println("Enter an integer or double: ");
            Scanner input = new Scanner(System.in);
            string = input.nextLine();
            number = Double.parseDouble(string);
        }
        catch(NumberFormatException e){
            number = 0;
            System.out.println("Error!  That is not an integer or double!");
        }
        System.out.println("The number is: " + number);
    }
    
}
