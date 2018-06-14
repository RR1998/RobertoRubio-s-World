import Producers.ConstrucProducer;
import Razas.Elfos_Nocturnos.Edificaciones.ConstruccionesElfas;
import Razas.Humanos.Edificaciones.ConstruccionesHumanas;
import Razas.Muertos_Vivientes.Edificaciones.ConstruccionesMuertos;
import Razas.Orcos.Edificaciones.ConstruccionesOrcos;
import java.util.ArrayList;

// hace el metodo para crear el centro de mando, que implemente la interfaz y que este solo posea vida en su array
public class CentroMando{
    ArrayList<Integer> GeneracionInicial = new ArrayList<>();
    ArrayList<Integer> AlmacenamientoMaximo = new ArrayList<>();
    ArrayList<Integer> CantidadAlmacenada = new ArrayList<>();
    String Raza;
    int Nivel, Vida;

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

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

    public ArrayList<Integer> getGeneracionInicial() {
        return GeneracionInicial;
    }

    public void setGeneracionInicial(ArrayList<Integer> generacionInicial) {
        GeneracionInicial = generacionInicial;
    }

    public ArrayList<Integer> getAlmacenamientoMaximo() {
        return AlmacenamientoMaximo;
    }

    public void setAlmacenamientoMaximo(ArrayList<Integer> almacenamientoMaximo) {
        AlmacenamientoMaximo = almacenamientoMaximo;
    }

    /*@Override
    public ArrayList<Integer> Crear(){
        switch (getRaza()) {
            case "Elfos":
                setVida(4500);
                break;
            case "Humanos":
                setVida(6000);
                break;
            case" Muertos":
                setVida(4000);
                break;
            case "Orcos":
                setVida(3500);
                break;
        }
        Creado.add(0,getVida());
        return Creado;
    }*/

    public void VidaRestante(int Dano){
        setVida(getVida() - Dano);
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
                setVida((int) Math.round(getVida()*0.15));
                return AlmacenamientoMaximo = getAlmacenamientoMaximo();
            case 2:
                setAlmacenamientoMaximo(AlmMaximo((int) Math.round(Aux1+(Aux1*0.3)), (int) Math.round(Aux2+(Aux2*0.3)), (int) Math.round(Aux3+(Aux3*0.3))));
                setVida((int) Math.round(getVida()*0.15));
                return AlmacenamientoMaximo = getAlmacenamientoMaximo();
            case 3:
                setAlmacenamientoMaximo(AlmMaximo((int) Math.round(Aux1+(Aux1*0.5)), (int) Math.round(Aux2+(Aux2*0.5)), (int) Math.round(Aux3+(Aux3*0.5))));
                setVida((int) Math.round(getVida()*0.15));
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
        GeneracionInicial.add(0, Recurso1);
        GeneracionInicial.add(1, Recurso2);
        GeneracionInicial.add(2, Recurso3);
        return GeneracionInicial;
    }

    // Nomenclatura Recursos1, Recursos2, Recursos3, Vida, Nivel, IDRaza

    public ArrayList<Integer> Inicio(String Raza) {
        setNivel(0);
        AlmacenamientoM();
        switch (Raza) {
            case "Elfo":
                GeneracionInicial = AlmacenadoInicial(300, 300, 300);
                setVida(4500);
                setCantidadAlmacenada(GeneracionInicial);
                GeneracionInicial.add(3, getVida());
                GeneracionInicial.add(4, getNivel());
                GeneracionInicial.add(5, 1);
                return getCantidadAlmacenada();

            case "Humano":
                GeneracionInicial = AlmacenadoInicial(150, 300, 300);
                setVida(6000);
                setCantidadAlmacenada(GeneracionInicial);
                GeneracionInicial.add( 3, getVida());
                GeneracionInicial.add(4, getNivel());
                GeneracionInicial.add(5, 2);
                return getCantidadAlmacenada();

            case "Muertos Vivientes":
                GeneracionInicial = AlmacenadoInicial(300, 300, 300);
                setVida(3700);
                setCantidadAlmacenada(GeneracionInicial);
                GeneracionInicial.add(3, getVida());
                GeneracionInicial.add(4, getNivel());
                GeneracionInicial.add(5, 3);
                return getCantidadAlmacenada();

            case "Orcos":
                GeneracionInicial = AlmacenadoInicial(300, 300, 300);
                setVida(3000);
                setCantidadAlmacenada(GeneracionInicial);
                GeneracionInicial.add(3, getVida());
                GeneracionInicial.add(4, getNivel());
                GeneracionInicial.add(5, 4);
                return getCantidadAlmacenada();

        }
        return null;
    }

    public ArrayList<Integer> Construir(String Raza, String Edificio){
        //ConversorIDs Conversor = new ConversorIDs();
        //Raza = Conversor.Conversor(ID);
        //setRaza(Raza);
        ConstrucProducer Edificios = new ConstrucProducer();
        ArrayList<Integer> Almacenado = getCantidadAlmacenada();
        ArrayList<Integer> Costo;
        ArrayList<Integer> NuevoAlmacen = new ArrayList<>();
        switch(Raza){
            case "Elfos":
                ConstruccionesElfas Elfos = new ConstruccionesElfas();
                Costo = Elfos.getCElfo(Edificio).Crear();
                NuevoAlmacen.add(0, Almacenado.get(0) - Costo.get(0));
                NuevoAlmacen.add(0, Almacenado.get(1) - Costo.get(1));
                NuevoAlmacen.add(0, Almacenado.get(2) - Costo.get(2));
                setCantidadAlmacenada(NuevoAlmacen);
                System.out.println (Elfos.getCElfo(Edificio));
                return Elfos.getCElfo(Edificio).Crear();
            case "Humanos":
                ConstruccionesHumanas Humanos = new ConstruccionesHumanas();
                Costo = Humanos.getCHumano(Edificio).Crear();
                NuevoAlmacen.add(0, Almacenado.get(0) - Costo.get(0));
                NuevoAlmacen.add(0, Almacenado.get(1) - Costo.get(1));
                NuevoAlmacen.add(0, Almacenado.get(2) - Costo.get(2));
                setCantidadAlmacenada(NuevoAlmacen);
                System.out.println(Humanos.getCHumano(Edificio));
                return Humanos.getCHumano(Edificio).Crear();
            case "Muertos":
                ConstruccionesMuertos Muertos = new ConstruccionesMuertos();
                Costo = Muertos.getCMuerto(Edificio).Crear();
                NuevoAlmacen.add(0, Almacenado.get(0) - Costo.get(0));
                NuevoAlmacen.add(0, Almacenado.get(1) - Costo.get(1));
                NuevoAlmacen.add(0, Almacenado.get(2) - Costo.get(2));
                setCantidadAlmacenada(NuevoAlmacen);
                System.out.println(Muertos.getCMuerto(Edificio));
                return Muertos.getCMuerto(Edificio).Crear();
            case "Orcos":
                ConstruccionesOrcos Orcos = new ConstruccionesOrcos();
                Costo = Orcos.getCOrco(Edificio).Crear();
                NuevoAlmacen.add(0, Almacenado.get(0) - Costo.get(0));
                NuevoAlmacen.add(0, Almacenado.get(1) - Costo.get(1));
                NuevoAlmacen.add(0, Almacenado.get(2) - Costo.get(2));
                setCantidadAlmacenada(NuevoAlmacen);
                System.out.println(Orcos.getCOrco(Edificio));
                return Orcos.getCOrco(Edificio).Crear();
        }
        return null;
    }
}
