package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private  int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//     public void inclui(Serie f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }



}
