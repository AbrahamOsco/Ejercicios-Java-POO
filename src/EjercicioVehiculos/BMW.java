package EjercicioVehiculos;

public class BMW implements Categoria {

    @Override
    public double calcularPrecio(int cantPlazas) {
        return 150 * cantPlazas;
    }
}
