package Razas.Elfos_Nocturnos.Edificaciones;

import Interfaces.ConstrucFactory;
import Interfaces.Creacion;
import Razas.Elfos_Nocturnos.Edificaciones.Militares.*;
import Razas.Elfos_Nocturnos.Edificaciones.Recolectores.*;

public class ConstruccionesElfas implements ConstrucFactory {
    @Override
    public Creacion getCElfo(String Type){
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
