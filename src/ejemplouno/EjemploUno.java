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
public class EjemploUno {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @author Luis Villagrán
         * @description 
         *      Español: Creación de objeto para la clase "Person"
         *      Ingles: Create object for class "Person"
         */
        Person men = new Person("Juan Agusto Felipe De La Colina Lopez", "Mexico, Cancun");
        /**
         * @author Luis Villagrán
         * @description 
         *      Español: Creación de objeto para la clase "Student"
         *      Ingles: Create object for class "Student"
         */
        Student student = new Student("Fernando Villagrán", "Guatemala, Guatemala", "Programación Uno", 2022, 610.50);
        student.toString(student);
        /**
         * @author Luis Villagrán
         * @description 
         *      Español: Creación de objeto para la clase "Student"
         *      Ingles: Create object for class "Student"
         */
        Staff staff = new Staff("Gabriel Ruano", "Miami, Florida", "Mariano Galvez", 1500.50);
        staff.toString(staff);
    }
    
}
