package Razas.Elfos_Nocturnos.Unidades;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

import Razas.Unidades;

public class Arquero implements Unidades{
    @Override
    public int Vida(){
        int Vida = 120;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 30;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 2;
        return Tiempo;
    }
}
