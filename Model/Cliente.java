/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public class Cliente {
    private String id;
    private String nombre;
    private String numContacto;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public Cliente(String id, String nombre, String numContacto) {
        this.id = id;
        this.nombre = nombre;
        this.numContacto = numContacto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }
    
    
}
