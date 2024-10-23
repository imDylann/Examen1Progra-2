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
    
    public static GestorMantenimiento getInstance(){
        if(instance==null){
            instance = new GestorMantenimiento();
            return instance;
        }
        return instance;
        
    }
    static GestorMantenimiento instance;
    private HashMap <Vehiculo, ServicioMantenimiento> VServicio = new HashMap<Vehiculo, ServicioMantenimiento>();
    private Queue <Vehiculo> vehiculos;
    
    
    public void agregar(Vehiculo vehiculo){
     this.vehiculos.add(vehiculo);
    }

    private GestorMantenimiento() {
        this.vehiculos = new LinkedList <Vehiculo>();
    }
      
    public void modificar(Vehiculo vehiculo, String estado){
     
    }
    
}
