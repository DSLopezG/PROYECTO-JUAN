/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Buscar;
import vista.Comprar;
import vista.Inicio;
import vista.Inventario;
import vista.Menu;
import vista.Registro;
import vista.Sesion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ConexionBD;

public class Controlador implements ActionListener  {
        
     private Inicio vw_inicio;
     private Registro vw_registro;
     private Menu vw_menu;
     private Buscar vw_buscar;
     private Comprar vw_comprar;
     private Inventario vw_inventario;
     private Sesion vw_sesion;
     
        
     public Controlador (Inicio vw_inicio,Registro vw_registro, Menu vw_menu,Buscar vw_buscar,Comprar vw_comprar,Inventario vw_inventario,Sesion vw_sesion) {
        
         //clases
        this.vw_inicio = vw_inicio;
        this.vw_registro = vw_registro;
        this.vw_menu = vw_menu;
        this.vw_buscar = vw_buscar;
        this.vw_comprar = vw_comprar;
        this.vw_inventario = vw_inventario;
        this.vw_sesion = vw_sesion;
        
        //botones
        this.vw_inicio.btn_iniciar.addActionListener(this);   
        this.vw_menu.btn_Comprar.addActionListener(this);  
        this.vw_menu.btn_Buscar.addActionListener(this);  
        this.vw_menu.btn_Inventario.addActionListener(this);
        this.vw_menu.btn_Salir.addActionListener(this);
        this.vw_comprar.btn_atras_com.addActionListener(this);
        this.vw_buscar.btn_atras_buscar.addActionListener(this);
        this.vw_inventario.btn_atras_inventario.addActionListener(this);
        this.vw_sesion.btn_iniciosesion.addActionListener(this);
        this.vw_sesion.btn_registrar_inicio.addActionListener(this);
        this.vw_registro.btn_registrar.addActionListener(this);
        this.vw_buscar.btn_buscar_buscar.addActionListener(this);
        
        
     }
     
     
     public void iniciar() {
        vw_inicio.setTitle("PhoneShop");
        //vw_inicio.setLocationRelativeTo(null);
    }
     
     public void actionPerformed(ActionEvent e) {
         
          if (e.getSource() == vw_inicio.btn_iniciar) {
              
              vw_inicio.setVisible(false);
              vw_sesion.setVisible(true);
             
          }
          
          if (e.getSource() == vw_sesion.btn_iniciosesion) {
              
                      PreparedStatement ps = null;
                      ConexionBD conn = new ConexionBD();
                      Connection con = (Connection) conn.getConexion();

                     String SQL4 = "SELECT * FROM USUARIOS;";
                     
                     try {
                        
                        String usuario;
                        String contra;
     
                        Statement stmt = (Statement) con.createStatement();
                        ResultSet rs;

                        rs = stmt.executeQuery(SQL4);
                        while ( rs.next() ) {
                            
                             usuario = rs.getString("Usuario");
                            //System.out.println(usuario);
                             contra = rs.getString("Contraseña");
                            //System.out.println(contra);     
                            
                            if ((vw_sesion.txt_inicio_usu.getText().equalsIgnoreCase(usuario)&& vw_sesion.txt_inicio_contra.getText().equalsIgnoreCase(contra))) {
           
                            vw_menu.setVisible(true);
                            vw_sesion.setVisible(false);   
                            
                            }      
                        }

                     } catch (SQLException ex) {
                         Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                         
                     }

          }
          if (e.getSource() == vw_sesion.btn_registrar_inicio) {
       
              vw_registro.setVisible(true);
              vw_sesion.setVisible(false);
              
          }
          
           if (e.getSource() == vw_registro.btn_registrar) {
              
              
              if(vw_registro.txt_nom_reg.getText().length()!=0 && vw_registro.txt_ape_reg.getText().length()!=0 &&
                 vw_registro.txt_usuario_reg.getText().length()!=0 && vw_registro.txt_contra_reg.getText().length()!=0){
              
                        String nombre = vw_registro.txt_nom_reg.getText();
                        String apellido = vw_registro.txt_ape_reg.getText();
                        String usuario = vw_registro.txt_usuario_reg.getText();
                        String contraseña = vw_registro.txt_contra_reg.getText();
                        
                        PreparedStatement ps = null;
                        ConexionBD conn = new ConexionBD();
                        Connection con = (Connection) conn.getConexion();

                     String sql2 = "INSERT INTO usuarios (Nombre, Apellido, Usuario, Contraseña) VALUES ('"+nombre+"', '"+apellido+"', '"+usuario+"', '"+contraseña+"');";
                     
                     try {
                         
                         ps = (PreparedStatement) con.prepareStatement(sql2);              
                         ps.executeUpdate();
                        
                         vw_registro.setVisible(false);
                         JOptionPane.showMessageDialog(null,"REGISTRO EXITOSO");
                         vw_sesion.setVisible(true);
                         
                     } catch (SQLException ex) {
                         Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                         JOptionPane.showMessageDialog(null,"REGISTRO RECHAZADO");
                     }

                      

              } else if(vw_registro.txt_nom_reg.getText().length()==0 || vw_registro.txt_ape_reg.getText().length()==0 ||
                 vw_registro.txt_usuario_reg.getText().length()==0 || vw_registro.txt_contra_reg.getText().length()==0) {
                  
                   JOptionPane.showMessageDialog(null,"FALTAN CAMPOS POR LLENAR");
              }
              
          }
          
          
          if (e.getSource() == vw_menu.btn_Comprar) {
            
              vw_menu.setVisible(false);
              vw_comprar.setVisible(true);
          }
          
          if (e.getSource() == vw_menu.btn_Buscar) {
              
              vw_menu.setVisible(false);
              vw_buscar.setVisible(true);

          }
          
          if (e.getSource() == vw_buscar.btn_buscar_buscar) {
           
                      
             DefaultTableModel modelo = new DefaultTableModel();
              vw_buscar.tabla_buscar.setModel(modelo);
            
               PreparedStatement ps = null;
               ResultSet rs = null;
               ConexionBD conn = new ConexionBD();
               Connection con = (Connection) conn.getConexion();

               String codigo=vw_buscar.txt_Factura.getText();
               String sql5="";
               
                sql5 = "SELECT * FROM ventas where numfactura="+codigo+";";
               if (codigo.equalsIgnoreCase("0")) {
                   sql5 = "SELECT * FROM ventas;";
              }
              
               
               
            try {
                ps = (PreparedStatement) con.prepareStatement(sql5);
                rs = ps.executeQuery();
                ResultSetMetaData rsMD = (ResultSetMetaData) rs.getMetaData();

                int cantidadColumnas = rsMD.getColumnCount();

                modelo.addColumn("NumFactura");
                modelo.addColumn("Nombre");
                modelo.addColumn("Documento");
                modelo.addColumn("Telefono");
                modelo.addColumn("Marca");
                modelo.addColumn("Cargador");
                modelo.addColumn("Audifonos");
                modelo.addColumn("Precio");

                while (rs.next()) {

                    Object[] filas = new Object[cantidadColumnas];

                    for (int i = 0; i < cantidadColumnas; i++) {

                        filas[i] = rs.getObject(i + 1);

                    }

                    modelo.addRow(filas);

                }

            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
          
          if (e.getSource() == vw_menu.btn_Inventario) {
              
              DefaultTableModel modelo = new DefaultTableModel();
              vw_inventario.tabla_inventario.setModel(modelo);
              
              
              vw_menu.setVisible(false);
              vw_inventario.setVisible(true);
              
               PreparedStatement ps = null;
               ResultSet rs = null;
               ConexionBD conn = new ConexionBD();
               Connection con = (Connection) conn.getConexion();

            String sql = "SELECT * FROM ventas";
            try {
                ps = (PreparedStatement) con.prepareStatement(sql);
                rs = ps.executeQuery();
                ResultSetMetaData rsMD = (ResultSetMetaData) rs.getMetaData();

                int cantidadColumnas = rsMD.getColumnCount();

                modelo.addColumn("NumFactura");
                modelo.addColumn("Nombre");
                modelo.addColumn("Documento");
                modelo.addColumn("Telefono");
                modelo.addColumn("Marca");
                modelo.addColumn("Cargador");
                modelo.addColumn("Audifonos");
                modelo.addColumn("Precio");

                while (rs.next()) {

                    Object[] filas = new Object[cantidadColumnas];

                    for (int i = 0; i < cantidadColumnas; i++) {

                        filas[i] = rs.getObject(i + 1);

                    }

                    modelo.addRow(filas);

                }

            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
          if (e.getSource() == vw_menu.btn_Salir) {
              
              vw_menu.setVisible(false);
              JOptionPane.showMessageDialog(null, "GRACIAS POR USAR EL PROGRAMA");
              System.exit(0);

          }
          
          if (e.getSource() == vw_comprar.btn_atras_com) {
              
              vw_comprar.setVisible(false);
              vw_menu.setVisible(true);
          }
          if (e.getSource() == vw_buscar.btn_atras_buscar) {
              
              vw_buscar.setVisible(false);
              vw_menu.setVisible(true);
          }
          if (e.getSource() == vw_inventario.btn_atras_inventario) {
              
              vw_inventario.setVisible(false);
              vw_menu.setVisible(true);
          }

  
     }
}
