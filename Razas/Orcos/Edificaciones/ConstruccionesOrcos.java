package Razas.Orcos.Edificaciones;

import Interfaces.ConstructionFactory;
import Interfaces.Creacion;
import Razas.Orcos.Edificaciones.Militares.*;
import Razas.Orcos.Edificaciones.Recolectores.*;


public class ConstruccionesOrcos implements ConstructionFactory {
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
        return null;
    }

    @Override
    public Creacion getCOrco(String Type){
        switch (Type){
            case "Bestiario":
                return new Bestiario();
            case "Campamento de guerra":
                return new CampamentoDeGuerra();
            case "Talleres goblin":
                return new TalleresGoblin();
            case "Amarraderos":
                return new Amarraderos();
            case "Demoledores de piedra":
                return new DemoledoresDePiedra();
            case "Madrigera orca":
                return new MadrigeraOrca();
        }
        return null;
    }
}
