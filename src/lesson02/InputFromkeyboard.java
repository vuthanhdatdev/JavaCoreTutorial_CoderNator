/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/*

*/
/**
 *
 * @author Thanh Dat
 */
class InputFromkeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Please input a number: ");
        //int a = sc.nextInt();
        //String s = sc.nextLine();
        //System.out.println("You have input number: "+s);
        
        //TODO: Method 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input a number: ");
        try {
            int a = Integer.parseInt(br.readLine());
            System.out.println(a);
        } catch (IOException ex) {
            Logger.getLogger(InputFromkeyboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
