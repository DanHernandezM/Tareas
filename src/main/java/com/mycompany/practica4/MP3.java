/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

/**
 *
 * @author nenod
 */
public class MP3 extends DispositivoMovil{
    private String Musica; 
    MP3(String Musica){
        super(0);
        this.Musica = Musica;   
    }
    public void agregarCancion(){
        System.out.println(Musica + " agregada");
    }
        public void reproducirCancion(){
        System.out.println("Reproduciendo " + Musica);
    }
        public void pausarCancion(){
        System.out.println("Musica pausada");
    }    
        
    }
