/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1HW;

/**
 *
 * @author Lisa
 */
public class Product extends ProductException {
    
    public Product(String productNumber, double productPrice){
        super(productNumber, productPrice);
        
        try{
            if(productNumber.length() !=3){
                throw new ProductException(productNumber, productPrice);
                
            }
            if(productPrice < .01 || productPrice > 1000){
                throw new ProductException(productNumber, productPrice);
            }
            System.out.println("Product was created succesfully!");
        }
        catch(ProductException e){
            System.out.println("ERROR! Product was not created!");
        }
    }
}
