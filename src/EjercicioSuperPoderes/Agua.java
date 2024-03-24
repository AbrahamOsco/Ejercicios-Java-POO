package EjercicioSuperPoderes;

public class Agua implements Elemento {
    private double MULTIPLICADOR_FUERZA;
    private double MULTIPLICADOR_AGILIDAD;

    public Agua(){
        this.MULTIPLICADOR_FUERZA = 20.0;
        this.MULTIPLICADOR_AGILIDAD = 15.0;
    }
    @Override
    public double atacar(double fuerza, double agilidad) {
        return MULTIPLICADOR_FUERZA * fuerza + MULTIPLICADOR_AGILIDAD * agilidad;
    }
}
