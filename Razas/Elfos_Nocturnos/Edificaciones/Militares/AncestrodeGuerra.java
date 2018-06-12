package Razas.Elfos_Nocturnos.Edificaciones.Militares;


import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Razas.UnitProducer;

import java.util.ArrayList;

public class AncestrodeGuerra implements Militares {
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
        Creado.add(1,150);
        Creado.add(2,100);
        Creado.add(3,60);
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
        if (Type == "Arquero") {
            Unidades Arquero = Elfos.getElfo(Type);
        }
        if (Type == "Sable Luna Plata"){
            Unidades Sable = Elfos.getElfo(Type);
        }
        if (Type == "Sacerdotiza Lunar"){
            Unidades Sacerdotiza = Elfos.getElfo(Type);
        }
    }

}
