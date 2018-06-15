import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    String NombreJugador1, NombreJugador2;
    String Raza1, Raza2;
    CentroMando Jugador1 = new CentroMando();
    CentroMando Jugador2 = new CentroMando();
    ArrayList<ArrayList> ConstruccionesJ1 = new ArrayList<>();
    ArrayList<ArrayList> ConstruccionesJ2 = new ArrayList<>();

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

    public ArrayList<ArrayList> getConstruccionesJ1() {
        return ConstruccionesJ1;
    }

    public void setConstruccionesJ1(ArrayList<ArrayList> construccionesJ1) {
        ConstruccionesJ1 = construccionesJ1;
    }

    public ArrayList<ArrayList> getConstruccionesJ2() {
        return ConstruccionesJ2;
    }

    public void setConstruccionesJ2(ArrayList<ArrayList> construccionesJ2) {
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
                            setRaza1("Elfos");
                            Jugador1.Inicio("Elfo");
                            break;
                        case 2:
                            setRaza1("Humanos");
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
                            setRaza2("Elfos");
                            Jugador2.Inicio("Elfo");
                            break;
                        case 2:
                            setRaza2("Humanos");
                            Jugador2.Inicio("Humano");
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
            System.out.println("\n Fase numero " + cont);
            System.out.println("Turno de " + NombreJugador1);
            System.out.println("1. Construir");//Hecho
            System.out.println("2. Recolectar");
            System.out.println("3. Mostrar Almacenado y limite de almacenado");//Hecho
            System.out.println("4. Mostrar nivel del Centro de Mando");//Hecho
            System.out.println("5. Subir de nivel");//Hecho
            System.out.println("6. Entrenar");
            System.out.println("7. Atacar");
            System.out.println("8. Defender");
            System.out.println("9. Rendirse");//Hecho
            Decision = Scanner.nextLine();
            try{
                Opcion = Integer.parseInt(Decision);
            }
            catch(NumberFormatException e){
                System.out.println("Ingrese un numero que se encuentre en las opciones por favor");
            }
            switch(Opcion){
                case 1:
                    System.out.println("Ingrese el edificio que desea construir");
                    Edificio = Scanner.nextLine();
                    Construir(Edificio, 1);
                    System.out.println("Sus contstrucciones son ");
                    System.out.println(getConstruccionesJ1());
                    System.out.println("Recursos restantes");
                    MostrarRecursos(getRaza1(), 1);
                    break;
                case 2:
                    Recolectar(getRaza1(), 1);
                case 3:
                    MostrarRecursos(getRaza1(), 1);
                    break;
                case 4:
                    System.out.println("El nivel de si centro de mando es: " + Jugador1.getNivel());
                    break;
                case 5:
                    SubirNivel(1);
                    break;
                case 9:
                    Rendirse(1);
                    break;
                default:
                    System.out.println("No ingreso ninguna opcion pierde turno");
            }
            Generar(Raza1, 1);
            Generar(Raza2, 2);
            if (Jugador1.getVida() <= 0){
                System.out.println("Gana " + getNombreJugador2());
            }

            if (Jugador2.getVida() <= 0){
                System.out.println("Gana " + getNombreJugador1());
            }
        }
    }

    public void Construir(String Edificio, int J) {
        ArrayList<ArrayList> Aux = new ArrayList<>();
        ArrayList<String> Aux2 = new ArrayList<>();
        ArrayList<ArrayList> Aux3;
        if (J == 1) {
            try {
                Aux.add(Jugador1.Construir(getRaza1(), Edificio));
                if (Aux.get(Aux.size() - 1) == null) {
                    System.out.println("No tienes recursos suficientes para realizar esto");
                } else {
                    Aux2.add(Edificio);
                    Aux.add(Aux2);
                    Aux3 = getConstruccionesJ1();
                    Aux3.add(Aux);
                    setConstruccionesJ1(Aux3);
                }
            } catch (NullPointerException e) {
                Aux.remove(Aux.size() - 1);
                setConstruccionesJ1(getConstruccionesJ1().remove(getConstruccionesJ1().size() - 1));
                System.out.println("No tienes los recursos suficientes para realizar esto");
            }
        }
        if (J == 2) {
            try {
                Aux.add(Jugador2.Construir(getRaza1(), Edificio));
                if (Aux.get(Aux.size() - 1) == null) {
                    System.out.println("No tienes recursos suficientes para realizar esto");
                } else {
                    Aux2.add(Edificio);
                    Aux.add(Aux2);
                    Aux3 = getConstruccionesJ2();
                    Aux3.add(Aux);
                    setConstruccionesJ2(Aux3);
                }
            } catch (NullPointerException e) {
                Aux.remove(Aux.size() - 1);
                setConstruccionesJ2(getConstruccionesJ2().remove(getConstruccionesJ2().size() - 1));
                System.out.println("No tienes los recursos suficientes para realizar esto");
            }
        }
    }

    public void Generar(String Raza, int J){
        if(J == 1){
            Jugador1.Generar(getConstruccionesJ1());
        }
        if (J == 2){
            Jugador2.Generar(getConstruccionesJ2());
        }
    }

    public void Recolectar(String Raza, int J) {

        if (J == 1) {


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
            case "Elfos":
                System.out.println("Su maximo de Bendiciones de la diosa es " + Aux.get(0));
                System.out.println("Su Maximo de Mana Lunar es " + Aux.get(1));
                System.out.println("Su Maximo de Piedras Celestiales es " + Aux.get(2));
                System.out.println("Usted posee " + Aux2.get(0) + " Bendiciones de la diosa");
                System.out.println("Usted posee " + Aux2.get(1) + " de Mana Lunar");
                System.out.println("Usted posee " + Aux2.get(2) + " Piedras Celestiales");
                break;
            case "Humanos":
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

    public void SubirNivel(int J) {
        if (J == 1) {
            Jugador1.SubirNivel();
            System.out.printf("Nivel ");
            System.out.println(Jugador1.getNivel());
        }
        if (J == 2){
            Jugador2.SubirNivel();
            System.out.println("Nivel ");
            System.out.println(Jugador2.getNivel());
        }
    }

    public void Rendirse (int J){
        if (J == 1){
            Jugador1.setVida(0);
        }
        if (J == 2){
            Jugador2.setVida(0);
        }
    }
}
