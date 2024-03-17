package EntrenadorPokemon;

public class Pokemon {
    private String nombre;
    private String elemento;

    public Pokemon(String nombre, String elemento) {
        this.nombre = nombre;
        this.elemento = elemento;
    }
    public String getNombre() {
        return nombre;
    }
}
