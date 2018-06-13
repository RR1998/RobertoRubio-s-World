package Razas.Muertos_Vivientes.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class ProfanadorDeAlmas implements Recolectores {
    int Almas;
    int Vida;
    ArrayList<Integer> Creado = new ArrayList<Integer>();

    public int getAlmas() {
        return Almas;
    }

    public void setAlmas(int almas) {
        Almas = almas;
    }

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
        Creado.add(2,85);
        Creado.add(3,10);
        return Creado;
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }
    @Override
    public int Recolectar(){
        return getAlmas();
    }

    @Override
    public void Generar(){
        setAlmas(20 + getAlmas());
    }
}
