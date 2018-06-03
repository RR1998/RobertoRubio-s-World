package Razas.Orcos.Unidades;

import Razas.Unidades;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
public class Bruto implements Unidades {
    @Override
    public int Vida(){
        int Vida = 200;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 30;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 1;
        return Tiempo;
    }

}
