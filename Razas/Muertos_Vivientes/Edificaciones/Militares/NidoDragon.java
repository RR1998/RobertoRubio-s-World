package Razas.Muertos_Vivientes.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class NidoDragon implements Militares {
    @Override
    public void crear(String Type){
        UnitFactory Muertos;
        Muertos = UnitProducer.getUnit("Muertos");
        Unidades Dragon = Muertos.getMuerto(Type);
    }
}
