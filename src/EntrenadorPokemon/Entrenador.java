package EntrenadorPokemon;

public class Entrenador {
    Pokedex pokedex;
    private String nombreEntrenador;

    public Entrenador(String nombreEntrenador) {
        pokedex = new Pokedex();
        this.nombreEntrenador = nombreEntrenador;
    }

    public void visualizarPokemon(Pokemon unPokemon) {
        pokedex.visualizarPokemon(unPokemon);
    }

    public int getCantPokemonsVistos() {
        return pokedex.getCantPokemonsVistos();
    }
}
