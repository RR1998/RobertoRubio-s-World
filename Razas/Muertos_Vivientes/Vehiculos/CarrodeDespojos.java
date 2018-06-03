package Razas.Muertos_Vivientes.Vehiculos;

import Razas.Unidades;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
public class CarrodeDespojos implements Unidades {
    @Override
    public int Vida(){
        int Vida = 700;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 30;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 4;
        return Tiempo;
    }
}
