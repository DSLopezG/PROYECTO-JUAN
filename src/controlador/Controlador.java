/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Inicio;
import vista.Menu;

/**
 *
 * @author Daniela Lopez
 */
public class Controlador implements ActionListener  {
        
    private Inicio vw_inicio;
     private Menu vw_menu;
        
     public Controlador (Inicio vw_inicio, Menu vw_menu) {
        this.vw_inicio = vw_inicio;
        this.vw_menu = vw_menu;
        this.vw_inicio.btn_iniciar.addActionListener(this);   
        this.vw_menu.btn_atras.addActionListener(this);
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
          
          if (e.getSource() == vw_menu.btn_atras){
          
              vw_inicio.setVisible(true);
              vw_menu.setVisible(false);
          }
  
     }
}
