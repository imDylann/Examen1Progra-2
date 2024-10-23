/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public class ServicioMantenimiento {
    private String tipoServicio;
    private Estado estado;

    public ServicioMantenimiento(String tipoServicio) {
        this.tipoServicio = tipoServicio;
        this.estado=new EstadoEnEspera(this);
    }

    
    public String getTipoServicio() {
        return tipoServicio;
    }

    public Estado getEstado() {
        return estado;
    }
 

    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ServicioMantenimiento{" + "tipoServicio=" + tipoServicio + ", estado=" + estado + '}';
    }
    
        
}
