package Razas.Humanos.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Razas.UnitProducer;

import java.util.ArrayList;

public class Taller implements Militares {
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
        setVida(3500);
        Creado.add(0,getVida());
        Creado.add(1,150);
        Creado.add(2,100);
        Creado.add(3,70);
        return Creado;
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public void Entrenar(String Type){
        UnitFactory Humanos;
        Humanos = UnitProducer.getUnit("Humanos");
        Unidades Girocoptero = Humanos.getHumano(Type);
    }
}
