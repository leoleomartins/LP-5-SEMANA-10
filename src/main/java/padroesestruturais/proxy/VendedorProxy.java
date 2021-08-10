package padroesestruturais.proxy;

import java.util.List;

public class VendedorProxy implements IVendedor {

    private Vendedor vendedor;
    private Integer registro;

    public VendedorProxy(Integer registro){this.registro = registro;}


    @Override
    public List<String> obterDados() {
        if (this.vendedor == null) {
            this.vendedor = new Vendedor(this.registro);
        }
        return this.vendedor.obterDados();
    }

    @Override
    public Float obterComissao(Funcionario funcionario) {
       if (!funcionario.isAdmin()){
           throw new IllegalArgumentException("Funcionario não autorizado");
       }
       if(this.vendedor == null){
           this.vendedor = new Vendedor(this.registro);
       }
       return this.vendedor.obterComissao(funcionario);
    }
}
