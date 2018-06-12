package Razas.Humanos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class Granja implements Recolectores {
    int Trigo;
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
        setVida(3300);
        Creado.add(0,getVida());
        Creado.add(1,70);
        Creado.add(2,50);
        Creado.add(3,10);
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    public int getTrigo() {
        return Trigo;
    }

    public void setTrigo(int trigo) {
        Trigo = trigo;
    }
    @Override
    public int Recolectar(){
        return getTrigo();
    }
    @Override
    public void Generar(){
        setTrigo(70);
    }
}
