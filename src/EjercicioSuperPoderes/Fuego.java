package EjercicioSuperPoderes;

public class Fuego implements Elemento {
    private double MULTIPLICADOR_FUERZA;
    private double MULTIPLICADOR_AGILIDAD;

    public Fuego(){
        this.MULTIPLICADOR_FUERZA = 30.0;
        this.MULTIPLICADOR_AGILIDAD = 10.0;
    }

    @Override
    public double atacar(double fuerza, double agilidad) {
        return MULTIPLICADOR_FUERZA * fuerza + MULTIPLICADOR_AGILIDAD * agilidad;
    }
}
