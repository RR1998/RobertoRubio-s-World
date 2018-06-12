package Razas.Elfos_Nocturnos.Edificaciones;

import Interfaces.ConstrucFactory;
import Interfaces.Generacion;
import Razas.Elfos_Nocturnos.Edificaciones.Militares.*;
import Razas.Elfos_Nocturnos.Edificaciones.Recolectores.*;

public class ConstruccionesElfas implements ConstrucFactory {
    @Override
    public Generacion getCElfo(String Type){
        switch (Type){
            case "Ancestro":
                return new AncestrodeGuerra();
            case "Canalizador":
                return new CanalizadorLunar();
            case "Nido":
                return new NidoDeHipogrifos();
            case"Bendiciones":
                return new BendicionesdelaDiosa();
            case"Mana":
                return new ManaLunar();
            case"Piedras":
                return new PiedrasCelestiales();
        }
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
        return null;
    }
}
