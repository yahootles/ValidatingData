/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package validatingdata;

/**
 *
 * @author antho6229
 */

import java.util.Scanner;

public class ValidatingData {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        case1();
    }
    
    public static String getInput(){
        String input = scan.nextLine();
        return input;
    }
    
    public static void case1(){
        System.out.println("Enter a string greater than 6 characters:");
        String input = getInput();
        boolean valid = false;
        while(!valid){
            if(input.length()>6){
                valid = true;
            }else{
                valid = false;
                System.out.println("That input is not valid. Please enter a string greater than 6 characters");
                input = getInput();
            }
        }
        System.out.println("Congratulations, you passed this stage!");
    }
    
    public static void case2(){
        System.out.println("Enter a string that contains a lower case \'a\':");
        String input = getInput();
        boolean valid = false;
        while(!valid){
            if(input.contains("a")){
                valid = true;
            }else{
                valid = false;
                System.out.println("That input is not valid. Please enter a string greater than 6 characters");
                input = getInput();
            }
        }
        System.out.println("Congratulations, you passed this stage!");
    }
    
    
}
