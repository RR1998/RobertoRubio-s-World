package Razas.Orcos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

public class MadrigeraOrca implements Recolectores {
    int Esclavos;
    int Vida;


    public int getEsclavos() {
        return Esclavos;
    }

    public void setEsclavos(int esclavos) {
        Esclavos = esclavos;
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
        return getEsclavos();
    }

    @Override
    public void Generar(){
        setEsclavos(10);
    }
}
