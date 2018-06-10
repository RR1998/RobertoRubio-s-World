package Razas.Muertos_Vivientes.Edificaciones.Recolectores;

import Razas.Recolectores;

public class ProfanadorDeAlmas implements Recolectores {
    int Almas;
    int Vida;

    public int getAlmas() {
        return Almas;
    }

    public void setAlmas(int almas) {
        Almas = almas;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(1400);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }
    @Override
    public int Recolectar(){
        return getAlmas();
    }

    @Override
    public void Generar(){
        setAlmas(20);
    }
}
