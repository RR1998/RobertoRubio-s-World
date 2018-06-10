package Razas.Muertos_Vivientes.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Razas.UnitProducer;

public class NidoDragon implements Militares {
    int Vida;
    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(2150);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }
    @Override
    public void crear(String Type){
        UnitFactory Muertos;
        Muertos = UnitProducer.getUnit("Muertos");
        Unidades Dragon = Muertos.getMuerto(Type);
    }
}
