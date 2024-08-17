package modular.software.example.service.impl;

import modular.software.example.service.Notificacao;

public class SMSNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}