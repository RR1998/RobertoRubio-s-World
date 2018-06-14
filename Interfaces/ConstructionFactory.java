package Interfaces;

public interface ConstructionFactory {
    Creacion getCElfo(String Type);
    Creacion getCHumano(String Type);
    Creacion getCMuerto(String Type);
    Creacion getCOrco(String Type);
}
