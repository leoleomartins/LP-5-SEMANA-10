package padroesestruturais.flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("FlyWeight")
class FloriculturaTest {

    @Test
    @DisplayName("Deve retornar plantas")
    void deveRetornarPlantas (){
        Floricultura floricultura = new Floricultura();
        floricultura.cadastrar("Ipe", "Verde");
        floricultura.cadastrar("Babosa", "Verde");
        floricultura.cadastrar("Cacto","Verde");
        floricultura.cadastrar("Margarida", "Amarela");

        List<String> saida = Arrays.asList(
                "Planta{nome='Ipe', cor='Verde'}",
                "Planta{nome='Babosa', cor='Verde'}",
                "Planta{nome='Cacto', cor='Verde'}",
                "Planta{nome='Margarida', cor='Amarela'}");

        assertEquals(saida, floricultura.obterPlantas());
    }

    @Test
    @DisplayName("Deve retornar o total")
    void deveRetornarTotalPlantas(){
        Floricultura floricultura = new Floricultura();
        floricultura.cadastrar("Ipe", "Verde");
        floricultura.cadastrar("Babosa", "Verde");
        floricultura.cadastrar("Cacto","Verde");
        floricultura.cadastrar("Margarida", "Amarela");

        assertEquals(2, CorFactory.getTotalCores());
    }
}
