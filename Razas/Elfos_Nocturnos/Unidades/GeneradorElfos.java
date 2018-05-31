package Razas.Elfos_Nocturnos.Unidades;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
import Razas.UnitFactory;

public class GeneradorElfos implements UnitFactory {
    @Override
    public UnidadesElfo getElfo(String Type){
        switch (Type){
            case "Arquero":
                return new Arquero();
            case "SableLunaplata":
                return new SablesLunaplata();
            case "Heroe":
                return new Heroe();

        }
        return null;
    }
}
