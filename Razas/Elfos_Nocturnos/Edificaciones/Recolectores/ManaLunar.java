package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class ManaLunar implements Recolectores {
    int ManaLunar;
    int Vida;

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getManaLunar() {
        return ManaLunar;
    }

    public void setManaLunar(int manaLunar) {
        ManaLunar = manaLunar;
    }

    @Override
    public int Construirse() {
        setVida(3000);
        return getVida();
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
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
