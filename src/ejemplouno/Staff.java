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
public class Staff extends Person{
    /**
    *@author Luis Villagrán
    *@description
        Español: Encapsulado de variables
    */
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name,address);
        this.school = school;
        this.pay = pay;
    }
    
    public Staff() {
        
    }
    /**
    *@author Luis Villagrán
    *@description 
        Español: Metodos sobre la clase Person aplicando los "modificadores"
        Ingles: Methods on the Person class applying the "modifiers"
    */    
    public void getSchool(){
        this.school = school;
    }
    
    public void setSchool(String school){
        
    }
    
    public void getPay(){
       this.pay = pay;
    }
    
    public void setPay(double pay){
       
    }
    
    public String toString(Staff staff){
        /**
         * @author Luis Villagrán
         * @description 
         *          Español: La sentencia "super" hace referencia al metodo toString de la super clase y lo llama.
         *          Ingles: The "super" statement references the toString method of the super class and calls it.
         */
        super.toString();
        System.out.println("*********   INFORMATION ABOUT THE STAFF   **********");
        System.out.println("This is the name of the academic place: " + staff.school);
        System.out.println("This is the price to pay: " + staff.pay+"\n");
        return null;
    }
}
