package Razas.Muertos_Vivientes.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
import Interfaces.Unidades;

public class Caballero implements Unidades {
    @Override
    public int Vida(){
        int Vida = 500;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 80;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 3;
        return Tiempo;
    }
}
