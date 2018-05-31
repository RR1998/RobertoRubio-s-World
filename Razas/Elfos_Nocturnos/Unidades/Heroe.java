package Razas.Elfos_Nocturnos.Unidades;

public class Heroe implements UnidadesElfo {
    @Override
    public int Vida (){
        int Vida = 500;
        return Vida;
    }
    @Override
    public int Dano (){
        int Dano = 150;
        return Dano;
    }
    @Override
    public int TiempoCreacion(){
        int Tiempo = 3;
        return Tiempo;
    }
}
