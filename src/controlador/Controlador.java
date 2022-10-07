/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Buscar;
import vista.Comprar;
import vista.Inicio;
import vista.Inventario;
import vista.Menu;
import vista.Registro;

public class Controlador implements ActionListener  {
        
     private Inicio vw_inicio;
     private Registro vw_registro;
     private Menu vw_menu;
     private Buscar vw_buscar;
     private Comprar vw_comprar;
     private Inventario vw_inventario;
     
        
     public Controlador (Inicio vw_inicio,Registro vw_registro, Menu vw_menu,Buscar vw_buscar,Comprar vw_comprar,Inventario vw_inventario) {
        
         //clases
        this.vw_inicio = vw_inicio;
        this.vw_registro = vw_registro;
        this.vw_menu = vw_menu;
        this.vw_buscar = vw_buscar;
        this.vw_comprar = vw_comprar;
        this.vw_inventario = vw_inventario;
        
        //botones
        this.vw_inicio.btn_iniciar.addActionListener(this);   
        this.vw_menu.btn_Comprar.addActionListener(this);  
        this.vw_menu.btn_Buscar.addActionListener(this);  
        this.vw_menu.btn_Inventario.addActionListener(this);
        this.vw_menu.btn_Salir.addActionListener(this);
        this.vw_comprar.btn_atras_com.addActionListener(this);
        this.vw_buscar.btn_atras_buscar.addActionListener(this);
        this.vw_inventario.btn_atras_inventario.addActionListener(this);
        
        
     }
     
     
     public void iniciar() {
        vw_inicio.setTitle("PhoneShop");
        vw_inicio.setLocationRelativeTo(null);
    }
     
     public void actionPerformed(ActionEvent e) {
         
          if (e.getSource() == vw_inicio.btn_iniciar) {
              
              vw_inicio.setVisible(false);
              vw_menu.setVisible(true);
          }
          
          if (e.getSource() == vw_menu.btn_Comprar) {
              System.out.print("kshdakldhaslj");
              vw_menu.setVisible(false);
              vw_comprar.setVisible(true);
          }
          
          if (e.getSource() == vw_menu.btn_Buscar) {
              
              vw_menu.setVisible(false);
              vw_buscar.setVisible(true);
          }
          if (e.getSource() == vw_menu.btn_Inventario) {
              
              vw_menu.setVisible(false);
              vw_inventario.setVisible(true);
          }
          if (e.getSource() == vw_menu.btn_Salir) {
              
              vw_menu.setVisible(false);
              JOptionPane.showMessageDialog(null, "GRACIAS POR USAR EL PROGRAMA");
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
