package Razas.Muertos_Vivientes.Veiculos;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

import Razas.Unidades;

public class DragonWyrm implements Unidades {
    @Override
    public int Vida(){
        int Vida = 700;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 70;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 7;
        return Tiempo;
    }
}
