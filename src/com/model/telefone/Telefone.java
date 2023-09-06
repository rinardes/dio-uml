package com.model.telefone;

import com.model.contatos.Contatos;

public class Telefone {

    private GerenciadorDeChamadas gerenciadorDeChamadas;
    private Contatos contatos;

    public void Discar(){
        System.out.println("Abrindo opção de discar");
    }

    public void Ligar(String numero){
        System.out.println(String.format("Ligando para o número %s", numero));
    }

    public void Atender(){
        System.out.println("Atender Chamada");
    }

    public void CorreioDeVoz(){
        System.out.println("Abrindo correio de voz");
    }

    public void ListarContatos(){
        System.out.println(contatos.getContatos());
    }
}
