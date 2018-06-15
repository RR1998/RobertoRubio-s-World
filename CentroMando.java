import Razas.Elfos_Nocturnos.Edificaciones.ConstruccionesElfas;
import Razas.Elfos_Nocturnos.Unidades.GeneradorElfos;
import Razas.Humanos.Edificaciones.ConstruccionesHumanas;
import Razas.Humanos.Unidades.GeneradorHumanos;
import Razas.Muertos_Vivientes.Edificaciones.ConstruccionesMuertos;
import Razas.Muertos_Vivientes.Unidades.GeneradorMuertos;
import Razas.Orcos.Edificaciones.ConstruccionesOrcos;
import Razas.Orcos.Unidades.GeneradorOrcos;

import java.util.ArrayList;

// hace el metodo para crear el centro de mando, que implemente la interfaz y que este solo posea vida en su array
public class CentroMando {
    ArrayList<Integer> GeneracionInicial = new ArrayList<>();
    ArrayList<Integer> AlmacenamientoMaximo = new ArrayList<>();
    ArrayList<Integer> CantidadAlmacenada = new ArrayList<>();
    ArrayList<ArrayList> Tropas = new ArrayList<>();
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

    public ArrayList<ArrayList> getTropas() {
        return Tropas;
    }

    public void setTropas(ArrayList<ArrayList> tropas) {
        Tropas = tropas;
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
                    Tropas.add(Muertos.getCMuerto(Edificio).Crear());
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
                case "[Bendiciones de la luna]":
                    Elfos.getCElfo("Bendiciones de la luna").Generar();
                    break;
                case "[Mana lunar]":
                    Elfos.getCElfo("Mana lunar").Generar();
                    break;
                case "[Piedras celestiales]":
                    Elfos.getCElfo("Piedras celestiales").Generar();
                    break;
                case "[Granja]":
                    System.out.println("la dvd si llega :v");
                    Humanos.getCHumano("Granja").Generar();
                    break;
                case "[Campo maderero]":
                    Humanos.getCHumano("Campo maderero").Generar();
                    break;
                case "[Mina de oro]":
                    Humanos.getCHumano("Mina de oro").Generar();
                    break;
                case "[Canalizador oscuro]":
                    Muertos.getCMuerto("[Canalizador oscuro").Generar();
                    break;
                case "[Profanador de almas]":
                    Muertos.getCMuerto("Profanador de almas").Generar();
                    break;
                case "[Cementerio]":
                    Muertos.getCMuerto("Cementerio").Generar();
                    break;
                case "[Amarradero]":
                    Orcos.getCOrco("Amarradero").Generar();
                    break;
                case "[Demoledores de piedra]":
                    Orcos.getCOrco("Demoledores de piedra").Generar();
                    break;
                case "[Madrigera orca]":
                    Orcos.getCOrco("Madrigera orca").Generar();
                    break;
            }
        }
    }

    public void Entrenar(String Raza, String Unidad){
        ArrayList<ArrayList> Tropas = getTropas();
        ArrayList<String> Costo;
        ArrayList<Integer> Almacenado = getCantidadAlmacenada();
        ArrayList<Integer> Aux = new ArrayList<>();
        ArrayList<Integer> NuevoAlmacen = new ArrayList<>();
        switch (Raza) {
            case "Elfos":
                GeneradorElfos Elfos = new GeneradorElfos();
                Costo = Elfos.getElfo(Unidad).Crear();
                Aux.add(0, Integer.parseInt(Costo.get(1)));
                Aux.add(1, Integer.parseInt(Costo.get(2)));
                Aux.add(2, Integer.parseInt(Costo.get(3)));
                if (Almacenado.get(0) >= Aux.get(0) && Almacenado.get(1) >= Aux.get(1) && Almacenado.get(2) >= Aux.get(2)) {
                    NuevoAlmacen.add(0, Almacenado.get(0) - Aux.get(0));
                    NuevoAlmacen.add(1, Almacenado.get(1) - Aux.get(1));
                    NuevoAlmacen.add(2, Almacenado.get(2) - Aux.get(2));
                    setCantidadAlmacenada(NuevoAlmacen);
                    Tropas.add(Elfos.getElfo(Unidad).Crear());
                    setTropas(Tropas);
                    break;
                }
            case "Humanos":
                GeneradorHumanos Humanos = new GeneradorHumanos();
                Costo = Humanos.getHumano(Unidad).Crear();
                Aux.add(0, Integer.parseInt(Costo.get(1)));
                Aux.add(1, Integer.parseInt(Costo.get(2)));
                Aux.add(2, Integer.parseInt(Costo.get(3)));
                if (Almacenado.get(0) >= Aux.get(0) && Almacenado.get(1) >= Aux.get(1) && Almacenado.get(2) >= Aux.get(2)) {
                    NuevoAlmacen.add(0, Almacenado.get(0) - Aux.get(0));
                    NuevoAlmacen.add(1, Almacenado.get(1) - Aux.get(1));
                    NuevoAlmacen.add(2, Almacenado.get(2) - Aux.get(2));
                    setCantidadAlmacenada(NuevoAlmacen);
                    Tropas.add(Humanos.getHumano(Unidad).Crear());
                    setTropas(Tropas);
                    break;
                }
            case "Muertos":
                GeneradorMuertos Muertos = new GeneradorMuertos();
                Costo = Muertos.getMuerto(Unidad).Crear();
                Aux.add(0, Integer.parseInt(Costo.get(1)));
                Aux.add(1, Integer.parseInt(Costo.get(2)));
                Aux.add(2, Integer.parseInt(Costo.get(3)));
                if (Almacenado.get(0) >= Aux.get(0) && Almacenado.get(1) >= Aux.get(1) && Almacenado.get(2) >= Aux.get(2)) {
                    NuevoAlmacen.add(0, Almacenado.get(0) - Aux.get(0));
                    NuevoAlmacen.add(1, Almacenado.get(1) - Aux.get(1));
                    NuevoAlmacen.add(2, Almacenado.get(2) - Aux.get(2));
                    setCantidadAlmacenada(NuevoAlmacen);
                    Tropas.add(Muertos.getMuerto(Unidad).Crear());
                    setTropas(Tropas);
                    break;
                }
            case "Orcos":
                GeneradorOrcos Orcos = new GeneradorOrcos();
                Costo = Orcos.getOrco(Unidad).Crear();
                Aux.add(0, Integer.parseInt(Costo.get(1)));
                Aux.add(1, Integer.parseInt(Costo.get(2)));
                Aux.add(2, Integer.parseInt(Costo.get(3)));
                if (Almacenado.get(0) >= Aux.get(0) && Almacenado.get(1) >= Aux.get(1) && Almacenado.get(2) >= Aux.get(2)) {
                    NuevoAlmacen.add(0, Almacenado.get(0) - Aux.get(0));
                    NuevoAlmacen.add(1, Almacenado.get(1) - Aux.get(1));
                    NuevoAlmacen.add(2, Almacenado.get(2) - Aux.get(2));
                    setCantidadAlmacenada(NuevoAlmacen);
                    Tropas.add(Orcos.getOrco(Unidad).Crear());
                    setTropas(Tropas);
                    break;
                }
        }
    }

    public void Recolectar(ArrayList<ArrayList> Construcciones){
        ArrayList<Object> Aux = new ArrayList<>();
        ArrayList<Integer> Inventario = getCantidadAlmacenada();
        ArrayList<Integer> Agregado = new ArrayList<>();
        ArrayList<Integer> Aux3 = new ArrayList<>();
        ConstruccionesElfas Elfos = new ConstruccionesElfas();
        ConstruccionesHumanas Humanos = new ConstruccionesHumanas();
        ConstruccionesOrcos Orcos = new ConstruccionesOrcos();
        ConstruccionesMuertos Muertos = new ConstruccionesMuertos();
        Agregado.add(0, 0);
        Agregado.add(1, 0);
        Agregado.add(2, 0);
        for (int i = 0; i < Construcciones.size(); i++) {
            Aux.add(Construcciones.get(i).get(1));
            String Aux2 = Aux.get(i).toString();
            switch (Aux2) {
                case "[Bendiciones de la luna]":
                    Agregado.set(0,Elfos.getCElfo("Bendiciones de la luna").Recolectar());
                    break;
                case "[Mana lunar]":
                    Agregado.set(1, Elfos.getCElfo("Mana lunar").Recolectar());
                    break;
                case "[Piedras celestiales]":
                    Agregado.set(2, Elfos.getCElfo("Piedras celestiales").Recolectar());
                    break;
                case "[Granja]":
                    Agregado.set(0, Humanos.getCHumano("Granja").Recolectar());
                    break;
                case "[Campo maderero]":
                    Agregado.set(1, Humanos.getCHumano("Campo maderero").Recolectar());
                    break;
                case "[Mina de oro]":
                    Agregado.set(2, Humanos.getCHumano("Mina de oro").Recolectar());
                    break;
                case "[Canalizador oscuro]":
                    Agregado.set(0, Muertos.getCMuerto("Canalizador oscuro").Recolectar());
                    break;
                case "[Profanador de almas]":
                    Agregado.set(1, Muertos.getCMuerto("Profanador de almas").Recolectar());
                    break;
                case "[Cementerio]":
                    Agregado.set(2, Muertos.getCMuerto("Cementerio").Recolectar());
                    break;
                case "[Amarradero]":
                    Agregado.set(0, Orcos.getCOrco("Amarradero").Recolectar());
                    break;
                case "[Demoledores de piedra]":
                    Agregado.set(1, Orcos.getCOrco("Demoledores de piedra").Recolectar());
                    break;
                case "[Madrigera orca]":
                    Agregado.set(2, Orcos.getCOrco("Madrigera orca").Recolectar());
                    break;
            }
        }
        Aux3.add(0, Inventario.get(0) + Agregado.get(0));
        Aux3.add(1, Inventario.get(1) + Agregado.get(1));
        Aux3.add(2, Inventario.get(2) + Agregado.get(2));
        setCantidadAlmacenada(Aux3);
    }
}
