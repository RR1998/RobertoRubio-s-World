package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class ManaLunar implements Recolectores {
    int ManaLunar;

    public int getManaLunar() {
        return ManaLunar;
    }

    public void setManaLunar(int manaLunar) {
        ManaLunar = manaLunar;
    }

    @Override
    public int Recolectar (){
        return getManaLunar();
    }

    @Override
    public void Generar(){
        setManaLunar(30);
    }
}
