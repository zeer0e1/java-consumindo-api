package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoException;
import com.google.gson.annotations.SerializedName;

public class Titulo  implements Comparable<Titulo>{
    private String nome;
    private int anoLancamento;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoException("Não conseguir converter o ano " +
                    "porque tem mais de 84 carcteres");
        }
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer
                .valueOf(meuTituloOmdb
                        .runtime().substring(0,2));
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: "+ anoLancamento);
    }

   public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes ++;
    }

   public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public String getNome(){
        return  this.nome;
    }
    public  void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento(){
        return  this.anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    }

    public boolean getIncluidoNoPlano(){
        return this.getIncluidoNoPlano();
    }

    public  int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(Nome: " + getNome() + " ano: " + getAnoLancamento()
                + " Duracão = " + getDuracaoEmMinutos()+ ")";
    }
}
