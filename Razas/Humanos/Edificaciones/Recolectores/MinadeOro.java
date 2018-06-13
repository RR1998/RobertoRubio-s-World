package Razas.Humanos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class MinadeOro implements Recolectores {
    int Oro;
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
        Creado.add(1,90);
        Creado.add(2,80);
        Creado.add(3,30);
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    public int getOro() {
        return Oro;
    }

    public void setOro(int oro) {
        Oro = oro;
    }

    @Override
    public int Recolectar(){
        return getOro();
    }

    @Override
    public void Generar(){
        setOro(20 + getOro());
    }
}
