package Razas.Orcos.Unidades;

import Razas.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

public class Brujo implements Unidades {
    @Override
    public int Vida(){
        int Vida = 70;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 160;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 3;
        return Tiempo;
    }
}
