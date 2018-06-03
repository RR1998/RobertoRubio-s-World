package Razas.Humanos.Unidades;

/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
*/


import Razas.Humanos.Veiculos.Girocoptero;
import Razas.Humanos.Veiculos.Mortero;
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
            case "Girocoptero":
                return new Girocoptero();
            case "Mortero":
                return new Mortero();
        }
        return null;
    }
    public Unidades getMuerto(String Type){
        return null;
    }
    @Override
    public Unidades getOrco(String Type){
        return null;
    }
}
