package Razas.Muertos_Vivientes.Edificaciones.Recolectores;

import Interfaces.Recolectores;

import java.util.ArrayList;

public class CanalizadorOscuro implements Recolectores {
    int MagiaNegra;
    int Vida;


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

    public ArrayList<Integer> Crear() {
        setVida(1700);
        return getVida();
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
        setMagiaNegra(30);
    }
}
