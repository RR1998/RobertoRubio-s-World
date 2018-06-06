package Razas.Orcos.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class CampamentoDeGuerra implements Militares {
    @Override
    public void crear(String Type){
        UnitFactory Orcos;
        Orcos = UnitProducer.getUnit("Orcos");
        if (Type == "Bruto"){
            Unidades Bruto = Orcos.getOrco(Type);
        }
        if (Type == "Brujo"){
            Unidades Brujo = Orcos.getOrco(Type);
        }
        if (Type == "SenorGuerra"){
            Unidades Senor = Orcos.getOrco(Type);
        }
    }
}
