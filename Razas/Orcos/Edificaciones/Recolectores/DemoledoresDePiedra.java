package Razas.Orcos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class DemoledoresDePiedra implements Recolectores {
    int Piedra;
    int Vida;
    ArrayList<String> Creado = new ArrayList<String>();

    public int getPiedra() {
        return Piedra;
    }

    public void setPiedra(int piedra) {
        Piedra = piedra;
    }

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
        Creado.add(1,"90");
        Creado.add(2,"50");
        Creado.add(3,"55");
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public int Recolectar(){
        setPiedra(40);
        return getPiedra();
    }

    @Override
    public void Generar(){
        setPiedra(40 + getPiedra());
    }
}
