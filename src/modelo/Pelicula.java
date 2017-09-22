/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Pelicula implements Serializable{
    
     private String id, nombre, genero ,clienteAlquilado;

    public Pelicula() {
    }

    public Pelicula(String id, String nombre, String genero, String clienteAlquilado) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.clienteAlquilado = clienteAlquilado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClienteAlquilado() {
        return clienteAlquilado;
    }

    public void setClienteAlquilado(String clienteAlquilado) {
        this.clienteAlquilado = clienteAlquilado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
