/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodados;
import java.util.Random;

/**
 *
 * @author Bryan Pérez Delgado
 */
public class Dados {
    private Random dado = null;
    
    public Dados(){
        dado = new Random();
    }
    public int genNum(){
        return dado.nextInt(6)+1;
    }
}
