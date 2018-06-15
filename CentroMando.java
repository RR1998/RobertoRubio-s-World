import Razas.Elfos_Nocturnos.Edificaciones.ConstruccionesElfas;
import Razas.Elfos_Nocturnos.Edificaciones.Recolectores.BendicionesdelaDiosa;
import Razas.Humanos.Edificaciones.ConstruccionesHumanas;
import Razas.Muertos_Vivientes.Edificaciones.ConstruccionesMuertos;
import Razas.Orcos.Edificaciones.ConstruccionesOrcos;
import java.util.ArrayList;

// hace el metodo para crear el centro de mando, que implemente la interfaz y que este solo posea vida en su array
public class CentroMando {
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

    public void VidaRestante(int Dano) {
        setVida(getVida() - Dano);
    }

    public void SubirNivel() {
        int Total, Nivel = getNivel();
        ArrayList<Integer> Aux;
        ArrayList<Integer> CantidadAlmacenada;
        CantidadAlmacenada = getCantidadAlmacenada();
        Aux = getAlmacenamientoMaximo();
        Total = (int) Math.round((Aux.get(0) + Aux.get(1) + Aux.get(2)) * 0.25);
        if (CantidadAlmacenada.get(0) > (Total / 3) && CantidadAlmacenada.get(1) > (Total / 3) && CantidadAlmacenada.get(2) > (Total / 3)) {
            setNivel(Nivel++);
        } else {
            System.out.println("No tiene los recursos para realizar esta accion");
        }
    }

    public ArrayList<Integer> AlmacenamientoM() {
        int Nivel = getNivel();
        int Aux1, Aux2, Aux3;
        if (Nivel == 0) {
            setAlmacenamientoMaximo(AlmMaximo(1000, 1000, 1000));
            return AlmacenamientoMaximo = getAlmacenamientoMaximo();
        }
        AlmacenamientoMaximo = getAlmacenamientoMaximo();
        Aux1 = AlmacenamientoMaximo.get(0);
        Aux2 = AlmacenamientoMaximo.get(1);
        Aux3 = AlmacenamientoMaximo.get(2);
        switch (Nivel) {
            case 1:
                setAlmacenamientoMaximo(AlmMaximo((int) Math.round(Aux1 + (Aux1 * 0.1)), (int) Math.round(Aux2 + (Aux2 * 0.1)), (int) Math.round(Aux3 + (Aux3 * 0.1))));
                setVida((int) Math.round(getVida() * 0.15));
                return AlmacenamientoMaximo = getAlmacenamientoMaximo();
            case 2:
                setAlmacenamientoMaximo(AlmMaximo((int) Math.round(Aux1 + (Aux1 * 0.3)), (int) Math.round(Aux2 + (Aux2 * 0.3)), (int) Math.round(Aux3 + (Aux3 * 0.3))));
                setVida((int) Math.round(getVida() * 0.15));
                return AlmacenamientoMaximo = getAlmacenamientoMaximo();
            case 3:
                setAlmacenamientoMaximo(AlmMaximo((int) Math.round(Aux1 + (Aux1 * 0.5)), (int) Math.round(Aux2 + (Aux2 * 0.5)), (int) Math.round(Aux3 + (Aux3 * 0.5))));
                setVida((int) Math.round(getVida() * 0.15));
                return AlmacenamientoMaximo = getAlmacenamientoMaximo();
        }
        return null;
    }

    public ArrayList<Integer> AlmMaximo(int Recurso1, int Recurso2, int Recurso3) {
        ArrayList<Integer> Aux = new ArrayList<>();
        Aux.add(0, Recurso1);
        Aux.add(1, Recurso2);
        Aux.add(2, Recurso3);
        return Aux;
    }

    public ArrayList<Integer> AlmacenadoInicial(int Recurso1, int Recurso2, int Recurso3) {
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
                GeneracionInicial = AlmacenadoInicial(300, 300, 180);
                setVida(4500);
                setCantidadAlmacenada(GeneracionInicial);
                GeneracionInicial.add(3, getVida());
                GeneracionInicial.add(4, getNivel());
                GeneracionInicial.add(5, 1);
                return getCantidadAlmacenada();

            case "Humano":
                GeneracionInicial = AlmacenadoInicial(300, 300, 180);
                setVida(6000);
                setCantidadAlmacenada(GeneracionInicial);
                GeneracionInicial.add(3, getVida());
                GeneracionInicial.add(4, getNivel());
                GeneracionInicial.add(5, 2);
                return getCantidadAlmacenada();

            case "Muertos Vivientes":
                GeneracionInicial = AlmacenadoInicial(300, 300, 180);
                setVida(3700);
                setCantidadAlmacenada(GeneracionInicial);
                GeneracionInicial.add(3, getVida());
                GeneracionInicial.add(4, getNivel());
                GeneracionInicial.add(5, 3);
                return getCantidadAlmacenada();

            case "Orcos":
                GeneracionInicial = AlmacenadoInicial(300, 300, 200);
                setVida(3000);
                setCantidadAlmacenada(GeneracionInicial);
                GeneracionInicial.add(3, getVida());
                GeneracionInicial.add(4, getNivel());
                GeneracionInicial.add(5, 4);
                return getCantidadAlmacenada();

        }
        return null;
    }

    public ArrayList<String> Construir(String Raza, String Edificio) {
        ArrayList<Integer> Almacenado = getCantidadAlmacenada();
        ArrayList<String> Costo;
        ArrayList<Integer> Aux = new ArrayList<>();
        ArrayList<Integer> NuevoAlmacen = new ArrayList<>();
        switch (Raza) {
            case "Elfos":
                ConstruccionesElfas Elfos = new ConstruccionesElfas();
                Costo = Elfos.getCElfo(Edificio).Crear();
                Aux.add(0, Integer.parseInt(Costo.get(1)));
                Aux.add(1, Integer.parseInt(Costo.get(2)));
                Aux.add(2, Integer.parseInt(Costo.get(3)));
                if (Almacenado.get(0) >= Aux.get(0) && Almacenado.get(1) >= Aux.get(1) && Almacenado.get(2) >= Aux.get(2)) {
                    NuevoAlmacen.add(0, Almacenado.get(0) - Aux.get(0));
                    NuevoAlmacen.add(1, Almacenado.get(1) - Aux.get(1));
                    NuevoAlmacen.add(2, Almacenado.get(2) - Aux.get(2));
                    setCantidadAlmacenada(NuevoAlmacen);
                    System.out.println(Elfos.getCElfo(Edificio));
                    return Elfos.getCElfo(Edificio).Crear();
                }
                return null;
            case "Humanos":
                ConstruccionesHumanas Humanos = new ConstruccionesHumanas();
                Costo = Humanos.getCHumano(Edificio).Crear();
                Aux.add(0, Integer.parseInt(Costo.get(1)));
                Aux.add(1, Integer.parseInt(Costo.get(2)));
                Aux.add(2, Integer.parseInt(Costo.get(3)));
                if (Almacenado.get(0) >= Aux.get(0) && Almacenado.get(1) >= Aux.get(1) && Almacenado.get(2) >= Aux.get(2)) {
                    NuevoAlmacen.add(0, Almacenado.get(0) - Aux.get(0));
                    NuevoAlmacen.add(1, Almacenado.get(1) - Aux.get(1));
                    NuevoAlmacen.add(2, Almacenado.get(2) - Aux.get(2));
                    setCantidadAlmacenada(NuevoAlmacen);
                    System.out.println(Humanos.getCHumano(Edificio));
                    return Humanos.getCHumano(Edificio).Crear();
                }
                return null;
            case "Muertos":
                ConstruccionesMuertos Muertos = new ConstruccionesMuertos();
                Costo = Muertos.getCMuerto(Edificio).Crear();
                Aux.add(0, Integer.parseInt(Costo.get(1)));
                Aux.add(1, Integer.parseInt(Costo.get(2)));
                Aux.add(2, Integer.parseInt(Costo.get(3)));
                if (Almacenado.get(0) >= Aux.get(0) && Almacenado.get(1) >= Aux.get(1) && Almacenado.get(2) >= Aux.get(2)) {
                    NuevoAlmacen.add(0, Almacenado.get(0) - Aux.get(0));
                    NuevoAlmacen.add(1, Almacenado.get(1) - Aux.get(1));
                    NuevoAlmacen.add(2, Almacenado.get(2) - Aux.get(2));
                    setCantidadAlmacenada(NuevoAlmacen);
                    System.out.println(Muertos.getCMuerto(Edificio));
                    return Muertos.getCMuerto(Edificio).Crear();
                }
                return null;
            case "Orcos":
                ConstruccionesOrcos Orcos = new ConstruccionesOrcos();
                Costo = Orcos.getCOrco(Edificio).Crear();
                Aux.add(0, Integer.parseInt(Costo.get(1)));
                Aux.add(1, Integer.parseInt(Costo.get(2)));
                Aux.add(2, Integer.parseInt(Costo.get(3)));
                if (Almacenado.get(0) >= Aux.get(0) && Almacenado.get(1) >= Aux.get(1) && Almacenado.get(2) >= Aux.get(2)) {
                    NuevoAlmacen.add(0, Almacenado.get(0) - Aux.get(0));
                    NuevoAlmacen.add(1, Almacenado.get(1) - Aux.get(1));
                    NuevoAlmacen.add(2, Almacenado.get(2) - Aux.get(2));
                    setCantidadAlmacenada(NuevoAlmacen);
                    System.out.println(Orcos.getCOrco(Edificio));
                    return Orcos.getCOrco(Edificio).Crear();
                }
                return null;
        }
        return null;
    }

    public void Generar(ArrayList<ArrayList> Construcciones) {
        ArrayList<Object> Aux = new ArrayList<>();
        ConstruccionesElfas Elfos = new ConstruccionesElfas();
        ConstruccionesHumanas Humanos = new ConstruccionesHumanas();
        ConstruccionesOrcos Orcos = new ConstruccionesOrcos();
        ConstruccionesMuertos Muertos = new ConstruccionesMuertos();
        for (int i = 0; i < Construcciones.size() - 1; i++) {
            Aux.add(Construcciones.get(i).get(1));
            String Aux2 = Aux.get(i).toString();
            switch (Aux2) {
                case "Bendiciones de la luna":
                    Elfos.getCElfo(Aux2).Generar();
                    break;
                case "Mana lunar":
                    Elfos.getCElfo(Aux2).Generar();
                    break;
                case "Piedras celestiales":
                    Elfos.getCElfo(Aux2).Generar();
                    break;
                case "Granja":
                    Humanos.getCHumano(Aux2).Generar();
                    break;
                case "Campo maderero":
                    Humanos.getCHumano(Aux2).Generar();
                    break;
                case "Mina de oro":
                    Humanos.getCHumano(Aux2).Generar();
                    break;
                case "Canalizador oscuro":
                    Muertos.getCMuerto(Aux2).Generar();
                    break;
                case "Profanador de almas":
                    Muertos.getCMuerto(Aux2).Generar();
                    break;
                case "Cementerio":
                    Muertos.getCMuerto(Aux2).Generar();
                    break;
                case "Amarradero":
                    Orcos.getCOrco(Aux2).Generar();
                    break;
                case "Demoledores de piedra":
                    Orcos.getCOrco(Aux2).Generar();
                    break;
                case "Madrigera orca":
                    Orcos.getCOrco(Aux2).Generar();
                    break;
            }
        }
    }

    public void Recolectar(ArrayList<ArrayList> Construcciones){
        ArrayList<Object> Aux = new ArrayList<>();
        ConstruccionesElfas Elfos = new ConstruccionesElfas();
        ConstruccionesHumanas Humanos = new ConstruccionesHumanas();
        ConstruccionesOrcos Orcos = new ConstruccionesOrcos();
        ConstruccionesMuertos Muertos = new ConstruccionesMuertos();
        for (int i = 0; i < Construcciones.size() - 1; i++) {
            Aux.add(Construcciones.get(i).get(1));
            String Aux2 = Aux.get(i).toString();
            switch (Aux2) {
                case "Bendiciones de la luna":
                    Elfos.getCElfo(Aux2).Recolectar();
                    break;
                case "Mana lunar":
                    Elfos.getCElfo(Aux2).Recolectar();
                    break;
                case "Piedras celestiales":
                    Elfos.getCElfo(Aux2).Recolectar();
                    break;
                case "Granja":
                    Humanos.getCHumano(Aux2).Recolectar();
                    break;
                case "Campo maderero":
                    Humanos.getCHumano(Aux2).Recolectar();
                    break;
                case "Mina de oro":
                    Humanos.getCHumano(Aux2).Recolectar();
                    break;
                case "Canalizador oscuro":
                    Muertos.getCMuerto(Aux2).Recolectar();
                    break;
                case "Profanador de almas":
                    Muertos.getCMuerto(Aux2).Recolectar();
                    break;
                case "Cementerio":
                    Muertos.getCMuerto(Aux2).Recolectar();
                    break;
                case "Amarradero":
                    Orcos.getCOrco(Aux2).Recolectar();
                    break;
                case "Demoledores de piedra":
                    Orcos.getCOrco(Aux2).Recolectar();
                    break;
                case "Madrigera orca":
                    Orcos.getCOrco(Aux2).Recolectar();
                    break;
            }
        }
    }
}
