package Razas.Humanos.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Producers.UnitProducer;

import java.util.ArrayList;

public class Cuartel implements Militares {
    int Vida;
    ArrayList<String> Creado = new ArrayList<String>();

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    //Nomenclatura de cosotos  Vida Recurso1, Recurso2, Recurso3

    @Override
    public ArrayList<String> Crear(){
        setVida(3300);
        Creado.add(0, Integer.toString(getVida()));
        Creado.add(1,"150");
        Creado.add(2,"110");
        Creado.add(3,"70");
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano) {
        setVida(getVida() - Dano);
    }

    @Override
    public void Generar() {

    }

    @Override
    public int Recolectar() {
        return 0;
    }

    @Override
    public void Entrenar(String Type){
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
