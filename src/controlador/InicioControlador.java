/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.Inicio;
import vista.Menu;

public class InicioControlador {
     public static void main(String[] args)  {
                
        Inicio vw_inicio = new Inicio();
        Menu vw_menu = new Menu();

        Controlador ctrl = new Controlador (vw_inicio,vw_menu);
        ctrl.iniciar();
        
        vw_inicio.setVisible(true);
         
        
    }
}
