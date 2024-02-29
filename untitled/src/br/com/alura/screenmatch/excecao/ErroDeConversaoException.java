package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoException extends RuntimeException {
    private  String mensagem;
    public ErroDeConversaoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
