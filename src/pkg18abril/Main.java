/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18abril;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato gato = new Gato(4);
        gato.hacerSonido();
        
        Animal animal = new Gato(5);
        animal.hacerSonido();
    }
    
}
