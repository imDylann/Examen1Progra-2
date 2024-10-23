/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Student
 */
public class GestorMantenimiento {
    
    
    HashMap <Vehiculo, ServicioMantenimiento> VServicio = new HashMap<Vehiculo, ServicioMantenimiento>();
    Queue <Vehiculo> vehiculos;
    
    
    public void agregar(Vehiculo vehiculo){
     this.vehiculos.add(vehiculo);
    }

    private GestorMantenimiento(String estado, Queue<Vehiculo> vehiculos) {
        this.vehiculos = new LinkedList <Vehiculo>();
    }
      
    public void modificar(Vehiculo vehiculo, String estado){
     
    }
    
}
