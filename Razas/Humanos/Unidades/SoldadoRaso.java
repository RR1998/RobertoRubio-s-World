package Razas.Humanos.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

import Interfaces.Unidades;

public class SoldadoRaso implements Unidades {
    public int Vida(){
        int Vida = 150;
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
