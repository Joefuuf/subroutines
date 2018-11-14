/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subrutines;
import java.util.Scanner;
/**
 *
 * @author jasho9017
 */
public class Subrutines {
    public static void numAverage (){
        Scanner keyedInput = new Scanner(System.in);
        
        double total;
        double average;
        
        
        
        System.out.println("Please Enter 4 numbers you would like to average");
        double num1 = keyedInput.nextDouble();
        double num2 = keyedInput.nextDouble();
        double num3 = keyedInput.nextDouble();
        double num4 = keyedInput.nextDouble(); 
       
        total = num1 + num2+ num3 + num4;
        
        average = total/4;
        System.out.println("The total of the 4 numbers is" + total);
        System.out.println("The average of the 4 numbers is" + average);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
