package Razas.Muertos_Vivientes.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
import Razas.Muertos_Vivientes.Vehiculos.CarrodeDespojos;
import Razas.Muertos_Vivientes.Vehiculos.DragonWyrm;
import Interfaces.UnitFactory;
import Interfaces.Unidades;

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
            case "CarroDespojos":
                return new CarrodeDespojos();
            case "Dragon":
                return new DragonWyrm();
        }
        return null;
    }

    @Override
    public Unidades getOrco(String Type){
        return null;
    }
}
