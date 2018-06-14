import java.util.Scanner;

public class Juego {
    String NombreJugador1, NombreJugador2;
    CentroMando Jugador1 = new CentroMando();
    CentroMando Jugador2 = new CentroMando();

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
        Scanner Scanner = new Scanner(System.in);

        for(int i = 0; i<2; i++) {
            int Opcion;
            System.out.println("Ingrese un nombre de jugador"+ i++);
            i--;
            if (i == 0) {
                setNombreJugador1(Scanner.nextLine());
            }
            if (i == 1){
                setNombreJugador2(Scanner.next());
            }
            System.out.println("Jugador" + i++ + "seleccione su raza por favor entre las siguientes opciones");
            System.out.println("1. Elfos de la Noche");
            System.out.println("2. Humanos");
            System.out.println("3. Muertos Vivientes");
            System.out.println("4. Orcos");
            i--;
            String RazaJugador = Scanner.nextLine();
            try{
                Opcion = Integer.parseInt(RazaJugador);
                if(i == 0 && Opcion < 5 && Opcion > 0) {
                    switch(Opcion){
                        case 1:
                            Jugador1.Inicio("Elfo");
                            break;
                        case 2:
                            Jugador1.Inicio("Humano");
                            break;
                        case 3:
                            Jugador1.Inicio("Muertos Vivientes");
                            break;
                        case 4:
                            Jugador1.Inicio("Orcos");
                            break;
                    }
                }
                if(i == 1 && Opcion < 5 && Opcion > 0){
                    switch(Opcion){
                        case 1:
                            Jugador2.Inicio("Elfo");
                            break;
                        case 2:
                            Jugador2.Inicio("Humano");
                            break;
                        case 3:
                            Jugador2.Inicio("Muertos Vivientes");
                            break;
                        case 4:
                            Jugador2.Inicio("Orcos");
                            break;
                    }
                }
                else{
                    System.out.println("Ingrese un numero que se encuentre en el menu por favor");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Ingrese un numero que se encuentre en el menu por favor");
            }
        }
        while (Jugador1.getVida() > 0 && Jugador2.getVida() > 0){
            if (Jugador1.getVida() <= 0){
                System.out.println("Gana " + getNombreJugador2());
            }
            if (Jugador2.getVida() <= 0){
                System.out.println("Gana " + getNombreJugador1());
            }
        }
    }
}
