/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson01;

/**
 *
 * @author Thanh Dat
 */
public class Looping {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        
        do{
            System.out.println(i);
            i++;
        }while (i<10);
    }
}
