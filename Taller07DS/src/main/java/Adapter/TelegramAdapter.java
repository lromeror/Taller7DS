/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author CltControl
 */
public class TelegramAdapter implements Notificacion {
    private TelegramService adaptee; 

    public TelegramAdapter(TelegramService telegramService) {
        this.adaptee = telegramService;
    }
    
    @Override
    public void enviar(String message) {
        adaptee.sendNotification(message);
    }
}
