package Razas.Humanos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class MinadeOro implements Recolectores {
    int Oro;

    public int getOro() {
        return Oro;
    }

    public void setOro(int oro) {
        Oro = oro;
    }

    @Override
    public int Recolectar(){
        return getOro();
    }

    @Override
    public void Generar(){
        setOro(20);
    }
}
