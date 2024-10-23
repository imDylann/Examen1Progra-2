/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public class EstadoCompletado extends Estado {

     public EstadoCompletado(ServicioMantenimiento servicio) {
        super(servicio);
        
    }
    
    @Override
    public Boolean enEspera() {
    return false;
    }

    @Override
    public Boolean enProceso() {
     return false; 
    }

    @Override
    public Boolean completado() {
     return false;
    }
    
}
