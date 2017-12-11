/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Đây là dòng thông điệp chào mừng
        /* 
         Ahihi đồ ngốc 1 
         Ahihi đồ ngốc 1 
         Ahihi đồ ngốc 1 
         Ahihi đồ ngốc 1 
         */
        System.out.println("Chào mừng tới lớp AD1709M");
        
        Scanner nhapDuLieu = new Scanner(System.in);
        System.out.println("Mời nhập tên");
        String ten;
        ten = nhapDuLieu.nextLine();
        System.out.println("Xin chào bạn: " + ten);
    }

}
