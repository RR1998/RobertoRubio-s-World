package Razas.Muertos_Vivientes.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Producers.UnitProducer;

import java.util.ArrayList;

public class NidoDragon implements Militares {
    int Vida;
    ArrayList<Integer> Creado = new ArrayList<Integer>();

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    //Nomenclatura de cosotos  Vida Recurso1, Recurso2, Recurso3

    @Override
    public ArrayList<Integer> Crear(){
        setVida(3000);
        Creado.add(0,getVida());
        Creado.add(1,160);
        Creado.add(2,115);
        Creado.add(3,75);
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }
    @Override
    public void Entrenar(String Type){
        UnitFactory Muertos;
        Muertos = UnitProducer.getUnit("Muertos");
        Unidades Dragon = Muertos.getMuerto(Type);
    }
}
