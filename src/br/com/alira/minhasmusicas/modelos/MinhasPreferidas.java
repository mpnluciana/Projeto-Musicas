package br.com.alira.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getCassificacao()>=9){
            System.out.println(audio.getTitulo()+" � considerado um grande sucesso.");
        }else{
            System.out.println(audio.getTitulo()+" � uma m�sica �tima op��o para ouvir.");
        }

    }
}
