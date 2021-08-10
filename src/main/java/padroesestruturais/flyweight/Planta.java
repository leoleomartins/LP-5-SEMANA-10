package padroesestruturais.flyweight;

public class Planta {
    private String nome;
    private Cor cor;

    public Planta(String nome, Cor cor) {
        this.nome = nome;
        this.cor = cor;
    }

   public String obterPlanta(){
        return "Planta{" +
                "nome='" +this.nome + '\''+
                ", cor='" + cor.getNome() + '\'' +
                "}";
   }
}
