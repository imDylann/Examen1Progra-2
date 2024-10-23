/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public abstract class Estado {
    ServicioMantenimiento servicio;

   
    Estado(ServicioMantenimiento servicio) {
        this.servicio = servicio;
    }

    public abstract Boolean enEspera();
    public abstract Boolean enProceso();
    public abstract Boolean completado();
    
}