package Razas.Muertos_Vivientes.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
*/

import Razas.Unidades;

public class Abominacion implements Unidades {
    @Override
    public int Vida(){
        int Vida = 400;
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
