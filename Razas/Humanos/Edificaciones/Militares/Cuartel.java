package Razas.Humanos.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Razas.UnitProducer;

public class Cuartel implements Militares {
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
        UnitFactory Humanos;
        Humanos = UnitProducer.getUnit("Humanos");
        if (Type == "Soldado"){
            Unidades Soldado = Humanos.getHumano(Type);
        }
        if (Type == "Fusilero"){
            Unidades Fusilero = Humanos.getHumano(Type);
        }
        if (Type == "Paladin"){
            Unidades Paladin = Humanos.getHumano(Type);
        }
    }
}
