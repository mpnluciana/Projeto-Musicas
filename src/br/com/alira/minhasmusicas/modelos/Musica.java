package br.com.alira.minhasmusicas.modelos;

public class Musica extends Audio{
    private String album;
    private String banda;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String cantor) {
        this.banda = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getCassificacao() {
        if(this.getTotalReproducoes()>2000){
            return 10;
        }else{
            return 7;
        }
    }
}
