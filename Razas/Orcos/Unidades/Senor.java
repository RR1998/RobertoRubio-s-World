package Razas.Orcos.Unidades;

import Razas.Unidades;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

public class Senor implements Unidades {
    @Override
    public int Vida(){
        int Vida = 400;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 60;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 3;
        return Tiempo;
    }
}
