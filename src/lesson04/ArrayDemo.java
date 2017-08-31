/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson04;

/**
 *
 * @author Thanh Dat
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] arr1 = new int[]{0,9,0,1,2,3,4,5,6,7,8}; 
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        float[] f = new float[100];
        double[] arrDouble = new double[50];
        String[] arrString = new String[10];
        Object[] arrObject = new Object[]{1,2.2,"CoderNator",new Object(),arr};
    }
}
