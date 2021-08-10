package padroesestruturais.proxy;

import java.util.Arrays;
import java.util.List;

public class Vendedor implements IVendedor {

    private Integer registro;
    private String nome;
    private String loja;
    private Float totalVendas;
    private Float taxaComissao;

    public Vendedor(int registro){
        this.registro = registro;
        Vendedor vendedor = BD.getVendedor(registro);
        this.nome = vendedor.nome;
        this.loja = vendedor.loja;
        this.totalVendas = vendedor.totalVendas;
        this.taxaComissao = vendedor.taxaComissao;
    }

    public Vendedor(Integer registro, String nome, String loja, Float totalVendas, Float taxaComissao) {
        this.registro = registro;
        this.nome = nome;
        this.loja = loja;
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    public Integer getRegistro() {
        return registro;
    }

    @Override
    public List<String> obterDados() {
        return Arrays.asList(this.nome, this.loja);
    }

    @Override
    public Float obterComissao(Funcionario funcionario) {
        return this.taxaComissao * this.totalVendas;
    }
}
