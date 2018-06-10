package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class BendicionesdelaDiosa implements Recolectores {
    int BendicionesdelaDiosa;
    int Vida;
    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        this.Vida = vida;
    }

    public int getBendicionesdelaDiosa() {
        return BendicionesdelaDiosa;
    }

    public void setBendicionesdelaDiosa(int bendicionesdelaDiosa) {
        BendicionesdelaDiosa = bendicionesdelaDiosa;
    }

    @Override
    public int Construirse() {
        setVida(3000);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    @Override
    public int Recolectar (){
        return getBendicionesdelaDiosa();
    }

    @Override
    public void Generar(){
        setBendicionesdelaDiosa(10);
    }
}
