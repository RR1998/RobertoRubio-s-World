package Razas.Orcos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

public class Amarraderos implements Recolectores{
    int Amarras;
    int Vida;

    public int getAmarras() {
        return Amarras;
    }

    public void setAmarras(int amarras) {
        Amarras = amarras;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(1500);
        return getVida();
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    @Override
    public int Recolectar(){
        return getAmarras();
    }

    @Override
    public void Generar(){
        setAmarras(50);
    }
}
