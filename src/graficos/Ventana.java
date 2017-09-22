/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import dao.Manejador;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class Ventana extends javax.swing.JFrame {

    private Manejador mn;
    
    public Ventana() {
        initComponents();
        mn = new Manejador(this);
    }

    
// Todos los Getter
    public JLabel getjLabelAvisoClientes() {
        return jLabelAvisoClientes;
    }
    public JTextField getjTextFieldClientesApellidos() {
        return jTextFieldClientesApellidos;
    }
    public JTextField getjTextFieldClientesApellidosEncontrado() {
        return jTextFieldClientesApellidosEncontrado;
    }
    public JTextField getjTextFieldClientesDNI() {
        return jTextFieldClientesDNI;
    }
    public JTextField getjTextFieldClientesDNIBuscar() {
        return jTextFieldClientesDNIBuscar;
    }
    public JTextField getjTextFieldClientesDNIEncontrado() {
        return jTextFieldClientesDNIEncontrado;
    }
    public JTextField getjTextFieldClientesEmail() {
        return jTextFieldClientesEmail;
    }
    public JTextField getjTextFieldClientesEmailEncontrado() {
        return jTextFieldClientesEmailEncontrado;
    }
    public JTextField getjTextFieldClientesNombre() {
        return jTextFieldClientesNombre;
    }
    public JTextField getjTextFieldClientesNombreEcontrado() {
        return jTextFieldClientesNombreEcontrado;
    }
    public JComboBox<String> getjComboBoxPeliculaAlquilado() {
        return jComboBoxPeliculaAlquilado;
    }
    public JLabel getjLabelAvisoPeliculas() {
        return jLabelAvisoPeliculas;
    }
    public JTextField getjTextFieldPeliculaGenero() {
        return jTextFieldPeliculaGenero;
    }
    public JTextField getjTextFieldPeliculaID() {
        return jTextFieldPeliculaID;
    }
    public JTextField getjTextFieldPeliculaNombre() {
        return jTextFieldPeliculaNombre;
    }
    public JLabel getjLabelListadoClienteAlquilado() {
        return jLabelListadoClienteAlquilado;
    }
    public JLabel getjLabelListadoGenero() {
        return jLabelListadoGenero;
    }
    public JLabel getjLabelListadoID() {
        return jLabelListadoID;
    }
    public JLabel getjLabelListadoNombre() {
        return jLabelListadoNombre;
    }
    public JList<String> getjList1() {
        return jList1;
    }
    public JLabel getjLabelAvisoEdicion() {
        return jLabelAvisoEdicion;
    }
    public JTextField getjTextFieldEdicionBuscarID() {
        return jTextFieldEdicionBuscarID;
    }
    public JTextField getjTextFieldEdicionGenero() {
        return jTextFieldEdicionGenero;
    }
    public JTextField getjTextFieldEdicionID() {
        return jTextFieldEdicionID;
    }
    public JTextField getjTextFieldEdicionNombre() {
        return jTextFieldEdicionNombre;
    }
    public JComboBox<String> getjComboBoxEdicionCliente() {
        return jComboBoxEdicionCliente;
    }
    public JButton getjButtonEditar() {
        return jButtonEditar;
    }
    
    //Método que cirra el formulario de edición si se ha dejado abierto y cambias de pestaña
    private void cerrarEdicion() {
        jButtonEditar.setActionCommand("Editar");
        jButtonEditar.setText("Editar");
        jTextFieldEdicionID.setText("");
        jTextFieldEdicionNombre.setEnabled(false);
        jTextFieldEdicionNombre.setText("");
        jTextFieldEdicionGenero.setEnabled(false);
        jTextFieldEdicionGenero.setText("");
        jComboBoxEdicionCliente.setEnabled(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldClientesDNI = new javax.swing.JTextField();
        jTextFieldClientesNombre = new javax.swing.JTextField();
        jTextFieldClientesApellidos = new javax.swing.JTextField();
        jTextFieldClientesEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelAvisoClientes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldClientesDNIBuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextFieldClientesDNIEncontrado = new javax.swing.JTextField();
        jTextFieldClientesNombreEcontrado = new javax.swing.JTextField();
        jTextFieldClientesApellidosEncontrado = new javax.swing.JTextField();
        jTextFieldClientesEmailEncontrado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPeliculaID = new javax.swing.JTextField();
        jTextFieldPeliculaNombre = new javax.swing.JTextField();
        jTextFieldPeliculaGenero = new javax.swing.JTextField();
        jComboBoxPeliculaAlquilado = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabelAvisoPeliculas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelListadoID = new javax.swing.JLabel();
        jLabelListadoNombre = new javax.swing.JLabel();
        jLabelListadoGenero = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelListadoClienteAlquilado = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldEdicionBuscarID = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabelAvisoEdicion = new javax.swing.JLabel();
        jTextFieldEdicionID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldEdicionNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldEdicionGenero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxEdicionCliente = new javax.swing.JComboBox<>();
        jButtonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                manejadorTabs(evt);
            }
        });

        jLabel1.setText("DNI:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Email:");

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejadorGrabarClientes(evt);
            }
        });

        jLabelAvisoClientes.setText(" ");

        jLabel6.setText("DNI:");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejadorBuscarClientes(evt);
            }
        });

        jTextFieldClientesDNIEncontrado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldClientesDNIEncontrado.setEnabled(false);

        jTextFieldClientesNombreEcontrado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldClientesNombreEcontrado.setEnabled(false);

        jTextFieldClientesApellidosEncontrado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldClientesApellidosEncontrado.setEnabled(false);

        jTextFieldClientesEmailEncontrado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldClientesEmailEncontrado.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAvisoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldClientesDNIBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldClientesDNIEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldClientesNombreEcontrado)
                                .addComponent(jTextFieldClientesApellidosEncontrado)
                                .addComponent(jTextFieldClientesEmailEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldClientesNombre)
                            .addComponent(jTextFieldClientesApellidos)
                            .addComponent(jTextFieldClientesEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldClientesDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldClientesDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldClientesNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldClientesApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldClientesEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAvisoClientes)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldClientesDNIBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldClientesDNIEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldClientesNombreEcontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldClientesApellidosEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldClientesEmailEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alta de clientes", jPanel1);

        jLabel5.setText("ID:");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Género:");

        jLabel9.setText("Cliente alquilado:");

        jComboBoxPeliculaAlquilado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton3.setText("Añadir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejadorGrabarPeliculas(evt);
            }
        });

        jLabelAvisoPeliculas.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelAvisoPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPeliculaID)
                            .addComponent(jTextFieldPeliculaNombre)
                            .addComponent(jTextFieldPeliculaGenero)
                            .addComponent(jComboBoxPeliculaAlquilado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldPeliculaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPeliculaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPeliculaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPeliculaAlquilado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAvisoPeliculas))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Alta de películas", jPanel2);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                manejadorListadoPeliculas(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel10.setText("ID:");

        jLabel11.setText("Nombre:");

        jLabelListadoID.setText(" ");

        jLabelListadoNombre.setText(" ");

        jLabelListadoGenero.setText(" ");

        jLabel17.setText("Género:");

        jLabelListadoClienteAlquilado.setText(" ");

        jLabel19.setText("Cliente alquilado:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelListadoID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelListadoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelListadoGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelListadoClienteAlquilado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabelListadoID))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelListadoNombre)
                            .addComponent(jLabel11))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelListadoGenero)
                            .addComponent(jLabel17))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelListadoClienteAlquilado)
                            .addComponent(jLabel19))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listado", jPanel3);

        jButton4.setText("Buscar película por ID");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejadorbuscarPelicula(evt);
            }
        });

        jLabelAvisoEdicion.setText(" ");
        jLabelAvisoEdicion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jTextFieldEdicionID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEdicionID.setEnabled(false);

        jLabel12.setText("ID:");

        jTextFieldEdicionNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEdicionNombre.setEnabled(false);

        jLabel13.setText("Nombre:");

        jTextFieldEdicionGenero.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEdicionGenero.setEnabled(false);

        jLabel14.setText("Género:");

        jLabel15.setText("Cliente:");

        jComboBoxEdicionCliente.setToolTipText("");
        jComboBoxEdicionCliente.setEnabled(false);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejadorEditarPeliculas(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAvisoEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldEdicionBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4)))
                .addGap(68, 68, 68))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEditar)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldEdicionNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEdicionID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(51, 51, 51)
                                .addComponent(jTextFieldEdicionGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(53, 53, 53)
                            .addComponent(jComboBoxEdicionCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEdicionBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAvisoEdicion)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldEdicionID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldEdicionNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldEdicionGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxEdicionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButtonEditar)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Edición de películas", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manejadorGrabarClientes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejadorGrabarClientes
        mn.grabarClientes();
    }//GEN-LAST:event_manejadorGrabarClientes

    private void manejadorBuscarClientes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejadorBuscarClientes
        mn.buscarClientes();
    }//GEN-LAST:event_manejadorBuscarClientes

    private void manejadorGrabarPeliculas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejadorGrabarPeliculas
        mn.grabarPeliculas();
    }//GEN-LAST:event_manejadorGrabarPeliculas

    private void manejadorTabs(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_manejadorTabs
        String nombrePanel = jTabbedPane1.
                getTitleAt(jTabbedPane1.getSelectedIndex());
        switch (nombrePanel){
            case "Alta de clientes":
                cerrarEdicion();
                break;
            // Al entrar en la pestaña se rellena el ComboBox con los clientes
            case "Alta de películas": mn.rellenaPelicula();
                cerrarEdicion();
                break;
            // Al entrar se llena la lista con las películas
            case "Listado": mn.rellenaListado();  
                cerrarEdicion();
                
                break;
            // Al entrar se rellena el ComboBox con los clientes
            case "Edición de películas": 
                mn.rellenaPelicula2();         
        }
    }//GEN-LAST:event_manejadorTabs

    private void manejadorListadoPeliculas(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_manejadorListadoPeliculas
        mn.mostrarPelicula();
    }//GEN-LAST:event_manejadorListadoPeliculas

    private void manejadorbuscarPelicula(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejadorbuscarPelicula
        mn.buscarPelicula();
    }//GEN-LAST:event_manejadorbuscarPelicula

    private void manejadorEditarPeliculas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejadorEditarPeliculas
        mn.editarPelicula();
    }//GEN-LAST:event_manejadorEditarPeliculas


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JComboBox<String> jComboBoxEdicionCliente;
    private javax.swing.JComboBox<String> jComboBoxPeliculaAlquilado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAvisoClientes;
    private javax.swing.JLabel jLabelAvisoEdicion;
    private javax.swing.JLabel jLabelAvisoPeliculas;
    private javax.swing.JLabel jLabelListadoClienteAlquilado;
    private javax.swing.JLabel jLabelListadoGenero;
    private javax.swing.JLabel jLabelListadoID;
    private javax.swing.JLabel jLabelListadoNombre;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldClientesApellidos;
    private javax.swing.JTextField jTextFieldClientesApellidosEncontrado;
    private javax.swing.JTextField jTextFieldClientesDNI;
    private javax.swing.JTextField jTextFieldClientesDNIBuscar;
    private javax.swing.JTextField jTextFieldClientesDNIEncontrado;
    private javax.swing.JTextField jTextFieldClientesEmail;
    private javax.swing.JTextField jTextFieldClientesEmailEncontrado;
    private javax.swing.JTextField jTextFieldClientesNombre;
    private javax.swing.JTextField jTextFieldClientesNombreEcontrado;
    private javax.swing.JTextField jTextFieldEdicionBuscarID;
    private javax.swing.JTextField jTextFieldEdicionGenero;
    private javax.swing.JTextField jTextFieldEdicionID;
    private javax.swing.JTextField jTextFieldEdicionNombre;
    private javax.swing.JTextField jTextFieldPeliculaGenero;
    private javax.swing.JTextField jTextFieldPeliculaID;
    private javax.swing.JTextField jTextFieldPeliculaNombre;
    // End of variables declaration//GEN-END:variables

    
}
