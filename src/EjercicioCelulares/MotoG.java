package EjercicioCelulares;

public class MotoG {
    private double durabilidad;
    public MotoG(){
        this.durabilidad = 5.0;
    }

    public double getCantBateria() {
        return this.durabilidad;
    }

    public void recibirLlamada(double cantMinutos) {
        usarBateria();
    }
    public void usarBateria(){
        this.durabilidad -=0.25;
    }

    public void llamar(Iphone paola, double cantMinutos) {
        if(durabilidad <= 0){
            throw new MotoGConBateriaApagadaNoPuedeLlamarError();
        }
        paola.recibirLlamada(cantMinutos);
        usarBateria();
    }

    public boolean estaApagado() {
        return (durabilidad == 0);
    }
}
