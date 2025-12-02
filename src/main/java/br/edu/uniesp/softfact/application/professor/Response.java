package br.edu.uniesp.softfact.application.professor;

public class ProfessorResponse {

    private Integer idProfessor;
    private String nome;
    private String email;

    public ProfessorResponse() {}

    public ProfessorResponse(Integer idProfessor, String nome, String email) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.email = email;
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

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

