package Razas.Elfos_Nocturnos.Unidades;

import Razas.Unidades;

public class SacerdotizaLunar implements Unidades {
    @Override
    public int Vida (){
        int Vida = 450;
        return Vida;
    }
    @Override
    public int Dano (){
        int Dano = 60;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 3;
        return Tiempo;
    }
}
