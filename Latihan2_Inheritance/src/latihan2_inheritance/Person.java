// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package latihan2_inheritance;

/**
 *
 * @author Ella Dwipujana ASyani
 */
public class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age){
    this.name = name;
    this.age = age;
    }
    
    public void info(){
        System.out.println("Nama : " + this.name);
        System.out.println("Usia : " + this.age);
    }
    //akhir kelas program
    
}
