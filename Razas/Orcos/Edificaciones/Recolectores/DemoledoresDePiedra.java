package Razas.Orcos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

public class DemoledoresDePiedra implements Recolectores {
    int Piedra;
    int Vida;

    public int getPiedra() {
        return Piedra;
    }

    public void setPiedra(int piedra) {
        Piedra = piedra;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(1800);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
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
