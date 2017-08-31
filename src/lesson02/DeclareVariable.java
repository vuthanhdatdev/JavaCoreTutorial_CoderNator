/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thanh Dat
 */
class DeclareVariable {
    public static void main(String[] args) {
        int a=31;
        double b=1.1988;
        String c="CoderNator";
        char d = 'q';
        boolean t = true;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(t);
        
        int[] arrInt = new int[10];
        double[] arrD = new double[10];
        String[] arrS = new String[10];
        Object[] arrO = new Object[]{1,"abc","Xyz",d,a,b,c};
        
        List<String> liststr = new ArrayList<>();
    }
}
