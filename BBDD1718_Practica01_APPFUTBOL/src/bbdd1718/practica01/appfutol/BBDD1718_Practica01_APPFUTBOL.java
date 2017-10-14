/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd1718.practica01.appfutol;

import bbdd1718.practica01.clases.AppFutbol;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class BBDD1718_Practica01_APPFUTBOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        AppFutbol.iu.setVisible(true);
        AppFutbol.CargarDatos();
    }
    
}
