package Razas.Muertos_Vivientes.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
*/

import Interfaces.Unidades;

import java.util.ArrayList;

public class Abominacion implements Unidades {
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
        setVida(300);
        Creado.add(0, Integer.toString(getVida()));
        Creado.add(1,"90");
        Creado.add(2,"50");
        Creado.add(3,"80");
        return Creado;
    }

    @Override
    public int Dano (){
        setDanoU(30);
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
        setTiempoCreacion(2);
        return getTiempoCreacion();
    }
}
