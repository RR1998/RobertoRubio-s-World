package Razas.Humanos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

public class CampoMaderero implements Recolectores {
    int Madera;
    int Vida;
    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int Crear() {
        setVida(2000);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    public int getMadera() {
        return Madera;
    }

    public void setMadera(int madera) {
        Madera = madera;
    }

    @Override
    public int Recolectar(){
        return getMadera();
    }

    @Override
    public void Generar(){
        setMadera(50);
    }
}
