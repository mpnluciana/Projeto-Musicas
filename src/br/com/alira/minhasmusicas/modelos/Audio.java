package br.com.alira.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int cassificacao;

    //métodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getCassificacao() {
        return cassificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }
}
