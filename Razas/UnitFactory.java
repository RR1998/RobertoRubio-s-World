package Razas;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

//Abstract Factory para unidades
public interface UnitFactory {
     Unidades getElfo(String Type);
     Unidades getHumano(String Type);
     Unidades getMuerto(String Type);
     Unidades getOrco(String Type);
}
