package Razas.Orcos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class MadrigeraOrca implements Recolectores {
    int Esclavos;
    int Vida;
    ArrayList<Integer> Creado = new ArrayList<Integer>();

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

    //Nomenclatura de cosotos  Vida Recurso1, Recurso2, Recurso3

    @Override
    public ArrayList<Integer> Crear(){
        setVida(2500);
        Creado.add(0,getVida());
        Creado.add(1,70);
        Creado.add(2,60);
        Creado.add(3,40);
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
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
