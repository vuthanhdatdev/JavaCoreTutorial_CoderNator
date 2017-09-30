/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author Thanh Dat
 */
public class ArraySolution {
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println("Index "+i+": "+a[i]);
        }
    }
    
    public static void printArray2Dimension(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println("a["+i+"]["+j+"]"+ ":"+ a[i][j]);
            }
        }
    }
}
