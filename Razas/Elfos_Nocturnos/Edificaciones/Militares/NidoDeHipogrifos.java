package Razas.Elfos_Nocturnos.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Producers.UnitProducer;

import java.util.ArrayList;

public class NidoDeHipogrifos implements Militares {
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
        setVida(2200);
        Creado.add(0,getVida());
        Creado.add(1,200);
        Creado.add(2,150);
        Creado.add(3,80);
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }
    @Override
    public void Entrenar(String Type){
        UnitFactory Elfos;
        Elfos = UnitProducer.getUnit("Elfos");
        Unidades Hipogrifos = Elfos.getElfo(Type);
    }
}
