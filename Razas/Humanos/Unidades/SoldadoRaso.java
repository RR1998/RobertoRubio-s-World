package Razas.Humanos.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

import Interfaces.Unidades;

public class SoldadoRaso implements Unidades {
    int Vida;
    int DanoU;
    int TiempoCreacion;

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

    @Override
    public int Crear(){
        setVida(200);
        return getVida();
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

    public int TiempoCreacion (){
        setTiempoCreacion(1);
        return getTiempoCreacion();
    }
}
