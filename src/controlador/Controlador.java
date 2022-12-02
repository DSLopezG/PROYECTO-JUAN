/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

public class Controlador implements ActionListener {

    private Inicio vw_inicio;
    private Registro vw_registro;
    private Menu vw_menu;
    private Buscar vw_buscar;
    private Comprar vw_comprar;
    private Inventario vw_inventario;
    private Sesion vw_sesion;

    public Controlador(Inicio vw_inicio, Registro vw_registro, Menu vw_menu, Buscar vw_buscar, Comprar vw_comprar, Inventario vw_inventario, Sesion vw_sesion) {

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
        this.vw_comprar.btn_comprar.addActionListener(this);
        this.vw_inventario.btn_actu_inventario.addActionListener(this);
        this.vw_registro.btn_atras_registrar.addActionListener(this);
        this.vw_inventario.btn_buscar_inventario.addActionListener(this);
        this.vw_inventario.btn_atras_inventario.addActionListener(this);
        this.vw_buscar.btn_imp_buscar.addActionListener(this);
        this.vw_menu.btn_cerrar_sesion.addActionListener(this);

    }

    public void iniciar() {
        vw_inicio.setTitle("PhoneShop");
        vw_inicio.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vw_inicio.btn_iniciar) {

            vw_inicio.setVisible(false);
            vw_sesion.setVisible(true);
            vw_sesion.setLocationRelativeTo(null);
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
                while (rs.next()) {

                    usuario = rs.getString("Usuario");
                    //System.out.println(usuario);
                    contra = rs.getString("Contraseña");
                    //System.out.println(contra);     

                    if ((vw_sesion.txt_inicio_usu.getText().equalsIgnoreCase(usuario) && vw_sesion.txt_inicio_contra.getText().equals(contra))) {

                        vw_menu.setVisible(true);
                        vw_sesion.setVisible(false);
                        vw_menu.setLocationRelativeTo(null);

                    }
                    
                }

            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                

            }

        }
        if (e.getSource() == vw_sesion.btn_registrar_inicio) {

            vw_registro.setVisible(true);
            vw_sesion.setVisible(false);
            vw_registro.setLocationRelativeTo(null);

        }

        if (e.getSource() == vw_registro.btn_registrar) {

            if (vw_registro.txt_nom_reg.getText().length() != 0 && vw_registro.txt_ape_reg.getText().length() != 0
                    && vw_registro.txt_usuario_reg.getText().length() != 0 && vw_registro.txt_contra_reg.getText().length() != 0) {

                String nombre = vw_registro.txt_nom_reg.getText();
                String apellido = vw_registro.txt_ape_reg.getText();
                String usuario = vw_registro.txt_usuario_reg.getText();
                String contraseña = vw_registro.txt_contra_reg.getText();

                PreparedStatement ps = null;
                ConexionBD conn = new ConexionBD();
                Connection con = (Connection) conn.getConexion();

                String sql2 = "INSERT INTO usuarios (Nombre, Apellido, Usuario, Contraseña) VALUES ('" + nombre + "', '" + apellido + "', '" + usuario + "', '" + contraseña + "');";

                try {

                    ps = (PreparedStatement) con.prepareStatement(sql2);
                    ps.executeUpdate();

                    vw_registro.setVisible(false);
                    JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                    vw_sesion.setVisible(true);
                    vw_sesion.setLocationRelativeTo(null);

                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "REGISTRO RECHAZADO");
                }

            } else if (vw_registro.txt_nom_reg.getText().length() == 0 || vw_registro.txt_ape_reg.getText().length() == 0
                    || vw_registro.txt_usuario_reg.getText().length() == 0 || vw_registro.txt_contra_reg.getText().length() == 0) {

                JOptionPane.showMessageDialog(null, "FALTAN CAMPOS POR LLENAR");
            }

        }

        
        
        
        
        //COMPRAR
        if (e.getSource() == vw_menu.btn_Comprar) {

            vw_menu.setVisible(false);
            vw_comprar.setVisible(true);
            vw_comprar.setLocationRelativeTo(null);
        }

        if (e.getSource() == vw_comprar.btn_comprar) {

            if (vw_comprar.txt_nom_com.getText().length() != 0 && vw_comprar.txt_doc_com.getText().length() != 0
                    && vw_comprar.txt_tel_com.getText().length() != 0 && vw_comprar.txt_dir_com.getText().length() != 0) {

                String nombre = vw_comprar.txt_nom_com.getText();
                String documento = vw_comprar.txt_doc_com.getText();
                String telefono = vw_comprar.txt_tel_com.getText();
                String direccion = vw_comprar.txt_dir_com.getText();
                String marca = (String) vw_comprar.cbx_celulares_comprar.getSelectedItem();
                String cargador = (String) vw_comprar.cbx_cargador_comprar.getSelectedItem();
                String audifonos = (String) vw_comprar.cbx_audifono_comprar.getSelectedItem();
                int precio = 0;

                // celular
                if (marca.equalsIgnoreCase("SAMSUNG GALAXY S22 ULTRA")) {
                    precio = precio + 4772941;
                }
                if (marca.equalsIgnoreCase("APPLE 13 PRO MAX")) {
                    precio = precio + 15390000;
                }
                if (marca.equalsIgnoreCase("OPPO RENO 7 SERIES")) {
                    precio = precio + 3399000;
                }
                if (marca.equalsIgnoreCase("XIAOMI MI 11 ULTRA")) {
                    precio = precio + 9900000;
                }

                //cargador
                if (cargador.equalsIgnoreCase("CARGADOR INALAMBRICO CARGA RAPIDA")) {
                    precio = precio + 370000;
                }
                if (cargador.equalsIgnoreCase("CARGADOR TURBO POWER TIPO C")) {
                    precio = precio + 220000;
                }
                if (cargador.equalsIgnoreCase("CARGADOR MAGNETICO TODAS LAS MARCAS")) {
                    precio = precio + 70000;
                }
                if (cargador.equalsIgnoreCase("POWER BANK")) {
                    precio = precio + 139000;
                }

                //audifonos
                if (audifonos.equalsIgnoreCase("AIR PODS PRO 2")) {
                    precio = precio + 1529000;
                }
                if (audifonos.equalsIgnoreCase("JBL IN EAR ENDURANCE")) {
                    precio = precio + 113848;
                }
                if (audifonos.equalsIgnoreCase("SONY ZX SERIES MDR")) {
                    precio = precio + 103000;
                }
                if (audifonos.equalsIgnoreCase("HUAWEI FREE BUDS 4I")) {
                    precio = precio + 299900;
                }

                String precioFinal = String.valueOf(precio);
                vw_comprar.txt_precio_com.setText(precioFinal);

                PreparedStatement ps = null;
                PreparedStatement ps1 = null;
                PreparedStatement ps2 = null;
                ConexionBD conn = new ConexionBD();
                Connection con = (Connection) conn.getConexion();

                String sql2 = "INSERT INTO ventas (Nombre, Documento, Telefono, Direccion, Marca, Cargador, Audifonos, Precio) VALUES ('" + nombre + "', '" + documento + "', '" + telefono + "', '" + direccion + "', '" + marca + "', '" + cargador + "', '" + audifonos + "' , '" + precio + "' );";

                try {

                    ps = (PreparedStatement) con.prepareStatement(sql2);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "COMPRA EXITOSO");

                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "COMPRA RECHAZADO");
                }
                 
                
                
                
                
                
                
                String articulo =  (String) vw_comprar.cbx_celulares_comprar.getSelectedItem();
                 String sql3 = "UPDATE inventario SET cantidad = (cantidad-1) WHERE articulo = '" + articulo + "';";
                String articulo2 =  (String) vw_comprar.cbx_cargador_comprar.getSelectedItem();
                 String sql4 = "UPDATE inventario SET cantidad = (cantidad-1) WHERE articulo = '" + articulo2 + "';";
                String articulo3 =  (String) vw_comprar.cbx_audifono_comprar.getSelectedItem();
                 String sql5 = "UPDATE inventario SET cantidad = (cantidad-1) WHERE articulo = '" + articulo3 + "';";
                try {

                    ps = (PreparedStatement) con.prepareStatement(sql3);
                    ps1 = (PreparedStatement) con.prepareStatement(sql4);
                    ps2 = (PreparedStatement) con.prepareStatement(sql5);
                    
                    ps.executeUpdate();
                    ps1.executeUpdate();
                    ps2.executeUpdate();
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
 
                }
                

                
                
                
                
                
                
            } else if (vw_comprar.txt_nom_com.getText().length() == 0 && vw_comprar.txt_doc_com.getText().length() == 0
                    && vw_comprar.txt_tel_com.getText().length() == 0 && vw_comprar.txt_dir_com.getText().length() == 0) {

                JOptionPane.showMessageDialog(null, "FALTAN CAMPOS POR LLENAR");
            }
        }

        
        
        
        
        
        //BUSCAR
        if (e.getSource() == vw_menu.btn_Buscar) {

            vw_menu.setVisible(false);
            vw_buscar.setVisible(true);
            vw_buscar.setLocationRelativeTo(null);

        }

        if (e.getSource() == vw_buscar.btn_buscar_buscar) {

            DefaultTableModel modelo = new DefaultTableModel();
            vw_buscar.tabla_buscar.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionBD conn = new ConexionBD();
            Connection con = (Connection) conn.getConexion();

            String codigo = vw_buscar.txt_Factura.getText();
            String sql5 = "";

            sql5 = "SELECT * FROM ventas where numfactura=" + codigo + ";";
            if (codigo.length() == 0 || codigo.equalsIgnoreCase("0")) {
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
                modelo.addColumn("Direccion");
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
            vw_inventario.setLocationRelativeTo(null);

            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionBD conn = new ConexionBD();
            Connection con = (Connection) conn.getConexion();

            String sql = "SELECT * FROM inventario";
            try {
                ps = (PreparedStatement) con.prepareStatement(sql);
                rs = ps.executeQuery();
                ResultSetMetaData rsMD = (ResultSetMetaData) rs.getMetaData();

                int cantidadColumnas = rsMD.getColumnCount();

                modelo.addColumn("idInventario");
                modelo.addColumn("articulo");
                modelo.addColumn("cantidad");

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

        if (e.getSource() == vw_inventario.btn_actu_inventario) {

            PreparedStatement ps = null;
            ConexionBD conn = new ConexionBD();
            Connection con = (Connection) conn.getConexion();

            String cantidad = vw_inventario.txt_cantidad_inventario.getText();
            String articulo = (String) vw_inventario.cbx_opc_inventario.getSelectedItem();

            String sql55 = "UPDATE inventario SET cantidad = (cantidad+'" + cantidad + "') WHERE articulo = '" + articulo + "';";

            try {
                ps = (PreparedStatement) con.prepareStatement(sql55);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN EXITOSA");

            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN RECHAZADA");
            }
            
            
            DefaultTableModel modelo = new DefaultTableModel();
            vw_inventario.tabla_inventario.setModel(modelo);

            vw_menu.setVisible(false);
            vw_inventario.setVisible(true);
            vw_inventario.setLocationRelativeTo(null);

            
          
            ResultSet rs = null;
           
            String sql67 = "SELECT * FROM inventario; ";
            

            try {
                ps = (PreparedStatement) con.prepareStatement(sql67);
                rs = ps.executeQuery();
                ResultSetMetaData rsMD = (ResultSetMetaData) rs.getMetaData();

                int cantidadColumnas = rsMD.getColumnCount();

                modelo.addColumn("idInventario");
                modelo.addColumn("articulo");
                modelo.addColumn("cantidad");

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

        //
        if (e.getSource() == vw_inventario.btn_buscar_inventario) {

            DefaultTableModel modelo = new DefaultTableModel();
            vw_inventario.tabla_inventario.setModel(modelo);

            vw_menu.setVisible(false);
            vw_inventario.setVisible(true);
            vw_inventario.setLocationRelativeTo(null);

            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionBD conn = new ConexionBD();
            Connection con = (Connection) conn.getConexion();

            String articulo = (String) vw_inventario.cbx_opc_inventario.getSelectedItem();
            String sql = "SELECT * FROM inventario WHERE articulo = '" + articulo + "';";

            if (articulo.equalsIgnoreCase("NINGUNO")) {
                sql = "SELECT * FROM inventario; ";
            }

            try {
                ps = (PreparedStatement) con.prepareStatement(sql);
                rs = ps.executeQuery();
                ResultSetMetaData rsMD = (ResultSetMetaData) rs.getMetaData();

                int cantidadColumnas = rsMD.getColumnCount();

                modelo.addColumn("idInventario");
                modelo.addColumn("articulo");
                modelo.addColumn("cantidad");

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
        //

        if (e.getSource() == vw_menu.btn_Salir) {

            vw_menu.setVisible(false);
            JOptionPane.showMessageDialog(null, "GRACIAS POR USAR EL PROGRAMA");
            System.exit(0);

        }

        if (e.getSource() == vw_comprar.btn_atras_com) {

            vw_comprar.setVisible(false);
            vw_menu.setVisible(true);
            vw_comprar.txt_nom_com.setText(null);
            vw_comprar.txt_doc_com.setText(null);
            vw_comprar.txt_tel_com.setText(null);
            vw_comprar.txt_dir_com.setText(null);
            vw_comprar.txt_precio_com.setText(null);
            vw_comprar.cbx_celulares_comprar.setSelectedIndex(0);
            vw_comprar.cbx_cargador_comprar.setSelectedIndex(0);
            vw_comprar.cbx_audifono_comprar.setSelectedIndex(0);
        }
        if (e.getSource() == vw_buscar.btn_atras_buscar) {

            vw_buscar.setVisible(false);
            vw_menu.setVisible(true);
            vw_menu.setLocationRelativeTo(null);
        }
        if (e.getSource() == vw_inventario.btn_atras_inventario) {

            vw_inventario.setVisible(false);
            vw_menu.setVisible(true);
            vw_menu.setLocationRelativeTo(null);
        }

        if (e.getSource() == vw_registro.btn_atras_registrar) {

            vw_registro.setVisible(false);
            vw_sesion.setVisible(true);
            vw_sesion.setLocationRelativeTo(null);
        }
        
         if (e.getSource() == vw_menu.btn_cerrar_sesion) {

            vw_menu.setVisible(false);
            vw_sesion.setVisible(true);
            vw_sesion.setLocationRelativeTo(null);
        }
         
        if(e.getSource() == vw_buscar.btn_imp_buscar){
            
            DefaultTableModel modelo = new DefaultTableModel();
            vw_buscar.tabla_buscar.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionBD conn = new ConexionBD();
            Connection con = (Connection) conn.getConexion();

            String codigo = vw_buscar.txt_Factura.getText();
            String sql5 = "";

            sql5 = "SELECT * FROM ventas where numfactura=" + codigo + ";";
            if (codigo.length() == 0 || codigo.equalsIgnoreCase("0")) {
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
                modelo.addColumn("Direccion");
                modelo.addColumn("Marca");
                modelo.addColumn("Cargador");
                modelo.addColumn("Audifonos");
                modelo.addColumn("Precio");
                
                
                //CREAR ARCHIVO
            String pathname = "FACTURA.txt";
            File f = new File(pathname);
            try {
                if (f.createNewFile()) {
                    System.out.println("File created with filename: " + f.getName());
                } else {
                    System.out.println("File already exists");
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }

            System.out.println("File path: " + f.getAbsolutePath());

            String filename = "FACTURA.txt";
            FileWriter fw = null;   

                while (rs.next()) {

                    Object[] filas = new Object[cantidadColumnas];

                    for (int i = 0; i < cantidadColumnas; i++) {

                        filas[i] = rs.getObject(i + 1);
                        
                        try {
                fw = new FileWriter(filename);
                fw.write(
                        "FACTURA GENERADA\n"
                        + "Nombre: " + filas[1] + "\n"
                        + "Documento: " + filas[2] + "\n"
                        + "Telefono: " + filas[3] + "\n"
                        + "Dirección: " + filas[4]
                        + "\n\n***********************************************************"
                        + "\n\n         PRODUCTOS ADQUIRIDOS\n\n: "
                        + "\nCelular: " + filas[5]
                        + "\nCargador: " + filas[6]
                        + "\nAudifonos: " + filas[7]
                        + "\nPrecio: " + filas[8]);

                fw.close();
                            System.out.println("FACTURA GENERADA");
            } catch (IOException ex) {
                System.out.println(ex);
            }

                    }

                    modelo.addRow(filas);

                }

            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null,"FACTURA GENERADA");
            
            
        }
    }
}
