package Razas.Elfos_Nocturnos.Edificaciones.Militares;


import Interfaces.Militares;
import Interfaces.Unidades;
import Interfaces.UnitFactory;
import Razas.UnitProducer;

public class AncestrodeGuerra implements Militares {
    int Vida;
    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    @Override
    public int Construirse() {
        setVida(3000);
        return getVida();
    }
    @Override
    public void VidaRestante(int Dano){
        setVida(Vida - Dano);
    }

    @Override
    public void crear(String Type){
        UnitFactory Elfos;
        Elfos = UnitProducer.getUnit("Elfos");
        if (Type == "Arquero") {
            Unidades Arquero = Elfos.getElfo(Type);
        }
        if (Type == "Sable Luna Plata"){
            Unidades Sable = Elfos.getElfo(Type);
        }
        if (Type == "Sacerdotiza Lunar"){
            Unidades Sacerdotiza = Elfos.getElfo(Type);
        }
    }

}
