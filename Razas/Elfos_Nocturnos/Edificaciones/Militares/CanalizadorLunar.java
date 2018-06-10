package Razas.Elfos_Nocturnos.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class CanalizadorLunar implements Militares {
    int Vida;
    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(3500);
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
        Unidades Quimera = Elfos.getElfo(Type);
    }
}
