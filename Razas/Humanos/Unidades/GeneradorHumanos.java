package Razas.Humanos.Unidades;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
*/


import Razas.UnitFactory;
import Razas.Unidades;

public class GeneradorHumanos implements UnitFactory {
    @Override
    public Unidades getElfo(String Type){
        return null;
    }
    @Override
    public Unidades getHumano(String Type){
        switch (Type){
            case "Soldado":
                return new SoldadoRaso();
            case "Fusilero":
                return new Fusilero();
            case "Paladin":
                return new Paladin();
        }
        return null;
    }
}
