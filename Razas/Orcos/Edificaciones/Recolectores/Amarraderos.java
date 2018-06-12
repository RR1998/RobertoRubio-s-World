package Razas.Orcos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class Amarraderos implements Recolectores{
    int Amarras;
    int Vida;
    ArrayList<Integer> Creado = new ArrayList<Integer>();

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

    //Nomenclatura de cosotos  Vida Recurso1, Recurso2, Recurso3

    @Override
    public ArrayList<Integer> Crear(){
        setVida(2500);
        Creado.add(0,getVida());
        Creado.add(1,50);
        Creado.add(2,30);
        Creado.add(3,40);
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
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
