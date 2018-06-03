package Razas.Elfos_Nocturnos.Veiculos;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

import Razas.Unidades;

public class Hipogrifo implements Unidades {
    @Override
    public int Vida(){
        int Vida = 500;
        return Vida;
    }
    public int Dano(){
        int Dano = 100;
        return Dano;
    }
    public int TiempoCreacion(){
        int Tiempo = 4;
        return Tiempo;
    }
}
