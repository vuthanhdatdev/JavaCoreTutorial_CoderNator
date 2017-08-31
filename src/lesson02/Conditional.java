/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

/**
 *
 * @author Thanh Dat
 */
class Conditional {
    public static void main(String[] args) {
        if(5>4 && 1>5){ // True and True = true; True and False = False; False And False = False 
            System.out.println("Right");
        }
        else{
            System.out.println("Wrong");
        }
        
        if(5>4 || 1>5){ // True or True = true; True or False = True; False or False = False 
            System.out.println("Right");
        }
        else{
            System.out.println("Wrong");
        }
    }
}
