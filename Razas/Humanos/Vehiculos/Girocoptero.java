package Razas.Humanos.Vehiculos;

import Interfaces.Unidades;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
public class Girocoptero implements Unidades {
    @Override
    public int Vida (){
        int Vida = 400;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 200;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 5;
        return Tiempo;
    }
}
