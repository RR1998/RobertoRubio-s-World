package Razas.Humanos.Edificaciones;

import Interfaces.ConstrucFactory;
import Interfaces.Generacion;
import Razas.Humanos.Edificaciones.Militares.*;
import Razas.Humanos.Edificaciones.Recolectores.*;

public class ConstruccionesHumanas implements ConstrucFactory {

    @Override
    public Generacion getCElfo(String Type){
        return null;
    }

    @Override
    public Generacion getCHumano(String Type){
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
    public Generacion getCMuerto(String Type){
        return null;
    }

    @Override
    public Generacion getCOrco(String Type){
        return null;
    }
}
