package Razas.Muertos_Vivientes.Edificaciones.Recolectores;

import Interfaces.Recolectores;

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

    public int Crear() {
        setVida(1400);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
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
