package Razas.Muertos_Vivientes.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Razas.UnitProducer;

import java.util.ArrayList;

public class CasaDeTortura implements Militares {
    int Vida;
    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public ArrayList<Integer> Crear() {
        setVida(2300);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }
    @Override
    public void Entrenar(String Type){
        UnitFactory Muertos;
        Muertos = UnitProducer.getUnit("Muertos");
        if (Type == "Abominacion"){
            Unidades Abominacion = Muertos.getMuerto(Type);
        }
        if (Type == "Necromancer"){
            Unidades Necromancer = Muertos.getMuerto(Type);
        }
        if (Type == "CaballeroMuerte"){
            Unidades Caballero = Muertos.getMuerto(Type);
        }
    }
}
