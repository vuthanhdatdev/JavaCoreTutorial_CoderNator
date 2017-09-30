/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson04;

import lib.ArraySolution;
/**
 *
 * @author Thanh Dat
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arrayOfInt = new int[10];
        int[][] arrayOfInt02 = new int[][]{{1,2,3},{4,5,6},{7,8,9,7}};
        ArraySolution.printArray2Dimension(arrayOfInt02);
        //ArraySolution.printArray(arrayOfInt);
        /*
        for(int i=0;i<arrayOfInt.length;i++){
            System.out.println("Index "+ i + ": "+ arrayOfInt[i] );
        }
        
        for(int value:arrayOfInt){
            System.out.println(value);
        }
        
        int i=0;
        while(i<arrayOfInt.length){
            System.out.println("Index "+ i + ": "+ arrayOfInt[i] );
            i++;
        }
        */
    }
}
