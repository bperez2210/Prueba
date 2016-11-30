/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodados;
/**
 *
 * @author Usuario
 */
public class Jugador {
    private String nombre;
    
    public Jugador(){
        nombre = "";
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public void tiraDados(Dados dado){
        int turno = dado.genNum();
        System.out.println("El jugador" + getNombre());
        System.out.println("El dado a caido en " + turno);
    }
}
