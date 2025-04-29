package br.com.cadUser;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("pessoaBean")
@SessionScoped
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
    private List<String> nomes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void salvar() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomes.add(nome);
            nome = "";
        }
    }

    public void limpar() {
        nome = "";
        nomes.clear();
    }
}

