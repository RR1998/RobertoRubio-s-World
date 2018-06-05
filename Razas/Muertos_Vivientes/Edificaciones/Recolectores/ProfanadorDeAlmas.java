package Razas.Muertos_Vivientes.Edificaciones.Recolectores;

import Razas.Recolectores;

public class ProfanadorDeAlmas implements Recolectores {
    int Almas;

    public int getAlmas() {
        return Almas;
    }

    public void setAlmas(int almas) {
        Almas = almas;
    }

    @Override
    public int Recolectar(){
        return getAlmas();
    }

    @Override
    public void Generar(){
        setAlmas(20);
    }
}
