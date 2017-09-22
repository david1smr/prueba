/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Pelicula;

/**
 *
 * @author Alumno
 */
public class ManejadorDB {
    
    private ArrayList <Cliente> listadoClientes;
    private ArrayList <Pelicula> listadoPeliculas;
    private File ficheroClientes, ficheroPeliculas;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    
    public ManejadorDB(){
        //Ficheros
        ficheroClientes = new File ("clientes.dat");
        ficheroPeliculas = new File ("peliculas.dat");
        
        //Hace que los datos guardados en el fichero se cargen en listadoClientes
        listadoClientes = (ArrayList <Cliente>) leer(ficheroClientes);
        //Si no hay datos crea uno vacío
        if (listadoClientes == null){
            listadoClientes = new ArrayList();
        }
        
        listadoPeliculas = (ArrayList <Pelicula>) leer (ficheroPeliculas);
        if (listadoPeliculas == null ){
            listadoPeliculas = new ArrayList();
        }
    }
    
//Métodos generales    

    //Lee los datos del archivo y los manda 
    ArrayList leer (File f){
        ArrayList <Object> listado;
        try{
            fis = new FileInputStream (f);
            ois = new ObjectInputStream (fis);
            listado = (ArrayList <Object>)ois.readObject();
            ois.close();
            return listado;
        }catch(IOException ex){
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }    
    }
    
    //Escribe los datos en el archivo
    boolean grabar (File f, ArrayList o){
        try {
            fos = new FileOutputStream (f);
            oos = new ObjectOutputStream (fos);
            oos.writeObject(o);
            oos.close();        
        }catch (IOException ex ){
            return false;
        }
        return true;
    }
    
    
    public ArrayList <Cliente> getListadoClientes() {
        return listadoClientes;
    }   
    public ArrayList <Pelicula> getListadoPeliculas() {
        return listadoPeliculas;
    }
        
 
// Métodos para guardar el cliente
    
    //Comprueba que el dni exista o no
    boolean comprobarCliente(String dni) {
        for (Cliente c: listadoClientes){
            if (c.getDni().equals(dni)){
                return true;
            }
        }
        return false;
    }
    
    //Guarda el cliente el array y luego graba el array al fichero
    public boolean guardarCliente(Cliente cl) {
        listadoClientes.add(cl);
        if (grabar(ficheroClientes, listadoClientes)) {
            return true;
        }else{
            return false;
        }
    }
      
 // Métodos para buscar al cliente   

    //Busca un cliente por el dni y lo devuelve
    Cliente buscarCliente(String dni) {
        for (Cliente c: listadoClientes){
            if (c.getDni().equals(dni)){
                return c;
            }
        }
        return null;
    }
    
    
// Métodos para grabar una película
    
    //Comprueba que el id de la película exista ya o no
    boolean comprobarPelicula(String id) {
        for (Pelicula p: listadoPeliculas){
            if (p.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    //Guarda la película
    public boolean guardarPelicula(Pelicula pl) {
        listadoPeliculas.add(pl);
        if (grabar(ficheroPeliculas, listadoPeliculas)) {
            return true;
        }else{
            return false;
        }
    }
    


    String getCliente(String clienteAlquilado) {
        String nombre;
        for(Cliente cl:listadoClientes){
            if (cl.getDni().equals(clienteAlquilado)){
                nombre = cl.getNombre() + " " + cl.getApellidos();
                return nombre;
            }
        }
        return "No existe el cliente";
    }

    Pelicula buscarPelicula(String id) {
        for (Pelicula p: listadoPeliculas){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

  
    //Actualiza el Array pero no el archivo
    boolean actualizarPelicula(Pelicula pl) {

        for(Pelicula p: listadoPeliculas) {
            if (p.getId().equals(pl.getId())){
                p.setId(pl.getId());
                p.setNombre(pl.getNombre());
                p.setGenero(pl.getGenero());
                p.setClienteAlquilado(pl.getClienteAlquilado());

            }
        }
        if (grabar(ficheroPeliculas, listadoPeliculas)) {
            return true;
        }else{
            return false;
        }
    }

    int getIndex(String cliente) {
        Cliente c2;
        for (Cliente c: listadoClientes) {
            if (c.getDni().equals(cliente)){
                c2 = c;
                return listadoClientes.indexOf(c2);
            }
        }
        return -1;
    }
    
 
}
