package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class BendicionesdelaDiosa implements Recolectores {
    int BendicionesdelaDiosa;
    int Vida;
    ArrayList<String> Creado = new ArrayList<String>();

    public int getBendicionesdelaDiosa() {
        return BendicionesdelaDiosa;
    }

    public void setBendicionesdelaDiosa(int bendicionesdelaDiosa) {
        BendicionesdelaDiosa = bendicionesdelaDiosa;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    //Nomenclatura de cosotos  Vida Recurso1, Recurso2, Recurso3

    @Override
    public ArrayList<String> Crear(){
        setVida(3300);
        Creado.add(0, Integer.toString(getVida()));
        Creado.add(1,"80");
        Creado.add(2,"50");
        Creado.add(3,"10");
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public int Recolectar (){
        setBendicionesdelaDiosa(10);
        return getBendicionesdelaDiosa();
    }

    @Override
    public void Generar(){
        setBendicionesdelaDiosa(10 + getBendicionesdelaDiosa());
    }
}
