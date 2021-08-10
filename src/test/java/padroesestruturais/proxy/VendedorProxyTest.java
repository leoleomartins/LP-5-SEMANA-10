package padroesestruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Proxy")
class VendedorProxyTest {

    @BeforeEach
    void setUp(){
        BD.addVendedor(new Vendedor(123, "Mario", "Centro", 1000f, 0.1f ));
        BD.addVendedor(new Vendedor(321, "Leo", "Shopping", 5000f, 0.1f ));
    }

    @Test
    @DisplayName("Deve retornar dados do vendedor")
    void deveRetornarDadosDoVendedor(){
        VendedorProxy vendedor = new VendedorProxy(123);

        assertEquals(Arrays.asList("Mario", "Centro"), vendedor.obterDados());
    }

    @Test
    @DisplayName("Deve retornar valor de comissao")
    void deveRetornarValorDeComissao(){
        Funcionario funcionario = new Funcionario("José", true);
        VendedorProxy vendedor = new VendedorProxy(321);

        assertEquals(500f, vendedor.obterComissao(funcionario));
    }

    @Test
    @DisplayName("Deve retornar excecao")
    void deveRetornarNaoAutorizado(){
        Funcionario funcionario = new Funcionario("José", false);
        VendedorProxy vendedor = new VendedorProxy(321);

        assertThrows(IllegalArgumentException.class, ()-> vendedor.obterComissao(funcionario));
    }
}
