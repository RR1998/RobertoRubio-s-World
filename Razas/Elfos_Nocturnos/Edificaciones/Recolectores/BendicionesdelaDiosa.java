package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Razas.Recolectores;

public class BendicionesdelaDiosa implements Recolectores {
    int Generado;

    public int getGenerado() {
        return Generado;
    }

    public void setGenerado(int generado) {
        Generado = generado;
    }
    @Override
    public int Recolectar (){
        return getGenerado();
    }
    @Override
    public void Generar(){
        setGenerado(10);
    }
}
