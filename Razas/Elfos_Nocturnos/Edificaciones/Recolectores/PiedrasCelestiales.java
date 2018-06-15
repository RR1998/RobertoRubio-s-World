package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class PiedrasCelestiales implements Recolectores {
    int PiedrasCelestiales;
    int Vida;
    ArrayList<String> Creado = new ArrayList<String>();

    public int getPiedrasCelestiales() {
        return PiedrasCelestiales;
    }

    public void setPiedrasCelestiales(int piedrasCelestiales) {
        PiedrasCelestiales = piedrasCelestiales;
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
        Creado.add(1,"75");
        Creado.add(2,"50");
        Creado.add(3,"25");
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public int Recolectar(){
        setPiedrasCelestiales(100);
        return getPiedrasCelestiales();
    }

    @Override
    public void Generar(){
        setPiedrasCelestiales(40 + getPiedrasCelestiales());
    }
}
