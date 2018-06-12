package Razas.Humanos.Edificaciones;

import Interfaces.ConstrucFactory;
import Interfaces.Creacion;
import Razas.Humanos.Edificaciones.Militares.*;
import Razas.Humanos.Edificaciones.Recolectores.*;

public class ConstruccionesHumanas implements ConstrucFactory {

    @Override
    public Creacion getCElfo(String Type){
        return null;
    }

    @Override
    public Creacion getCHumano(String Type){
        switch (Type) {
            case "Cuartel":
                return new Cuartel();
            case "Polvorin":
                return new Polvorin();
            case "Taller":
                return new Taller();
            case "Granja":
                return new Granja();
            case "Campo Maderero":
                return new CampoMaderero();
            case "Mina de Oro":
                return new MinadeOro();
        }
        return null;
    }

    @Override
    public Creacion getCMuerto(String Type){
        return null;
    }

    @Override
    public Creacion getCOrco(String Type){
        return null;
    }
}
