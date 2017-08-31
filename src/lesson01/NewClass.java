/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Thanh Dat
 */
public class NewClass {
    public static void main(String[] args) {
        int a=0;
        
        // Cách 1 :
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen: ");
        //a = sc.nextInt();
        System.out.println(a);
        
        //Cách 2:
        System.out.println("Nhập vào 1 số nguyên: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            a = Integer.parseInt(br.readLine());
            System.out.println(a);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
