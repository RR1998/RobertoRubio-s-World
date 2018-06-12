package Razas.Orcos.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Razas.UnitProducer;

import java.util.ArrayList;

public class TalleresGoblin implements Militares {
    int Vida;

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public ArrayList<Integer> Crear() {
        setVida(1650);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public void Entrenar(String Type){
        UnitFactory Orcos;
        Orcos = UnitProducer.getUnit("Orcos");
        Unidades Globo = Orcos.getOrco(Type);
    }
}
