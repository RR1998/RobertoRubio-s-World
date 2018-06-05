package Razas.Orcos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class DemoledoresDePiedra implements Recolectores {
    int Piedra;

    public int getPiedra() {
        return Piedra;
    }

    public void setPiedra(int piedra) {
        Piedra = piedra;
    }

    @Override
    public int Recolectar(){
        return getPiedra();
    }

    @Override
    public void Generar(){
        setPiedra(40);
    }
}
