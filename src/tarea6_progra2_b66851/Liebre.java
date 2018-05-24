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
public class Liebre implements Runnable{

    public static int contLiebre = 0;
   
    
    @Override
    public void run() {
        int a = (int) (Math.random()*100)+0;
       
         for (int i = 1; i < 100; i++) {
            contLiebre = i;
            System.out.println("Liebre "+ i);
            try {
                Thread.sleep(500);
                
                
                if(i+1==a){
                    System.out.println("Duerme la liebre en "+(i+1));
 
                    Thread.sleep(Tortuga.contTortuga*1000);
                    System.out.println("Despieta la liebre");
 
                }  
            } catch (InterruptedException ex) {
                Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public void wakeUp() throws InterruptedException{
        Thread.interrupted();
        for (int i = contLiebre; i < 101; i++) {
            System.out.println("Liebre "+ i);
            Thread.sleep(1000);
        }
    }
    
    
}
