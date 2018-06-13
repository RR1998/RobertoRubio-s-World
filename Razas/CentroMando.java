package Razas;

import java.util.ArrayList;

public class CentroMando{
    ArrayList<Integer> CantidadAlmacenar = new ArrayList<>();
    ArrayList<Integer> AlmacenamientoMaximo = new ArrayList<>();
    ArrayList<Integer> CantidadAlmacenada = new ArrayList<>();
    int Nivel, Vida;

    public ArrayList<Integer> getCantidadAlmacenada() {
        return CantidadAlmacenada;
    }

    public void setCantidadAlmacenada(ArrayList<Integer> cantidadAlmacenada) {
        CantidadAlmacenada = cantidadAlmacenada;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }

    public ArrayList<Integer> getCantidadAlmacenar() {
        return CantidadAlmacenar;
    }

    public void setCantidadAlmacenar(ArrayList<Integer> cantidadAlmacenar) {
        CantidadAlmacenar = cantidadAlmacenar;
    }

    public ArrayList<Integer> getAlmacenamientoMaximo() {
        return AlmacenamientoMaximo;
    }

    public void setAlmacenamientoMaximo(ArrayList<Integer> almacenamientoMaximo) {
        AlmacenamientoMaximo = almacenamientoMaximo;
    }

    public void SubirNivel(){
        int Total, Nivel = getNivel();
        ArrayList<Integer> Aux;
        ArrayList<Integer> CantidadAlmacenada;
        CantidadAlmacenada = getCantidadAlmacenada();
        Aux = getAlmacenamientoMaximo();
        Total = (int) Math.round((Aux.get(0)+ Aux.get(1) + Aux.get(2)) * 0.25);
        if (CantidadAlmacenada.get(0) > (Total/3) && CantidadAlmacenada.get(1) > (Total/3) && CantidadAlmacenada.get(2) > (Total/3)) {
            setNivel(Nivel++);
        }
        else{
            System.out.println("No tiene los recursos para realizar esta accion");
        }
    }

    public ArrayList<Integer> AlmacenamientoM(){
        int Nivel = getNivel();
        int Aux1, Aux2, Aux3;
        if (Nivel == 0){
            setAlmacenamientoMaximo(AlmMaximo(1000,1000,1000));
            return AlmacenamientoMaximo = getAlmacenamientoMaximo();
        }
        AlmacenamientoMaximo = getAlmacenamientoMaximo();
        Aux1 = AlmacenamientoMaximo.get(0);
        Aux2 = AlmacenamientoMaximo.get(1);
        Aux3 = AlmacenamientoMaximo.get(2);
        switch(Nivel){
            case 1:
                setAlmacenamientoMaximo(AlmMaximo((int) Math.round(Aux1+(Aux1*0.1)),(int) Math.round(Aux2+(Aux2*0.1)), (int) Math.round(Aux3+(Aux3*0.1))));
                return AlmacenamientoMaximo = getAlmacenamientoMaximo();
            case 2:
                setAlmacenamientoMaximo(AlmMaximo((int) Math.round(Aux1+(Aux1*0.3)), (int) Math.round(Aux2+(Aux2*0.3)), (int) Math.round(Aux3+(Aux3*0.3))));
                return AlmacenamientoMaximo = getAlmacenamientoMaximo();
            case 3:
                setAlmacenamientoMaximo(AlmMaximo((int) Math.round(Aux1+(Aux1*0.5)), (int) Math.round(Aux2+(Aux2*0.5)), (int) Math.round(Aux3+(Aux3*0.5))));
                return AlmacenamientoMaximo = getAlmacenamientoMaximo();
        }
        return null;
    }

    public ArrayList<Integer> AlmMaximo(int Recurso1, int Recurso2, int Recurso3){
        ArrayList<Integer> Aux = new ArrayList<>();
        Aux.add(0,Recurso1);
        Aux.add(1, Recurso2);
        Aux.add(2, Recurso3);
        return Aux;
    }

    public ArrayList<Integer> AlmacenadoInicial(int Recurso1, int Recurso2, int Recurso3){
        CantidadAlmacenar.add(0, Recurso1);
        CantidadAlmacenar.add(1, Recurso2);
        CantidadAlmacenar.add(2, Recurso3);
        return CantidadAlmacenar;
    }

    public ArrayList<Integer> Inicio(String Raza){
        setNivel(0);
        switch(Raza){
            case "Elfo":
                return CantidadAlmacenar = AlmacenadoInicial(300, 300, 300);
            case "Humano":
                return CantidadAlmacenar = AlmacenadoInicial(300, 300, 300);
            case "Muertos Vivientes":
                return CantidadAlmacenar = AlmacenadoInicial(300, 300, 300);
            case "Orcos":
                return CantidadAlmacenar = AlmacenadoInicial(300, 300, 300);
        }
        return null;
    }
}
