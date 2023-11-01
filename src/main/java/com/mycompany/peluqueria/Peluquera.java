/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueria;

import java.util.Random;

/**
 *
 * @author USER
 */
public class Peluquera implements Runnable{
    private final Peluqueria peluqueria;
    private final String nombre;

    public Peluquera(Peluqueria peluqueria, String nombre) {
        this.peluqueria = peluqueria;
        this.nombre = nombre;
    }
    
    @Override
    public void run(){
        Random random = new Random();
        try{
            while(true){
                Cliente cliente = peluqueria.obtenerCliente();
                System.out.println(nombre + "comienza a anteder a "+ cliente.getName());
                int tiempoAtencion = random.nextInt(10);
                Thread.sleep(tiempoAtencion + 1000);
                System.out.println(nombre + "ha terminado de atender a "+ cliente.getName() + " en " + tiempoAtencion + " segundos ");
            }
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
