/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

/**
 *
 * @author nenod
 */
public class TestDispositivo {
	public static void main(String[] args){
		Laptop lap = new Laptop();
		lap.encender();
		lap.verCargaBateria();
		lap.apagar();
                Celular cel = new Celular("123-4567890");       
                cel.encender();       
                cel.verCargaBateria();       
                cel.llamar("098-7654321"); 
                lap.apagar();       
                cel.apagar();
                 Laptop lap2 = new Laptop();       
                 System.out.println("Lap es igual a Lap2? : " + lap.equals(lap2));       
                 System.out.println("El objeto de " + lap2.getClass().toString() +" llamado lap2 vive en " + lap2.toString()); 
                PSP vita = new PSP("God of war");
                vita.encender();
                vita.iniciarJuego();
                vita.pausarJuego();
                vita.guardarJuego();
                vita.cerrarJuego();
                vita.apagar();
                MP3 pod= new MP3("Like you do");
                pod.encender();
                pod.agregarCancion();
                pod.reproducirCancion();
                pod.pausarCancion();
                pod.apagar();

                
	}
}