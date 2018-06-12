package Razas.Elfos_Nocturnos.Unidades;

import Interfaces.Unidades;

public class SacerdotizaLunar implements Unidades {
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
        setVida(255);
        return getVida();
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
