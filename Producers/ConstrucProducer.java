package Producers;

import Interfaces.ConstructionFactory;
import Razas.Elfos_Nocturnos.Edificaciones.ConstruccionesElfas;
import Razas.Humanos.Edificaciones.ConstruccionesHumanas;
import Razas.Muertos_Vivientes.Edificaciones.ConstruccionesMuertos;
import Razas.Orcos.Edificaciones.ConstruccionesOrcos;

public class ConstrucProducer {
    public static ConstructionFactory getConstruccion(String Type){
        switch(Type){
            case "Elfos":
                return new ConstruccionesElfas();
            case "Humanos":
                return new ConstruccionesHumanas();
            case "Muertos":
                return new ConstruccionesMuertos();
            case "Orcos":
                return new ConstruccionesOrcos();
        }
        return null;
    }
}
