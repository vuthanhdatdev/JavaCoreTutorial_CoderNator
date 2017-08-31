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
class Looping {
    public static void main(String[] args) {
        for(int i=0;i<10;i=i+3){
            System.out.println(i);
        }
        System.out.println();
        int i=0;
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println();
        int a=0;
        do{
            System.out.println(a);
            a++;
        }while(a<8);
        
    }
}
