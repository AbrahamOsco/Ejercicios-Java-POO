package EjercicioSuperPoderes;

public class Rayo implements Elemento{
    private double MULTIPLICADOR_FUERZA;
    private double MULTIPLICADOR_AGILIDAD;
    public Rayo(){
        this.MULTIPLICADOR_FUERZA = 27.0;
        this.MULTIPLICADOR_AGILIDAD = 11.0;
    }
    @Override
    public double atacar(double fuerza, double agilidad) {
        return MULTIPLICADOR_FUERZA * fuerza + MULTIPLICADOR_AGILIDAD * agilidad;
    }
}
