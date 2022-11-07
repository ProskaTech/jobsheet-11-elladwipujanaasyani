// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laihan3_inheritance;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class Gajah extends Hewan{
        //meng-overwrite method pada class Hewan
    /**
     * @param args the command line arguments
     */
    public static void testClassMethod() {
        System.out.println("The Class Method in Hewan");
    }
    public void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah");
    }
    
    public static void main(String args[]){
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
