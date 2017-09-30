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
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // 16 ký tự 
        sb = new StringBuilder(100); // 100 ký tự 
        String temp = "Tên tôi là Đạt";
        sb = new StringBuilder(temp);
        String result = "";
        result = sb.append(" Và tôi họ Vũ").toString();
        
        System.out.println(result);
        System.out.println(sb.reverse());
        result = sb.toString();
        System.out.println(result);
        //result.concat(temp)
    }
}
