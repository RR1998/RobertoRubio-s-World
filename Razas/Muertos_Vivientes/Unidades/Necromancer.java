package Razas.Muertos_Vivientes.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
*/
import Razas.Unidades;

public class Necromancer implements Unidades {
    @Override
    public int Vida(){
        int Vida = 100;
        return Vida;
    }
    @Override
    public int Dano(){
        int Dano = 70;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 1;
        return Tiempo;
    }
}
