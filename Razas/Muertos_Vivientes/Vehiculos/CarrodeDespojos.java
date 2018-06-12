package Razas.Muertos_Vivientes.Vehiculos;

import Interfaces.Unidades;

import java.util.ArrayList;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
public class CarrodeDespojos implements Unidades {
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
        setVida(100);
        Creado.add(0,getVida());
        Creado.add(1,150);
        Creado.add(2,90);
        Creado.add(3,100);
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
        setTiempoCreacion(6);
        return getTiempoCreacion();
    }
}
