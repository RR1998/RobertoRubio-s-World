package Razas.Elfos_Nocturnos.Unidades;

import Razas.Unidades;

public class SablesLunaplata implements Unidades {
    @Override
    public int Vida(){
        int Vida = 250;
        return Vida;
    }
    @Override
    public int Dano (){
        int Dano = 50;
        return Dano;
    }
    @Override
    public int TiempoCreacion (){
        int Tiempo = 2;
        return Tiempo;
    }
}
