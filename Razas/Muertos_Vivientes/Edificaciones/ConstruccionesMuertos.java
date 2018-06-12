package Razas.Muertos_Vivientes.Edificaciones;

import Interfaces.ConstrucFactory;
import Interfaces.Creacion;
import Razas.Muertos_Vivientes.Edificaciones.Militares.*;
import Razas.Muertos_Vivientes.Edificaciones.Recolectores.CanalizadorOscuro;
import Razas.Muertos_Vivientes.Edificaciones.Recolectores.ProfanadorDeAlmas;


public class ConstruccionesMuertos implements ConstrucFactory {
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
            case "Casa de Tortura":
                return new CasaDeTortura();
            case "Despedazador":
                return new Despedazador();
            case "Nido Dragon":
                return new NidoDragon();
            case "Canalizador Oscuro":
                return new CanalizadorOscuro();
            case "Profanador de Almas":
                return new ProfanadorDeAlmas();
        }
        return null;
    }

    @Override
    public Creacion getCOrco(String Type){
        return null;
    }
}
