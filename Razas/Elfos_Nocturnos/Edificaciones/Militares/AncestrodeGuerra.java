package Razas.Elfos_Nocturnos.Edificaciones.Militares;


import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class AncestrodeGuerra implements Militares {
    @Override
    public void crear(String Type){
        UnitFactory Elfos;
        Elfos = UnitProducer.getUnit("Elfos");
        if (Type == "Arquero") {
            Unidades Arquero = Elfos.getElfo(Type);
        }
        if (Type == "Sable Luna Plata"){
            Unidades Sable = Elfos.getElfo(Type);
        }
        if (Type == "Sacerdotiza Lunar"){
            Unidades Sacerdotiza = Elfos.getElfo(Type);
        }
    }
}
