package modular.software.example;

import modular.software.example.service.GerenciadorDeNotificacoes;
import modular.software.example.service.Notificacao;
import modular.software.example.service.impl.EmailNotificacao;
import modular.software.example.service.impl.SMSNotificacao;

public class Main {
    public static void main(String[] args) {
        Notificacao emailNotificacao = new EmailNotificacao();
        Notificacao smsNotificacao = new SMSNotificacao();

        GerenciadorDeNotificacoes gerenciadorEmail = new GerenciadorDeNotificacoes(emailNotificacao);
        GerenciadorDeNotificacoes gerenciadorSMS = new GerenciadorDeNotificacoes(smsNotificacao);

        gerenciadorEmail.enviarNotificacao("Olá! Esta é uma notificação por e-mail.");
        gerenciadorSMS.enviarNotificacao("Olá! Esta é uma notificação por SMS.");
    }
}