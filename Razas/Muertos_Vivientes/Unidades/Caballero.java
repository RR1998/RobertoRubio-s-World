package Razas.Muertos_Vivientes.Unidades;
/*
 *@Autor Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
import Interfaces.Unidades;

public class Caballero implements Unidades {
    int Vida;
    int DanoU;
    int TiempoCreacion;

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getDanoU() {
        return DanoU;
    }

    public void setDanoU(int danoU) {
        DanoU = danoU;
    }

    public int getTiempoCreacion() {
        return TiempoCreacion;
    }

    public void setTiempoCreacion(int tiempoCreacion) {
        TiempoCreacion = tiempoCreacion;
    }

    @Override
    public int Crear(){
        setVida(500);
        return getVida();
    }

    @Override
    public int Dano (){
        setDanoU(80);
        return getDanoU();
    }

    @Override
    public void VidaRestante(int Dano){
        setVida(getVida()-Dano);
    }

    @Override
    public int TiempoCreacion (){
        setTiempoCreacion(3);
        return getTiempoCreacion();
    }
}
