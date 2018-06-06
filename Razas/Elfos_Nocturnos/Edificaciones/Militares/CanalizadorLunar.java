package Razas.Elfos_Nocturnos.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class CanalizadorLunar implements Militares {
    @Override
    public void crear(String Type){
        UnitFactory Elfos;
        Elfos = UnitProducer.getUnit("Elfos");
        Unidades Quimera = Elfos.getElfo(Type);
    }
}
