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
    private WhatsAppService whatsAppService; 

    public WhatsAppAdapter(WhatsAppService whatsAppService) {
        this.whatsAppService = whatsAppService;
    }
    
    @Override
    public void enviar(String message) {
        whatsAppService.sendMessage(message);
    }
    
}
