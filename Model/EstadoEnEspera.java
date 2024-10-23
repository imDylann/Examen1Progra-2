/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public class EstadoEnEspera extends Estado {

    public EstadoEnEspera(ServicioMantenimiento servicio) {
        super(servicio);
        
    }
    
    @Override
    public Boolean enEspera() {
     return false;
    }

    @Override
    public Boolean enProceso() {
        servicio.cambiarEstado(new EstadoEnProceso(servicio));
        return true;
    }

    @Override
    public Boolean completado() {
            return false;
    }
    
}
