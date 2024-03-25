package EjercicioVehiculos;

public class Coche extends Vehiculo {

    private int cantDias;
    private int cantPlazas;
    Categoria categoria;

    public Coche(int cantDias, int cantPlazas, Categoria categoria) {
        this.cantDias = cantDias;
        this.cantPlazas = cantPlazas;
        this.categoria = categoria;
    }
    public double alquilar() {
        return PRECIO_BASE_POR_DIA * cantDias + categoria.calcularPrecio(cantPlazas);
        /*
        double precioFinal = 500 * cantDias;
        if (tipoCategoria == "BMW" || tipoCategoria == "AUDI"){
            precioFinal += 150 * cantPlazas;
        } else if (tipoCategoria == "Tesla") {
            precioFinal += 300 * cantPlazas;
        }
        return precioFinal;
         */
    }
    public void presentar(){
        System.out.println("Presnto la cant plazas " + (cantPlazas));
    }

}
