package Razas.Humanos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class CampoMaderero implements Recolectores {
    int Madera;
    int Vida;
    ArrayList<String> Creado = new ArrayList<String>();

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    //Nomenclatura de cosotos  Vida Recurso1, Recurso2, Recurso3

    @Override
    public ArrayList<String> Crear(){
        setVida(2000);
        Creado.add(0, Integer.toString(getVida()));
        Creado.add(1,"100");
        Creado.add(2,"50");
        Creado.add(3,"20");
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    public int getMadera() {
        return Madera;
    }

    public void setMadera(int madera) {
        Madera = madera;
    }

    @Override
    public int Recolectar(){
        return getMadera();
    }

    @Override
    public void Generar(){
        setMadera(50 + getMadera());
    }
}
