package Razas.Muertos_Vivientes.Edificaciones.Recolectores;

import Razas.Recolectores;

public class CanalizadorOscuro implements Recolectores {
    int MagiaNegra;

    public int getMagiaNegra() {
        return MagiaNegra;
    }

    public void setMagiaNegra(int magiaNegra) {
        MagiaNegra = magiaNegra;
    }

    @Override
    public int Recolectar(){
        return getMagiaNegra();
    }

    @Override
    public void Generar(){
        setMagiaNegra(30);
    }
}
