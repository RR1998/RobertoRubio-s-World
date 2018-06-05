package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class BendicionesdelaDiosa implements Recolectores {
    int BendicionesdelaDiosa;

    public int getBendicionesdelaDiosa() {
        return BendicionesdelaDiosa;
    }

    public void setBendicionesdelaDiosa(int bendicionesdelaDiosa) {
        BendicionesdelaDiosa = bendicionesdelaDiosa;
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
