/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_11;

import javax.swing.JOptionPane;

/**
 *
 * @author ifernandezblanco
 */
class Periodo_Tempo {
    public Periodo_Tempo(){}
    
    public void Periodo(){
    long comienzo, fin;
    comienzo=System.currentTimeMillis();
            JOptionPane.showMessageDialog(null, "Escribe la siguiente frase"+ "A documentación é todo aquel conxunto de manuais impresos ou en formate dixital que explique unha aplicación informática");
    fin=System.currentTimeMillis();
    long tiempo=fin-comienzo;
            JOptionPane.showMessageDialog(null,"Tardaches "+(tiempo/60)+"tempo en escribir esta frase");
}
}

