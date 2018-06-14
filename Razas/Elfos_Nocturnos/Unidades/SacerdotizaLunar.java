package Razas.Elfos_Nocturnos.Unidades;

import Interfaces.Unidades;

import java.util.ArrayList;

public class SacerdotizaLunar implements Unidades {
    int Vida;
    int DanoU;
    int TiempoCreacion;
    ArrayList<String> Creado = new ArrayList<String>();

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getDanoU() {
        return DanoU;
    }

    public void setDanoU(int danoU) {
        DanoU = danoU;
    }

    public int getTiempoCreacion() {
        return TiempoCreacion;
    }

    public void setTiempoCreacion(int tiempoCreacion) {
        TiempoCreacion = tiempoCreacion;
    }

    //Nomenclatura de cosotos  Vida Recurso1, Recurso2, Recurso3

    @Override
    public ArrayList<String> Crear(){
        setVida(250);
        Creado.add(0, Integer.toString(getVida()));
        Creado.add(1,"100");
        Creado.add(2,"90");
        Creado.add(3,"80");
        return Creado;
    }

    @Override
    public int Dano (){
        setDanoU(80);
        return getDanoU();
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public int TiempoCreacion (){
        setTiempoCreacion(4);
        return getTiempoCreacion();
    }
}
