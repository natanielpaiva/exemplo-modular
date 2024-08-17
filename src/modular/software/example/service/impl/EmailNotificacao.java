package modular.software.example.service.impl;

import modular.software.example.service.Notificacao;

public class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
