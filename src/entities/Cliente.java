package entities;

public class Cliente {
    private String nome;
    private String email;
    private String birthDate;

    public Cliente() {
    }

    public Cliente(String nome, String email, String birthDate) {
        this.nome = nome;
        this.email = email;
        this.birthDate = birthDate;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Cliente [birthDate=" + birthDate + ", email=" + email + ", nome=" + nome + "]";
    }
}
