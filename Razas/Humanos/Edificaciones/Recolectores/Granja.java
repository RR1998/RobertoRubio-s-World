package Razas.Humanos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class Granja implements Recolectores {

    int Trigo;

    public int getTrigo() {
        return Trigo;
    }

    public void setTrigo(int trigo) {
        Trigo = trigo;
    }
    @Override
    public int Recolectar(){
        return getTrigo();
    }
    @Override
    public void Generar(){
        setTrigo(70);
    }
}
