package Razas.Humanos.Edificaciones;

import Interfaces.ConstructionFactory;
import Interfaces.Creacion;
import Razas.Humanos.Edificaciones.Militares.*;
import Razas.Humanos.Edificaciones.Recolectores.*;

public class ConstruccionesHumanas implements ConstructionFactory {

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
            case "Campo maderero":
                return new CampoMaderero();
            case "Mina de oro":
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
