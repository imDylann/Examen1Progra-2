/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
 class EntregaVehiculo implements Runnable {

     private GestorMantenimiento g;

    public EntregaVehiculo(GestorMantenimiento g) {
        this.g = g;
    }
     
     
    @Override
    public void run() {
         try {
             Thread.sleep(5000);
             //implementar vehiculos entregados
         } catch (InterruptedException ex) {
             Logger.getLogger(EntregaVehiculo.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
