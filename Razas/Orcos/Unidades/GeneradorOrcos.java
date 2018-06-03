package Razas.Orcos.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

import Razas.Unidades;
import Razas.UnitFactory;

public class GeneradorOrcos implements UnitFactory {
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
        return null;
    }

    public Unidades getOrco(String Type){
        switch (Type){
            case "Bruto":
                return new Bruto();
            case "Brujo":
                return new Brujo();
            case "SenorGuerra":
                return new Senor();
        }
        return null;
    }

}
