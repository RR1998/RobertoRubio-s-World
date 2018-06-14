package Razas.Elfos_Nocturnos.Edificaciones;

import Interfaces.ConstructionFactory;
import Interfaces.Creacion;
import Razas.Elfos_Nocturnos.Edificaciones.Militares.*;
import Razas.Elfos_Nocturnos.Edificaciones.Recolectores.*;

public class ConstruccionesElfas implements ConstructionFactory {
    @Override
    public Creacion getCElfo(String Type){
        switch (Type){
            case "Ancestro de guerra":
                return new AncestrodeGuerra();
            case "Canalizador lunar":
                return new CanalizadorLunar();
            case "Nido de hipogrifos":
                return new NidoDeHipogrifos();
            case"Bendiciones de la luna":
                return new BendicionesdelaDiosa();
            case"Mana lunar":
                return new ManaLunar();
            case"Piedras celestiales":
                return new PiedrasCelestiales();
        }
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
        return null;
    }
}
