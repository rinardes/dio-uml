package com.model.ipod;

public class MusicPlayer {
    private Musica musicaAtual;

    public void tocar(){
        System.out.println("Tocar música");
    }

    public void pausar(){
        System.out.println("Pausar música");
    }

    public void controlarVolume(){
        System.out.println("Controlando o volume");
    }

    public void trocarMusica(Musica musica){
        System.out.println(String.format("Tocando para a música", musica.getNome()));
    }
}
