/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoyoescolar;

import UpperEssential.UpperEssentialLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ApoyoEscolar {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
         UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
      // UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\AriesCool Vj\\Documents\\NetBeansProjects\\Librerias\\Chocolate.theme"));
       apoyoEscuela lib =new apoyoEscuela();
       lib.setLocationRelativeTo(null);
       lib.setVisible(true);
       lib.setTitle("APOYO ESCOLAR");
    }
    
}
