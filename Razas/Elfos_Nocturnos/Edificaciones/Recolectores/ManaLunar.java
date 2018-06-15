package Razas.Elfos_Nocturnos.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class ManaLunar implements Recolectores {
    int ManaLunar;
    int Vida;
    ArrayList<String> Creado = new ArrayList<String>();

    public int getManaLunar() {
        return ManaLunar;
    }

    public void setManaLunar(int manaLunar) {
        ManaLunar = manaLunar;
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
        Creado.add(1,"90");
        Creado.add(2,"30");
        Creado.add(3,"20");
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public int Recolectar (){
        setManaLunar(30);
        return getManaLunar();
    }

    @Override
    public void Generar(){
        setManaLunar(30 + getManaLunar());
    }
}
