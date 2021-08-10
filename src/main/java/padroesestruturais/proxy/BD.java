package padroesestruturais.proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Vendedor> vendedores = new HashMap<>();

    public static Vendedor getVendedor(Integer registro){
        return vendedores.get(registro);
    }

    public static void addVendedor(Vendedor vendedor){
        vendedores.put(vendedor.getRegistro(), vendedor);
    }
}
