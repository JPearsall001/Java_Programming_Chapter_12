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
public class ProductException extends Exception {

    protected String productNumber;
    protected double productPrice;

    public ProductException(String productNumber, double productPrice) {
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }
}
