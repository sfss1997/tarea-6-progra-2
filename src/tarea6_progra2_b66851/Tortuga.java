/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6_progra2_b66851;

import java.util.logging.Level;
import java.util.logging.Logger;
import static tarea6_progra2_b66851.Liebre.contLiebre;
/**
 *
 * @author fabian
 */
public class Tortuga implements Runnable{

   
    Liebre liebre = new Liebre();
    
    public static int contTortuga = 0;
    
    @Override
    public void run() {
        
        for (int i = 1; i < 101; i++) {
           contTortuga=i;
            System.out.println("Tortuga "+ i);
          
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
