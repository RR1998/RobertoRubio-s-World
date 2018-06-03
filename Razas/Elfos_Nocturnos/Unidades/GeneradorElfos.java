package Razas.Elfos_Nocturnos.Unidades;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
import Razas.Unidades;
import Razas.UnitFactory;

public class GeneradorElfos implements UnitFactory {
    @Override
    public Unidades getElfo(String Type){
        switch (Type){
            case "Arquero":
                return new Arquero();
            case "SableLunaplata":
                return new SablesLunaplata();
            case "SacerdotizaLunar":
                return new SacerdotizaLunar();
        }
        return null;
    }
    @Override
    public Unidades getHumano(String Type){
        return null;
    }
}