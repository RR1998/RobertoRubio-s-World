package Razas.Humanos.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
import Razas.Unidades;

public class Paladin implements Unidades{
    @Override
    public int Vida(){
        int Vida = 530;
        return Vida;
    }
    @Override
    public int Dano (){
        int Dano = 50;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 3;
        return Tiempo;
    }
}
