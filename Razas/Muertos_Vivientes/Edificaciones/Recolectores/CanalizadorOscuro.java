package Razas.Muertos_Vivientes.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class CanalizadorOscuro implements Recolectores {
    int MagiaNegra;
    int Vida;
    ArrayList<String> Creado = new ArrayList<String>();

    public int getMagiaNegra() {
        return MagiaNegra;
    }

    public void setMagiaNegra(int magiaNegra) {
        MagiaNegra = magiaNegra;
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
        setVida(1500);
        Creado.add(0, Integer.toString(getVida()));
        Creado.add(1,"80");
        Creado.add(2,"20");
        Creado.add(3,"15");
        return Creado;
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public int Recolectar(){
        return getMagiaNegra();
    }

    @Override
    public void Generar(){
        setMagiaNegra(30 + getMagiaNegra());
    }
}
