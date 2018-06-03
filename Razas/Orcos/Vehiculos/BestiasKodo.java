package Razas.Orcos.Vehiculos;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
import Razas.Unidades;

public class BestiasKodo implements Unidades {
    @Override
    public int Vida(){
        int Vida = 700;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 40;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 6;
        return Tiempo;
    }
}
