package Razas.Orcos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class Amarraderos implements Recolectores{
    int Amarras;

    public int getAmarras() {
        return Amarras;
    }

    public void setAmarras(int amarras) {
        Amarras = amarras;
    }

    @Override
    public int Recolectar(){
        return getAmarras();
    }

    @Override
    public void Generar(){
        setAmarras(50);
    }
}
