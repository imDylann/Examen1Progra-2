/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Student
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private String estado;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getEstado() {
        return estado;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.estado = estado;
    }
    
    
}
