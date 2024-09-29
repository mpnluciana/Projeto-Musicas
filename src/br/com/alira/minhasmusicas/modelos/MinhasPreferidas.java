package br.com.alira.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getCassificacao()>=9){
            System.out.println(audio.getTitulo()+" é considerado um grande sucesso.");
        }else{
            System.out.println(audio.getTitulo()+" é uma música ótima opção para ouvir.");
        }

    }
}
