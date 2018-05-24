/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6_progra2_b66851;

/**
 *
 * @author fabian
 */
public class Tarea6_Progra2_B66851 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tortuga tortuga = new Tortuga();
        Liebre liebre = new Liebre();
        
        Thread hilotortuga = new Thread((Runnable) tortuga);
        hilotortuga.start();
        
     
        Thread hiloLiebre = new Thread((Runnable) liebre);
        hiloLiebre.start();
       
    }
    
    
    
}
