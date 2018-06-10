package Razas.Elfos_Nocturnos.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Razas.UnitProducer;

public class NidoDeHipogrifos implements Militares {
    int Vida;
    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }
    @Override
    public int Construirse() {
        setVida(3750);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }
    @Override
    public void crear(String Type){
        UnitFactory Elfos;
        Elfos = UnitProducer.getUnit("Elfos");
        Unidades Hipogrifos = Elfos.getElfo(Type);
    }
}
