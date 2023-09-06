package com.model.contatos;

import java.util.List;

public class Contatos {
    private List<Contato> contatos;

    public void SincronizarContatos(){
        System.out.println("Contatos Sincronizados");
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}
