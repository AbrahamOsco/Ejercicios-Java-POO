package EjercicioSuperPoderes;

public class Persona {
    private String nombre;
    private Elemento elemento;
    private double fuerza;
    private double agilidad;

    public Persona(String unNombre, Elemento unElemento, double fuerza, double agilidad) {
        this.nombre = unNombre;
        this.elemento = unElemento;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
    }


    public double atacar() {
        return elemento.atacar(fuerza, agilidad);
        /*
        double danioTotal = 0;
        if (elemento == "Fuego"){
            danioTotal = 30 * fuerza + 10 * agilidad;
        } else if (elemento == "Agua"){
            danioTotal = 20 * fuerza + 15 * agilidad;
        } else if (elemento == "Rayo"){
            danioTotal = 27 * fuerza + 11 * agilidad;
        }
        return danioTotal;
        */
    }
}
