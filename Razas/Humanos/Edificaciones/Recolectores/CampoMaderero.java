package Razas.Humanos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class CampoMaderero implements Recolectores {

    int Madera;

    public int getMadera() {
        return Madera;
    }

    public void setMadera(int madera) {
        Madera = madera;
    }

    @Override
    public int Recolectar(){
        return getMadera();
    }

    @Override
    public void Generar(){
        setMadera(50);
    }
}
