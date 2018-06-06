package Razas.Orcos.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class Bestiario implements Militares {
    @Override
    public void crear (String Type){
        UnitFactory Orcos;
        Orcos = UnitProducer.getUnit("Orcos");
        Unidades Bestias = Orcos.getOrco(Type);
    }
}
