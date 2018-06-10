package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class PiedrasCelestiales implements Recolectores {
    int PiedrasCelestiales;
    int Vida;

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getPiedrasCelestiales() {
        return PiedrasCelestiales;
    }

    public void setPiedrasCelestiales(int piedrasCelestiales) {
        PiedrasCelestiales = piedrasCelestiales;
    }

    @Override
    public int Construirse() {
        setVida(1700);
        return getVida();
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
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
