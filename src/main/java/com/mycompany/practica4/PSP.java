/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

/**
 *
 * @author nenod
 */
public class PSP extends DispositivoMovil {
    private String Juego;
    
    PSP(String Juego){
    super(0);
      this.Juego = Juego;      
    }
    
    public void iniciarJuego(){
        System.out.println("Iniciando " + Juego);
    }
    public void pausarJuego(){
        System.out.println("Pausando " + Juego);
    }
    public void guardarJuego(){
        System.out.println("Guardando partida de " + Juego);
    }
    public void cerrarJuego(){
        System.out.println("Cerrando " + Juego);
    }
}
