// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan6_encapsulation;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class Bus2 {
    private int penumpang;
    private int maxPenumpang;
    
    public Bus2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang = temp;
        }
    }
    public void cetak() {
        System.out.println("Penumpang bus sekarang : " + penumpang);
        System.out.println("Penumpang seharusnya : " + maxPenumpang);
    }
}
