package Razas.Humanos.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class Cuartel implements Militares {
    @Override
    public void crear(String Type){
        UnitFactory Humanos;
        Humanos = UnitProducer.getUnit("Humanos");
        if (Type == "Soldado"){
            Unidades Soldado = Humanos.getHumano(Type);
        }
        if (Type == "Fusilero"){
            Unidades Fusilero = Humanos.getHumano(Type);
        }
        if (Type == "Paladin"){
            Unidades Paladin = Humanos.getHumano(Type);
        }
    }
}
