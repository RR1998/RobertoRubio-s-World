package Razas.Humanos.Vehiculos;

import Interfaces.Unidades;

import java.util.ArrayList;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

public class Mortero implements Unidades {
    int Vida;
    int DanoU;
    int TiempoCreacion;
    ArrayList<Integer> Creado = new ArrayList<Integer>();

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
    public ArrayList<Integer> Crear(){
        setVida(200);
        Creado.add(0,getVida());
        Creado.add(1,130);
        Creado.add(2,80);
        Creado.add(3,120);
        return Creado;
    }

    @Override
    public int Dano (){
        setDanoU(100);
        return getDanoU();
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public int TiempoCreacion (){
        setTiempoCreacion(5);
        return getTiempoCreacion();
    }
}
