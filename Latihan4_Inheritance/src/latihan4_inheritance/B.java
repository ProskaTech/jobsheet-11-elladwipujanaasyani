// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package latihan4_inheritance;

/**
 *
 * @author Ella Dwipujana ASyani
 */
public class B extends A{
    private int b;

    public void setB(int nilai){
        b = nilai;
    }
    
    public int getB(){
        return b;
    }
    //melakukan override terhadap method tampilkanNilai()
    //yang terhadap pada kelas A
    
    public void tampilkanNilai(){
        super.tampilkanNilai(); //memanggil method dalam kelas A
        System.out.println("Nilai b = " + getB());
    }
}
