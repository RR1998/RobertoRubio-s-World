package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class PiedrasCelestiales implements Recolectores {

    int PiedrasCelestiales;

    public int getPiedrasCelestiales() {
        return PiedrasCelestiales;
    }

    public void setPiedrasCelestiales(int piedrasCelestiales) {
        PiedrasCelestiales = piedrasCelestiales;
    }

    @Override
    public int Recolectar(){
        return getPiedrasCelestiales();
    }

    @Override
    public void Generar(){
        setPiedrasCelestiales(40);
    }
}
