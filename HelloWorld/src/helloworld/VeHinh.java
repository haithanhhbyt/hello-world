/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author admin
 */
public class VeHinh {

    private void veTamGiacCan() {
        int size = 11;
        int pilot = size / 2;
        // System.out.println("pilot = " + pilot);
        for (int i = 0; i <= size/2; i++) { // Hàng
            for (int j = 0; j < size; j++) { // Cột
                if (j >= pilot - i && j <= pilot + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    private void veTamGiacCanNguoc(){
        int size = 11;
        int pilot = size / 2;
        // System.out.println("pilot = " + pilot);
        for (int i = 0; i <= size/2 ; i++) { // Hàng
            for (int j = 0; j < size; j++) { // Cột
                if (j >= pilot - i && j <= pilot + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VeHinh ve = new VeHinh();
        ve.veTamGiacCan();
        System.out.println("------------------------");
        ve.veTamGiacCanNguoc();
    }

}
