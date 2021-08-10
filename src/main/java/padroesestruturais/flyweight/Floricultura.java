package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Floricultura {

    private List<Planta> plantas = new ArrayList<>();

    public void cadastrar(String nomePlanta, String nomeCor){
        Cor cor = CorFactory.getCor(nomeCor);
        Planta planta = new Planta(nomePlanta, cor);
        plantas.add(planta);
    }

    public List<String> obterPlantas(){
        List<String> saida = new ArrayList<>();
        for(Planta planta: this.plantas){
            saida.add(planta.obterPlanta());
        }
        return saida;
    }
}
