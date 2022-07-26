package br.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    //variaveis
    private LocalDate data;

    //construtor
    public Mentoria() {
    }

    //getter e setter
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //metodos
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + getData() +
                '}';
    }
}
