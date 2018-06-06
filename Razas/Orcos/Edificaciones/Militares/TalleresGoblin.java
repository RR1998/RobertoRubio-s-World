package Razas.Orcos.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class TalleresGoblin implements Militares {
    @Override
    public void crear(String Type){
        UnitFactory Orcos;
        Orcos = UnitProducer.getUnit("Orcos");
        Unidades Globo = Orcos.getOrco(Type);
    }
}
