public class ConversorIDs{
    public static String Conversor(int ID){
        switch (ID){
            case 1:
                return "Elfos";
            case 2:
                return "Humanos";
            case 3:
                return "Muertos";
            case 4:
                return "Orcos";
        }
        return null;
    }
}
