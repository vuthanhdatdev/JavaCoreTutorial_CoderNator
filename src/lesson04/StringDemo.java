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
public class StringDemo {
    public static void main(String[] args) {
        // Khai báo biến s dạng String
        String s = "CoderNator";
        //Độ dài của chuỗi s : s.length();
        System.out.println(s.length());
        
        // ký tự tại vị trí thứ n-1 với n = s.length();
        System.out.println(s.charAt(s.length()-1));
        
        // nối chuỗi 
        String temp = s + "  " + "Vũ Thành Đạt";
        System.out.println("Chuỗi temp sau khi nối: "+ temp);
        
        //concat cũng là nối chuỗi 
        System.out.println("Chuỗi temp sau khi nối bằng concat: "+temp.concat(s));
        
        //Compareto
        System.out.println("Chuỗi temp sau khi compare với CoderNator "+ temp.compareTo("CoderNator"));
        // temp== "CoderNator"
        System.out.println("Chuỗi temp có bằng CoderNator : "+ temp.equals("CoderNator"));
        
        System.out.println("Chuỗi temp có chứa chuỗi CoderNator: "+temp.contains("CoderNator"));
        
        System.out.println("CoderNator biến đổi chữ thường: "+s.toLowerCase());
        
        System.out.println("CoderNator biến đổi in hoa: "+s.toUpperCase());
        
        String name = "          DatDatDatDatDat            ";
        int vitri = name.indexOf("dat");
        int lastIndex = name.lastIndexOf("Dat");
        System.out.println("Vị trí xuất hiện đầu tiên: "+ vitri);
        System.out.println("Vị trí xuất hiện cuối cùng: "+ lastIndex);
        
        name = name.replace("a", "A");
        System.out.println("Sau khi thay a thành A: "+ name);
        
        String subOfName = name.substring(2);
        System.out.println(subOfName);
        
        subOfName = name.substring(2,10);
        System.out.println(subOfName);
        
        System.out.println("Chuỗi gốc: "+ name);
        System.out.println("Chuỗi đã được trim(): "+ name.trim());
    }
}
