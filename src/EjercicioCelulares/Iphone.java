package EjercicioCelulares;

public class Iphone {
    private double durabilidad;

    public Iphone(){
        this.durabilidad = 5.0;
    }

    public void llamar(MotoG motoG, double cantMinutos) {
        if (durabilidad <= 0){
            throw new IphoneConBateriaApagadaNoPuedeLlamarError();
        }
        motoG.recibirLlamada(cantMinutos);
        usarBateria(cantMinutos);
    }
    private void usarBateria(double cantMinutos){
        this.durabilidad = this.durabilidad - cantMinutos/100.0;
    }

    public double getCantBateria() {
        return this.durabilidad;
    }

    public void recibirLlamada(double cantMinutos) {
        usarBateria(cantMinutos);
    }
}
