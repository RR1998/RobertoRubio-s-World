package Razas.Muertos_Vivientes.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class Cementerio implements Recolectores {
    int Cadaveres;
    int Vida;
    ArrayList<String> Creado = new ArrayList<String>();

    public int getCadaveres() {
        return Cadaveres;
    }

    public void setCadaveres(int cadaveres) {
        Cadaveres = cadaveres;
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
        setVida(1300);
        Creado.add(0, Integer.toString(getVida()));
        Creado.add(1,"150");
        Creado.add(2,"110");
        Creado.add(3,"70");
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public int Recolectar(){
        return getCadaveres();
    }

    @Override
    public void Generar(){
        setCadaveres(50 + getCadaveres());
    }
}
