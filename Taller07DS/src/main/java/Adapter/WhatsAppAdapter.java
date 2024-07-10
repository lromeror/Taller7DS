/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author CltControl
 */
public class WhatsAppAdapter implements Notificacion {
    private WhatsAppService adaptee; 

    public WhatsAppAdapter(WhatsAppService whatsAppService) {
        this.adaptee = whatsAppService;
    }
    
    @Override
    public void enviar(String message) {
        adaptee.sendNotification(message);
    }
    
}
