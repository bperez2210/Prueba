/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodados;
/**
 *
 * @author Bryan Pérez Delgado
 */
public class JuegoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dados d1 = new Dados();
        Dados d2 = new Dados();
        Jugador j1 = new Jugador();
        j1.tiraDados(d1);
        j1.tiraDados(d2);
    }
    
}
