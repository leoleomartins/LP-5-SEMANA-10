package padroesestruturais.proxy;

public class Funcionario {
    private String nome;
    private boolean admin;

    public Funcionario(String nome, boolean admin) {
        this.nome = nome;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
