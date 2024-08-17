package modular.software.example.service;

public class GerenciadorDeNotificacoes {
    private Notificacao notificacao;

    public GerenciadorDeNotificacoes(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void enviarNotificacao(String mensagem) {
        notificacao.enviar(mensagem);
    }
}
