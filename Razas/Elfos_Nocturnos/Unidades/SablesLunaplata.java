package Razas.Elfos_Nocturnos.Unidades;

public class SablesLunaplata implements UnidadesElfo {
    @Override
    public int Vida(){
        int Vida = 250;
        return 250;
    }
    @Override
    public int Dano (){
        int Dano = 50;
        return Dano;
    }
    @Override
    public int TiempoCreacion (){
        int Tiempo = 3;
        return Tiempo;
    }
}
