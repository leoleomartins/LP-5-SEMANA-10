package padroesestruturais.proxy;

import java.util.List;

public interface IVendedor {
    List<String> obterDados();
    Float obterComissao(Funcionario funcionario);
}
