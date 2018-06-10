package Razas.Orcos.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Razas.UnitProducer;

public class TalleresGoblin implements Militares {
    int Vida;

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(1650);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    @Override
    public void crear(String Type){
        UnitFactory Orcos;
        Orcos = UnitProducer.getUnit("Orcos");
        Unidades Globo = Orcos.getOrco(Type);
    }
}
