package Razas.Muertos_Vivientes.Edificaciones;

import Interfaces.ConstructionFactory;
import Interfaces.Creacion;
import Razas.Muertos_Vivientes.Edificaciones.Militares.*;
import Razas.Muertos_Vivientes.Edificaciones.Recolectores.CanalizadorOscuro;
import Razas.Muertos_Vivientes.Edificaciones.Recolectores.Cementerio;
import Razas.Muertos_Vivientes.Edificaciones.Recolectores.ProfanadorDeAlmas;


public class ConstruccionesMuertos implements ConstructionFactory {
    @Override
    public Creacion getCElfo(String Type){
        return null;
    }

    @Override
    public Creacion getCHumano(String Type){
        return null;
    }

    @Override
    public Creacion getCMuerto(String Type){
        switch (Type){
            case "Casa de tortura":
                return new CasaDeTortura();
            case "Despedazador":
                return new Despedazador();
            case "Nido  de dragon":
                return new NidoDragon();
            case "Canalizador oscuro":
                return new CanalizadorOscuro();
            case "Profanador de almas":
                return new ProfanadorDeAlmas();
            case "Cementerio":
                return new Cementerio();
        }
        return null;
    }

    @Override
    public Creacion getCOrco(String Type){
        return null;
    }
}
