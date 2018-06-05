package Razas.Orcos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class MadrigeraOrca implements Recolectores {
    int Esclavos;

    public int getEsclavos() {
        return Esclavos;
    }

    public void setEsclavos(int esclavos) {
        Esclavos = esclavos;
    }

    @Override
    public int Recolectar(){
        return getEsclavos();
    }

    @Override
    public void Generar(){
        setEsclavos(10);
    }
}
