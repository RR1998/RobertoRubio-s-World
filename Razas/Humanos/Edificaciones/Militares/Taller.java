package Razas.Humanos.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class Taller implements Militares {
    @Override
    public void crear(String Type){
        UnitFactory Humanos;
        Humanos = UnitProducer.getUnit("Humanos");
        Unidades Girocoptero = Humanos.getHumano(Type);
    }
}
