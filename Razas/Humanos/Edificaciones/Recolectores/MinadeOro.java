package Razas.Humanos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

public class MinadeOro implements Recolectores {
    int Oro;
    int Vida;
    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(1750);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    public int getOro() {
        return Oro;
    }

    public void setOro(int oro) {
        Oro = oro;
    }

    @Override
    public int Recolectar(){
        return getOro();
    }

    @Override
    public void Generar(){
        setOro(20);
    }
}
