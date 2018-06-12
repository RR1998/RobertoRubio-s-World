package Razas.Orcos.Edificaciones;

import Interfaces.ConstrucFactory;
import Interfaces.Generacion;
import Razas.Orcos.Edificaciones.Militares.*;
import Razas.Orcos.Edificaciones.Recolectores.*;


public class ConstruccionesOrcos implements ConstrucFactory {
    @Override
    public Generacion getCElfo(String Type){
        return null;
    }

    @Override
    public Generacion getCHumano(String Type){
        return null;
    }

    @Override
    public Generacion getCMuerto(String Type){
        return null;
    }

    @Override
    public Generacion getCOrco(String Type){
        switch (Type){
            case "Bestiario":
                return new Bestiario();
            case "Campamento de Guerra":
                return new CampamentoDeGuerra();
            case "Talleres Goblin":
                return new TalleresGoblin();
            case "Amarraderos":
                return new Amarraderos();
            case "Demoledores de Piedra":
                return new DemoledoresDePiedra();
            case "Madrigera Orca":
                return new MadrigeraOrca();
        }
        return null;
    }
}
