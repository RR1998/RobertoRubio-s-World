package Razas.Humanos.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
import Interfaces.Unidades;

import java.util.ArrayList;

public class Paladin implements Unidades{
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
        setVida(150);
        Creado.add(0, Integer.toString(getVida()));
        Creado.add(1,"100");
        Creado.add(2,"80");
        Creado.add(3,"90");
        return Creado;
    }

    @Override
    public int Dano (){
        setDanoU(50);
        return getDanoU();
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
    public int TiempoCreacion (){
        setTiempoCreacion(3);
        return getTiempoCreacion();
    }
}
