package br.dio.desafio.dominio;

public abstract class Conteudo {

    //variaveis
    protected static final double XP_PADRAO = 10;
    private                String titulo;
    private                String descricao;

    //metodos abstratos
    public abstract double calcularXP();

    //getter e setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
