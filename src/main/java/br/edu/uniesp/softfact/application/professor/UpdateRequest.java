package br.edu.uniesp.softfact.application.professor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class ProfessorUpdateRequest {

    @Size(max = 150)
    private String nome;

    @Email(message = "Formato de email inválido.")
    @Size(max = 150)
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

