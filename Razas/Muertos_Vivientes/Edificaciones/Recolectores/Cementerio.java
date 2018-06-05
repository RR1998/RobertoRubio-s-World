package Razas.Muertos_Vivientes.Edificaciones.Recolectores;

import Razas.Recolectores;

public class Cementerio implements Recolectores {
    int Cadaveres;

    public int getCadaveres() {
        return Cadaveres;
    }

    public void setCadaveres(int cadaveres) {
        Cadaveres = cadaveres;
    }

    @Override
    public int Recolectar(){
        return getCadaveres();
    }

    @Override
    public void Generar(){
        setCadaveres(50);
    }
}
