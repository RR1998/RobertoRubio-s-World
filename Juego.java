import Producers.ConstrucProducer;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    String NombreJugador1, NombreJugador2;
    String Raza1, Raza2;
    CentroMando Jugador1 = new CentroMando();
    CentroMando Jugador2 = new CentroMando();
    ArrayList<ConstrucProducer> ConstruccionesJ1 = new ArrayList<>();
    ArrayList<ConstrucProducer> ConstruccionesJ2 = new ArrayList<>();

    public String getRaza1() {
        return Raza1;
    }

    public void setRaza1(String raza1) {
        Raza1 = raza1;
    }

    public String getRaza2() {
        return Raza2;
    }

    public void setRaza2(String raza2) {
        Raza2 = raza2;
    }

    public String getNombreJugador1() {
        return NombreJugador1;
    }

    public void setNombreJugador1(String nombreJugador1) {
        NombreJugador1 = nombreJugador1;
    }

    public String getNombreJugador2() {
        return NombreJugador2;
    }

    public void setNombreJugador2(String nombreJugador2) {
        NombreJugador2 = nombreJugador2;
    }

    public ArrayList<ConstrucProducer> getConstruccionesJ1() {
        return ConstruccionesJ1;
    }

    public void setConstruccionesJ1(ArrayList<ConstrucProducer> construccionesJ1) {
        ConstruccionesJ1 = construccionesJ1;
    }

    public ArrayList<ConstrucProducer> getConstruccionesJ2() {
        return ConstruccionesJ2;
    }

    public void setConstruccionesJ2(ArrayList<ConstrucProducer> construccionesJ2) {
        ConstruccionesJ2 = construccionesJ2;
    }

    /*
    public CentroMando getJugador1() {
        return Jugador1;
    }

    public void setJugador1(CentroMando jugador1) {
        Jugador1 = jugador1;
    }

    public CentroMando getJugador2() {
        return Jugador2;
    }

    public void setJugador2(CentroMando jugador2) {
        Jugador2 = jugador2;
    }
    */

    public void Jugar(){
        int cont = 0;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Los Elfos de la Noche\n");
        System.out.println("Bajo los espesos bosques de Ashenvale se encuentran los misteriosos Elfos de la noche \n" +
                "Seres de forma humana que viven apartados de todos con el unico interes de proteger sus bosques.\n" +
                "Rara vez se relacionan con otras razas ya que creen que podrian corromper sus dominios pero los tiempos han cambiado\n" +
                "y ha llegado la hora de defender sus preciados dominios armados con el poder de la luna y arcos bendecidos por esta\n" +
                "estan decididos a vencer a cualquiera que se les interponga\n");
        System.out.println("Los Humanos de Lordaeron\n");
        System.out.println("Expulsados de su tierra natal por los despiadados muertos vivientes los humanos buscan ascentarse en los valles de Kalimdor\n" +
                "teniendo que luchar contra el inclemente continente inexplorado donde solo unas pocas exploraciones humanas habian arribado\n" +
                "armados con armas de fuego de los enanos y la arquitectura robusta caracteristica de los humanos estan listos para soportar a cualquier enemigo.\n");
        System.out.println("La plaga de los Muertos Vivientes\n");
        System.out.println("Invocados por el necromancer Kel'tuzad escoltado por el principe caido Arthas los muertos tienen un solo objetivo,\n" +
                "arrasar con todo a su paso para preparar la invasion de la legion de fuego, los muertos vivientes no tienen piedad contra sus enemigos\n" +
                "se dice que muchos de sus soldados llamados las abominaciones estan hechos de piezas de sus enemigos y que la forma de operar de su armada\n" +
                "es sembrar el terror en sus enemigos por medio de sus armas que utilizan piezas humanas como municion o sus invocaciones de magia profana\n" +
                "ya han conquistado todo el continente del este y solo les queda uno... Kalimdor\n");
        System.out.println("La Orda de los Orcos\n");
        System.out.println("Expulsados del continente del este por los humanos y guiados por su lidet Thrall hacia Kalimdor\n" +
                "los orcos son feroces gerreros, despiadados en el campo de batalla y sangrientos mas que nadie se caracterizan\n" +
                "por sus escaramuzas veloces y debastadoras y por colocar sus poderosas barricadas anti-peronal para defender sus construcciones\n" +
                "esta civilizacion esta hecha para hacer ataques rapidos y destruir a sus enemigos de manera sopresi\n");

        for(int i = 0; i<2; i++) {
            int Opcion;
            int NumeroJugador = i+1;
            String RazaJugador;
            System.out.println("Ingrese un nombre de jugador " + NumeroJugador);
            if (i == 0) {
                setNombreJugador1(Scanner.nextLine());
            }
            if (i == 1){
                setNombreJugador2(Scanner.nextLine());
            }
            System.out.println("Jugador " + NumeroJugador + " seleccione su raza por favor entre las siguientes opciones");
            System.out.println("1. Elfos de la Noche");
            System.out.println("2. Humanos");
            System.out.println("3. Muertos Vivientes");
            System.out.println("4. Orcos");
            RazaJugador = Scanner.nextLine();
            try{
                Opcion = Integer.parseInt(RazaJugador);
                if(i == 0 && Opcion < 5 && Opcion > 0) {
                    switch(Opcion){
                        case 1:
                            setRaza1("Elfo");
                            Jugador1.Inicio("Elfo");
                            System.out.println(Jugador1.getCantidadAlmacenada());
                            break;
                        case 2:
                            setRaza1("Humano");
                            Jugador1.Inicio("Humano");
                            break;
                        case 3:
                            setRaza1("Muertos");
                            Jugador1.Inicio("Muertos Vivientes");
                            break;
                        case 4:
                            setRaza1("Orcos");
                            Jugador1.Inicio("Orcos");
                            break;
                    }
                }
                if(i == 1 && Opcion < 5 && Opcion > 0){
                    switch(Opcion){
                        case 1:
                            setRaza2("Elfo");
                            Jugador2.Inicio("Elfo");
                            break;
                        case 2:
                            setRaza2("Humano");
                            Jugador2.Inicio("Humano");
                            System.out.println(Jugador2.getCantidadAlmacenada());
                            break;
                        case 3:
                            setRaza2("Muertos");
                            Jugador2.Inicio("Muertos Vivientes");
                            break;
                        case 4:
                            setRaza2("Orcos");
                            Jugador2.Inicio("Orcos");
                            break;
                    }
                }
                if(Opcion > 5 || Opcion < 1 ) {
                    System.out.println("Ingrese un numero que se encuentre en el menu por favor");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Ingrese un numero que se encuentre en el menu por favor o evite ingresar letras");
            }
        }
        while (Jugador1.getVida() > 0 && Jugador2.getVida() > 0){
            cont++;
            String Edificio;
            int Opcion = 0;
            String Decision;
            System.out.println("Fase numero" + cont);
            if (Jugador1.getVida() <= 0){
                System.out.println("Gana " + getNombreJugador2());
            }

            if (Jugador2.getVida() <= 0){
                System.out.println("Gana " + getNombreJugador1());
            }

            System.out.println("Turno de " + NombreJugador1);
            System.out.println("1. Construir");
            System.out.println("2. Recolectar");
            System.out.println("3. Mostrar Almacenado y limite de almacenado");
            System.out.println("4. Mostrar nivel del Centro de Mando");
            System.out.println("5. Subir de nivel");
            System.out.println("6. Entrenar");
            System.out.println("7. Atacar");
            System.out.println("8. Defender");
            Decision = Scanner.nextLine();
            try{
                Opcion = Integer.parseInt(Decision);
            }
            catch(NumberFormatException e){
                System.out.println("Ingrese un numero que se encuentre en las opciones por favor");
            }
            switch(Opcion){
                case 1:
                    System.out.println("Ingrese el Edificio que desea construir");
                    Edificio = Scanner.nextLine();
                    Construir(Edificio, 1);
                    break;
                case 3:
                    MostrarRecursos(getRaza1(), 1);
                    break;
            }
        }
    }

    public void Construir(String Edificio, int J){
        ArrayList<ConstrucProducer> Aux =  new ArrayList<>();
        ArrayList<ConstrucProducer> Aux2 =  new ArrayList<>();
        if (J == 1){
            Aux.add(Jugador1.Construir(getRaza1(), Edificio));
            setConstruccionesJ1(Aux);
        }
        if (J == 2){
            Aux2.add(Jugador2.Construir(getRaza2(), Edificio));
            setConstruccionesJ2(Aux2);
        }
    }

    public void MostrarRecursos(String Raza, int J){
        ArrayList<Integer> Aux = new ArrayList<>();
        ArrayList<Integer> Aux2 = new ArrayList<>();
        if(J == 1){
            Aux = Jugador1.getAlmacenamientoMaximo();
            Aux2 = Jugador1.getCantidadAlmacenada();
        }
        if (J == 2){
            Aux = Jugador2.getAlmacenamientoMaximo();
            Aux2 = Jugador2.getCantidadAlmacenada();
        }
        switch (Raza){
            case "Elfo":
                System.out.println("Su maximo de Bendiciones de la diosa es " + Aux.get(0));
                System.out.println("Su Maximo de Mana Lunar es " + Aux.get(1));
                System.out.println("Su Maximo de Piedras Celestiales es " + Aux.get(2));
                System.out.println("Usted posee " + Aux2.get(0) + " Bendiciones de la diosa");
                System.out.println("Usted posee " + Aux2.get(1) + " de Mana Lunar");
                System.out.println("Usted posee " + Aux2.get(2) + " Piedras Celestiales");
                break;
            case "Humano":
                System.out.println("Su maximo de Madera es " + Aux.get(0));
                System.out.println("Su Maximo de Trigo es " + Aux.get(1));
                System.out.println("Su Maximo de Oro es " + Aux.get(2));
                System.out.println("Usted posee " + Aux2.get(0) + " de Madera");
                System.out.println("Usted posee " + Aux2.get(1) + " de Trigo");
                System.out.println("Usted posee " + Aux2.get(2) + " de Oro");
                break;
            case "Muertos":
                System.out.println("Su maximo de Magia Negra es " + Aux.get(0));
                System.out.println("Su Maximo de Cadaveres es " + Aux.get(1));
                System.out.println("Su Maximo de Almas es " + Aux.get(2));
                System.out.println("Usted posee " + Aux2.get(0) + " de Magia Negra");
                System.out.println("Usted posee " + Aux2.get(1) + " Cadaveres");
                System.out.println("Usted posee " + Aux2.get(2) + " Almas");
                break;
            case"Orcos":
                System.out.println("Su maximo de Amarras es " + Aux.get(0));
                System.out.println("Su Maximo de Piedra es " + Aux.get(1));
                System.out.println("Su Maximo de Esclavos es " + Aux.get(2));
                System.out.println("Usted posee " + Aux2.get(0) + " Amarras");
                System.out.println("Usted posee " + Aux2.get(1) + " de Piedra");
                System.out.println("Usted posee " + Aux2.get(2) + " Esclavos");
                break;
        }
    }
}
