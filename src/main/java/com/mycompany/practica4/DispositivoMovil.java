/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

/**
 *
 * @author nenod
 */
public class DispositivoMovil {
	
	public float velocidadProcesador;
	public int cargaBateria;
	protected int memoria;
	protected String sistemaOperativo;
	protected String marca;
	protected String modelo;
	
	public void encender() {
		System.out.println("Starting up...");		
	}
	
	public final void apagar() {
		System.out.println("Shutting down...");
	}
	
	public int verCargaBateria() {
		System.out.println("Queda un " + cargaBateria + "% de bateria.");
		return cargaBateria;
        }
        public DispositivoMovil (int x) {       
             System.out.println("Haré que Laptop deje de funcionar! :D");    
         }         
	
	
}