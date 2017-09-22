/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import graficos.Ventana;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import modelo.Cliente;
import modelo.Pelicula;

/**
 *
 * @author Alumno
 */
public class Manejador {
    private Ventana v;
    
    private ManejadorDB mndb;

    public Manejador(Ventana v) {
        this.v = v;
        mndb = new ManejadorDB();
    }

    
// Metodos de la pestaña Alta Clientes
    public void grabarClientes() {
        //Primero guarda todos los TextField en variables
        String dni = v.getjTextFieldClientesDNI().getText();
        String nombre = v.getjTextFieldClientesNombre().getText();
        String apellidos = v.getjTextFieldClientesApellidos().getText();
        String email = v.getjTextFieldClientesEmail().getText();
        
        //Comrpueba que no haya ningún TextField vacío
        if (dni.isEmpty()|| nombre.isEmpty() || apellidos.isEmpty() || email.isEmpty()){
            v.getjLabelAvisoClientes().setForeground(Color.red);
            v.getjLabelAvisoClientes().setText("Debe rellenar todos los datos");
        }else{
            //Crea un cliente con los datos
            Cliente cl= new Cliente(dni, nombre, apellidos,email);
            if(mndb.comprobarCliente(dni)){
                //Si el dni ya existe no hace nada y avisa
                v.getjLabelAvisoClientes().setForeground(Color.red);
                v.getjLabelAvisoClientes().setText("Ese DNI ya está registrado");
            } else {
                //Si el dni no existe manda el cliente a guardarse y devuelve si se hace con exito
                if (mndb.guardarCliente(cl)){
                    v.getjLabelAvisoClientes().setForeground(Color.green);
                    v.getjLabelAvisoClientes().setText("Cliente guardado.");
                }else{
                    v.getjLabelAvisoClientes().setForeground(Color.red);
                    v.getjLabelAvisoClientes().setText("Cliente no guardado.");
                }
            }
            
        }
    }

    public void buscarClientes() { 
        String dni=v.getjTextFieldClientesDNIBuscar().getText();
        //Comprueba si se ha introducido un dni
        if (dni.isEmpty()){
            v.getjLabelAvisoClientes().setForeground(Color.red);
            v.getjLabelAvisoClientes().setText("Debe incluir un dni.");
        }else {
            v.getjLabelAvisoClientes().setText(" ");
            Cliente cl= mndb.buscarCliente(dni);
            //Busca al cliente, si existe muestra los datos
            if (cl !=null){
                v.getjLabelAvisoClientes().setText(" ");
                v.getjTextFieldClientesDNIEncontrado().setText(cl.getDni());
                v.getjTextFieldClientesNombreEcontrado().setText(cl.getNombre());
                v.getjTextFieldClientesApellidosEncontrado().setText(cl.getApellidos());
                v.getjTextFieldClientesEmailEncontrado().setText(cl.getEmail());
            }else{
                v.getjLabelAvisoClientes().setForeground(Color.red);
                v.getjLabelAvisoClientes().setText("No existe el cliente.");
                v.getjTextFieldClientesDNIEncontrado().setText("");
                v.getjTextFieldClientesNombreEcontrado().setText("");
                v.getjTextFieldClientesApellidosEncontrado().setText("");
                v.getjTextFieldClientesEmailEncontrado().setText("");
            }
        }
    }

// Metodos de la pestaña Alta de Películas   
    
    //Rellena el ComboBox con los clientes que existan
    public void rellenaPelicula() {
        ArrayList <Cliente> cl;
        cl = mndb.getListadoClientes();
        DefaultComboBoxModel dlm=new DefaultComboBoxModel();
        if (cl.size()>0){
            for (Cliente c: cl){
                dlm.addElement(c);
            } 
        }
        v.getjComboBoxPeliculaAlquilado().setModel(dlm);

    }
    
    public void grabarPeliculas() {
        String id = v.getjTextFieldPeliculaID().getText();
        String nombre = v.getjTextFieldPeliculaNombre().getText();
        String genero = v.getjTextFieldPeliculaGenero().getText();
        
        Cliente cl = (Cliente)v.getjComboBoxPeliculaAlquilado().getSelectedItem();
        String clienteAlquilado = cl.getDni();
        
        if (id.isEmpty()|| nombre.isEmpty() || genero.isEmpty() || clienteAlquilado.isEmpty()){
            v.getjLabelAvisoPeliculas().setForeground(Color.red);
            v.getjLabelAvisoPeliculas().setText("Debe rellenar todos los datos");
        }else{
            Pelicula pl= new Pelicula(id, nombre, genero, clienteAlquilado);
            if(mndb.comprobarPelicula(id)){
                v.getjLabelAvisoPeliculas().setForeground(Color.red);
                v.getjLabelAvisoPeliculas().setText("Ese ID ya está registrado");
            } else {
                if (mndb.guardarPelicula(pl)){
                    v.getjLabelAvisoPeliculas().setForeground(Color.green);
                    v.getjLabelAvisoPeliculas().setText("Película registrada.");
                }else{
                    v.getjLabelAvisoPeliculas().setForeground(Color.red);
                    v.getjLabelAvisoPeliculas().setText("Película no registrada..");
                }
            }
            
        }
    }
 

// Metodos de la pestaña Listado 
    public void rellenaListado() {
       
        ArrayList <Pelicula> pl= 
                (ArrayList <Pelicula>) mndb.getListadoPeliculas();
        DefaultListModel dlm= new DefaultListModel();
        if (pl.size()>0){
            for(Pelicula p: pl){
                dlm.addElement(p);
            }
            
        }
        v.getjList1().setModel(dlm);  
        
    }

    public void mostrarPelicula() {
        DefaultListModel dlm = (DefaultListModel)v.
                getjList1().getModel();
        if (v.getjList1().getMinSelectionIndex()>-1){
            Pelicula pl= (Pelicula)dlm.
                    getElementAt(v.getjList1().getMinSelectionIndex());

            v.getjLabelListadoID().setText(pl.getId());
            v.getjLabelListadoNombre().setText(pl.getNombre());
            v.getjLabelListadoGenero().setText(pl.getGenero());

            String clienteAlquilado=mndb.getCliente(pl.getClienteAlquilado());

            v.getjLabelListadoClienteAlquilado().setText(clienteAlquilado);
        }
    }

    
// Metodos de la pestaña Edición de Películas   
    public void rellenaPelicula2() {
        ArrayList <Cliente> cl;
        cl = mndb.getListadoClientes();
        DefaultComboBoxModel dlm=new DefaultComboBoxModel();
        if (cl.size()>0){
            for (Cliente c: cl){
                dlm.addElement(c);
            } 
        }
        v.getjComboBoxEdicionCliente().setModel(dlm);
        //Pone el ComboBox vacío
        v.getjComboBoxEdicionCliente().setSelectedIndex(-1);
    }
    
    public void buscarPelicula() {
        v.getjTextFieldEdicionID().setEnabled(false);
        v.getjTextFieldEdicionNombre().setEnabled(false);
        v.getjTextFieldEdicionGenero().setEnabled(false);
        v.getjComboBoxEdicionCliente().setEnabled(false);
        
        String id=v.getjTextFieldEdicionBuscarID().getText();
        if (id.isEmpty()){
            v.getjLabelAvisoEdicion().setForeground(Color.red);
            v.getjLabelAvisoEdicion().setText("Debe incluir un ID.");
        }else {
            v.getjLabelAvisoEdicion().setText(" ");
            Pelicula pl= mndb.buscarPelicula(id);
            if (pl !=null){
                v.getjLabelAvisoEdicion().setText(" ");
                v.getjTextFieldEdicionID().setText(pl.getId());
                v.getjTextFieldEdicionNombre().setText(pl.getNombre());
                v.getjTextFieldEdicionGenero().setText(pl.getGenero());
                String cliente = pl.getClienteAlquilado();
                 v.getjComboBoxEdicionCliente().setSelectedIndex(mndb.getIndex(cliente));
            }else{
                v.getjLabelAvisoEdicion().setForeground(Color.red);
                v.getjLabelAvisoEdicion().setText("Ese ID no existe.");
                v.getjTextFieldEdicionID().setText("");
                v.getjTextFieldEdicionNombre().setText("");
                v.getjTextFieldEdicionGenero().setText("");
//                v.getjComboBoxEdicionCliente().setSelectedIndex(-1);
            }
        }
    }

    public void editarPelicula() {
        String id=v.getjTextFieldEdicionID().getText();
        
        if(v.getjButtonEditar().getActionCommand().equals("Editar")){
            
            if (id.isEmpty()){
                v.getjLabelAvisoEdicion().setForeground(Color.red);
                v.getjLabelAvisoEdicion().setText("Busque una película.");
            }else {
                
                v.getjButtonEditar().setText("Guardar");
                v.getjButtonEditar().setActionCommand("Guardar");
                
                v.getjTextFieldEdicionNombre().setEnabled(true);
                v.getjTextFieldEdicionGenero().setEnabled(true);
                v.getjComboBoxEdicionCliente().setEnabled(true);
            }
        } else {
            
            String id2 = v.getjTextFieldEdicionID().getText();
            
                
            String nombre = v.getjTextFieldEdicionNombre().getText();
            String genero = v.getjTextFieldEdicionGenero().getText();
        
            Cliente cl = (Cliente)v.getjComboBoxEdicionCliente().getSelectedItem();
            String clienteAlquilado = cl.getDni();
            
            Pelicula pl= new Pelicula(id2, nombre, genero, clienteAlquilado);
            
            //No funciona, pero debería mostrar un mensaje al actualizar
            if(mndb.actualizarPelicula(pl)){
                v.getjLabelAvisoEdicion().setForeground(Color.green);
                v.getjLabelAvisoEdicion().setText("Actualizado con éxito.");
            } else {
                v.getjLabelAvisoEdicion().setForeground(Color.red);
                v.getjLabelAvisoEdicion().setText("Problema al actualizar.");
            }

            
            v.getjButtonEditar().setText("Editar");
            v.getjButtonEditar().setActionCommand("Editar");
            v.getjTextFieldEdicionID().setEnabled(false);
            v.getjTextFieldEdicionNombre().setEnabled(false);
            v.getjTextFieldEdicionGenero().setEnabled(false);
            v.getjComboBoxEdicionCliente().setEnabled(false);
            v.getjLabelAvisoEdicion().setText(" ");
                             
        
        }
        
        
        
    }
}
