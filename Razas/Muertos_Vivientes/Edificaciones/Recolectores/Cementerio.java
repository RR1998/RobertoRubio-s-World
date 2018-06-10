package Razas.Muertos_Vivientes.Edificaciones.Recolectores;

import Razas.Recolectores;

public class Cementerio implements Recolectores {
    int Cadaveres;
    int Vida;

    public int getCadaveres() {
        return Cadaveres;
    }

    public void setCadaveres(int cadaveres) {
        Cadaveres = cadaveres;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(1600);
        return getVida();
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    @Override
    public int Recolectar(){
        return getCadaveres();
    }

    @Override
    public void Generar(){
        setCadaveres(50);
    }
}
