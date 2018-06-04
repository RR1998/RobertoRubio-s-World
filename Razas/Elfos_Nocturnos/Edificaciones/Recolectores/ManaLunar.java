package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class ManaLunar implements Recolectores {
    int Generado;

    public int getGenerado() {
        return Generado;
    }

    public void setGenerado(int generado) {
        Generado = generado;
    }
    @Override
    public int Recolectar (){
        return getGenerado();
    }
    @Override
    public void Generar(){
        setGenerado(30);
    }
}
