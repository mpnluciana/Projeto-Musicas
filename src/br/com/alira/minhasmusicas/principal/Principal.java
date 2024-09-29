package br.com.alira.minhasmusicas.principal;

import br.com.alira.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alira.minhasmusicas.modelos.Musica;

import br.com.alira.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("River Between Us");
        minhaMusica.setBanda("Draconian");
        minhaMusica.setAlbum("Sovran");
        minhaMusica.setGenero("Dom Metal");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bio é Tech!");
        meuPodcast.setApresentador("Proffisão Biotec");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}




