package Razas.Muertos_Vivientes.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class CasaDeTortura implements Militares {
    @Override
    public void crear(String Type){
        UnitFactory Muertos;
        Muertos = UnitProducer.getUnit("Muertos");
        if (Type == "Abominacion"){
            Unidades Abominacion = Muertos.getMuerto(Type);
        }
        if (Type == "Necromancer"){
            Unidades Necromancer = Muertos.getMuerto(Type);
        }
        if (Type == "CaballeroMuerte"){
            Unidades Caballero = Muertos.getMuerto(Type);
        }
    }
}
