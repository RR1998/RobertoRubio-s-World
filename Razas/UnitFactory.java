package Razas;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

import Razas.Elfos_Nocturnos.Unidades.UnidadesElfo;

public interface UnitFactory {
     UnidadesElfo getElfo(String Type);
}
