// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package latihan6_encapsulation;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class UjiBus2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}
