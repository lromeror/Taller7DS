/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import Decorator.Informe;

/**
 *
 * @author CltControl
 */
public class NotificacionEmail implements Notificacion {

    @Override
    public void enviar(String message) {
        System.out.println("Enviando email: "+message);
    }
}
