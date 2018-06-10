package Razas.Humanos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

public class Granja implements Recolectores {
    int Trigo;
    int Vida;

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(1900);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    public int getTrigo() {
        return Trigo;
    }

    public void setTrigo(int trigo) {
        Trigo = trigo;
    }
    @Override
    public int Recolectar(){
        return getTrigo();
    }
    @Override
    public void Generar(){
        setTrigo(70);
    }
}
