package Razas;

import java.util.ArrayList;

public class CentroMando {
    ArrayList<Integer> Almacenamiento = new ArrayList<>();


    public ArrayList<Integer> Inicio(String Raza){
        switch(Raza){
            case "Elfo":
                return Almacenamiento = AlmacenadoInicial(100, 100,100);
            case "Humano":
                return Almacenamiento = AlmacenadoInicial(100,100,100);
            case "Muertos Vivientes":
                return Almacenamiento = AlmacenadoInicial(100, 100, 100);
            case "Orcos":
                return Almacenamiento = AlmacenadoInicial(100, 100, 100);
        }
        return null;
    }
    public ArrayList<Integer> AlmacenadoInicial(int Recurso1, int Recurso2, int Recurso3){
        Almacenamiento.add(0,Recurso1);
        Almacenamiento.add(1,Recurso2);
        Almacenamiento.add(2,Recurso3);
        return Almacenamiento;
    }
}
