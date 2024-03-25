package EjercicioVehiculos;

public class Camion extends  Vehiculo {
    private int cantDias;
    private double pma;
    private final double PRECIO_BASE_CAMION = 300.0;
    public Camion(int cantDias , double pma) {
        this.cantDias = cantDias;
        this.pma = pma;
    }

    public double alquilar() {
        return PRECIO_BASE_POR_DIA * cantDias + PRECIO_BASE_CAMION * pma;
    }

    public void presentarKg(){
        System.out.println("Presnto los kg " + (pma));
    }
}
