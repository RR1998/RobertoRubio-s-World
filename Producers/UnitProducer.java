package Producers;

import Interfaces.UnitFactory;
import Razas.Elfos_Nocturnos.Unidades.GeneradorElfos;
import Razas.Humanos.Unidades.GeneradorHumanos;
import Razas.Muertos_Vivientes.Unidades.GeneradorMuertos;
import Razas.Orcos.Unidades.GeneradorOrcos;

public class UnitProducer {
    public static UnitFactory getUnit(String Type){
        switch (Type){
            case"Elfos":
                return new GeneradorElfos();
            case"Humanos":
                return new GeneradorHumanos();
            case"Muertos":
                return new GeneradorMuertos();
            case "Orcos":
                return new GeneradorOrcos();
        }
        return null;
    }
}
