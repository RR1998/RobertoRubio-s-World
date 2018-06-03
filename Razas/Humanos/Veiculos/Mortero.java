package Razas.Humanos.Veiculos;

import Razas.Unidades;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

public class Mortero implements Unidades {
    @Override
    public int Vida (){
        int Vida = 200;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 300;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 4;
        return Tiempo;
    }
}
