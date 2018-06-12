package Razas.Muertos_Vivientes.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Razas.UnitProducer;

import java.util.ArrayList;

public class CasaDeTortura implements Militares {
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
        setVida(2500);
        Creado.add(0,getVida());
        Creado.add(1,120);
        Creado.add(2,70);
        Creado.add(3,40);
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
