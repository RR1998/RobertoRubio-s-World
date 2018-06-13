package Producers;

import Interfaces.ConstrucFactory;
import Razas.Elfos_Nocturnos.Edificaciones.ConstruccionesElfas;
import Razas.Humanos.Edificaciones.ConstruccionesHumanas;
import Razas.Muertos_Vivientes.Edificaciones.ConstruccionesMuertos;
import Razas.Orcos.Edificaciones.ConstruccionesOrcos;

public class ConstrucProducer {
    public static ConstrucFactory getConstruccion(String Type){
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
