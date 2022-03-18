/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplouno;

/**
 *
 * @author Luisf
 */
public class Student extends Person {
     /**
    *@author Luis Villagrán
    *@description
        Español: Encapsulado de variables
    */
    private String program;
    private int year;
    private double fee;
    
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public Student() {
    }
    /**
    *@author Luis Villagrán
    *@description 
        Español: Metodos sobre la clase Person aplicando los "modificadores"
        Ingles: Methods on the Person class applying the "modifiers"
    */   
    void setProgram(String program){
        this.program = program;
    }
    
    void getYear(){
        this.year = year;
    }
    
    void setYear(int year){
        this.year = year;
    }
    
    void getFee(){
        this.fee = fee;
    }
    
    void setFee(double fee){
        this.fee = fee;
    }
    
    public String toString(Student student){
        /**
         * @author Luis Villagrán
         * @description 
         *          Español: La sentencia "super" hace referencia al metodo toString de la super clase y lo llama.
         *          Ingles: The "super" statement references the toString method of the super class and calls it.
         */
        super.toString();
        System.out.println("*********   STUDENT INFORMATION   **********");
        System.out.println("This is the name of the program: " + student.program);
        System.out.println("This is the price of the program in quetzales: " + student.fee);
        System.out.println("This is the year of the program: " + student.program+"\n");
        return null;
    }
    
    
}
