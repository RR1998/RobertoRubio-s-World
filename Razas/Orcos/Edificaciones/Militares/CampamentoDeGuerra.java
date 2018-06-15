package Razas.Orcos.Edificaciones.Militares;

import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Producers.UnitProducer;

import java.util.ArrayList;

public class CampamentoDeGuerra implements Militares {
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
        setVida(2500);
        Creado.add(0, Integer.toString(getVida()));
        Creado.add(1,"140");
        Creado.add(2,"90");
        Creado.add(3,"50");
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
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
        UnitFactory Orcos;
        Orcos = UnitProducer.getUnit("Orcos");
        if (Type == "Bruto"){
            Unidades Bruto = Orcos.getOrco(Type);
        }
        if (Type == "Brujo"){
            Unidades Brujo = Orcos.getOrco(Type);
        }
        if (Type == "SenorGuerra"){
            Unidades Senor = Orcos.getOrco(Type);
        }
    }
}
