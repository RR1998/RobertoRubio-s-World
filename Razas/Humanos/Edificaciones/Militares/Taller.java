package Razas.Humanos.Edificaciones.Militares;

import Razas.Militares;
import Razas.Unidades;
import Razas.UnitFactory;
import Razas.UnitProducer;

public class Taller implements Militares {
    int Vida;
    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(3600);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    @Override
    public void crear(String Type){
        UnitFactory Humanos;
        Humanos = UnitProducer.getUnit("Humanos");
        Unidades Girocoptero = Humanos.getHumano(Type);
    }
}
