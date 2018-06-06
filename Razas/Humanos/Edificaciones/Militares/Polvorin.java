package Razas.Humanos.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class Polvorin implements Militares {
    @Override
    public void crear(String Type){
        UnitFactory Humanos;
        Humanos = UnitProducer.getUnit("Humanos");
        Unidades Mortero = Humanos.getHumano(Type);
    }
}
