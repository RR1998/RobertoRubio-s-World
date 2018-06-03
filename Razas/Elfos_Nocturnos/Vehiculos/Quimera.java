package Razas.Elfos_Nocturnos.Vehiculos;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

import Razas.Unidades;

public class Quimera implements Unidades {
    @Override
    public int Vida (){
        int Vida = 600;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 150;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 5;
        return Tiempo;
    }
}
