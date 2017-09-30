/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson04;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Thanh Dat
 */
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String temp = "Tên     tôi    là    Đạt";
        //String[] arrayOfString = temp.split(" "); // Regular Expression  regex 
        //List<String> listOfString = Arrays.asList(arrayOfString);
        //System.out.println(listOfString);
        
        StringTokenizer st = new StringTokenizer(temp);
        st = new StringTokenizer(temp, " ",true);// trả về luôn cả ký tự
        st = new StringTokenizer(temp, " ");
        while(st.hasMoreElements()){
            System.out.println(st.nextElement().toString());
        }
    }
}
