/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.Buscar;
import vista.Comprar;
import vista.Inicio;
import vista.Inventario;
import vista.Menu;
import vista.Registro;
import vista.Sesion;

public class InicioControlador {
     public static void main(String[] args)  {
                
        Inicio vw_inicio = new Inicio();
        Registro vw_registro = new Registro();
        Menu vw_menu = new Menu();
        Buscar vw_buscar = new Buscar();
        Comprar vw_comprar = new Comprar();
        Inventario vw_inventario = new Inventario();
        Sesion vw_sesion = new Sesion();
        
      
        Controlador ctrl = new Controlador (vw_inicio,vw_registro,vw_menu,vw_buscar,vw_comprar,vw_inventario,vw_sesion);
        ctrl.iniciar();
        
        vw_inicio.setVisible(true);
        
        //mdaskljdasidj
         
        
    }
}
