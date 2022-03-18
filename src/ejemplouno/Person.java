/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplouno;

/**
 * @author Luisf
 */
public class Person {
    /**
    *@author Luis Villagrán
    *@description
        Español: Encapsulado de variables
    */
    private String name;
    private String address;
    
    public Person(String name, String address){
        this.address = address;
        this.name = name;
    }
    
    public Person(){
        
    }
    
    /**
    *@author Luis Villagrán
    *@description 
        Español: Metodos sobre la clase Person aplicando los "modificadores"
        Ingles: Methods on the Person class applying the "modifiers"
    */
    
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    //toString
    /*
     public String toString(Person person){
        
        System.out.println("*********   INFORMACIÓN SOBRE LA PERSONA   **********");
        System.out.println("El nombre de la persona es: " + person.name);
        System.out.println("La direccion de la persona es: " + person.address+"\n");
    
        return null;
    }
    */
   
    
    public String toString(){
        System.out.println("*********   INFORMATION ABOUT THE PERSON   **********");
        System.out.println("The person's name is: " + this.name);
        System.out.println("The person's address is: " + this.address+"\n");
        return null;
    }
}
