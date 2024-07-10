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
    private TelegramService telegramService; 

    public TelegramAdapter(TelegramService telegramService) {
        this.telegramService = telegramService;
    }
    
    @Override
    public void enviar(String message) {
        telegramService.sendMessage(message);
    }
}
