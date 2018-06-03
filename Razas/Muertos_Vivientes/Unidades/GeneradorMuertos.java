package Razas.Muertos_Vivientes.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
import Razas.UnitFactory;
import Razas.Unidades;

public class GeneradorMuertos implements UnitFactory{
    @Override
    public Unidades getElfo(String Type){
        return null;
    }
    @Override
    public Unidades getHumano(String Type){
        return null;
    }
    @Override
    public Unidades getMuerto(String Type){
        switch (Type){
            case "Abominacion":
                return new Abominacion();
            case "Necromancer":
                return new Necromancer();
            case "CaballeroMuerte":
                return new Caballero();
        }
        return null;
    }
}
