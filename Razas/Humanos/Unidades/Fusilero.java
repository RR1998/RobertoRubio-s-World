package Razas.Humanos.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
import Interfaces.Unidades;

public class Fusilero implements Unidades{
    @Override
    public int Vida (){
        int Vida = 100;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 50;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 2;
        return Tiempo;
    }
}
