/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import swing.TelaPrincipal;
import javax.swing.JInternalFrame;

/**
 *
 * @author Oxossi-pc
 */
public class UtilTela {

    /**
     * Método genérico para abrir um jinternalFrame dentro do jdesktoppane da tela principal
     * @param pr
     * @param jif 
     */
    public static void abreTela(TelaPrincipal pr, JInternalFrame jif) {
        jif.setVisible(true);
        pr.adicionaJIF(jif);
        pr.moveToFront(jif);
        try {
            jif.setSelected(true);
        } catch (Exception e) {
        }
    }
}
