// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package latihan1inheritance;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class Pertama {
    private int a = 10;

    protected void terprotek(){
    System.out.println("Method ini hanya unuk anaknya");
    }
    public void info(){
    System.out.println("a = " + a);
    System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}
