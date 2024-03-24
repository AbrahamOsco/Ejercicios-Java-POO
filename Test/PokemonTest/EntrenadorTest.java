package PokemonTest;

import EntrenadorPokemon.Entrenador;
import EntrenadorPokemon.Pokedex;
import EntrenadorPokemon.Pokemon;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntrenadorTest {

    @Test
    public void testEntrenadorVisualizaAPikachuYCharizardLaCantidadDePokemonesVistosDebeSer2(){
        Pokemon pikachu = new Pokemon("Pikachu", "Electrico");
        Pokemon charizard = new Pokemon("Charizard", "Fuego");
        Entrenador e = new Entrenador("Ricardo Ronny");

        e.visualizarPokemon(pikachu);
        e.visualizarPokemon(charizard);
        double cantPokemonsVistos = e.getCantPokemonsVistos();

        assertEquals(2.0, cantPokemonsVistos);
    }

    @Test
    public void testEntreadorVisualizaAPsyduck2PikachusMewtonPikachuYCharizardLaCantidadDePokemonesVistosDebeSer3(){
        // arrange
        Pokemon pikachu1 = new Pokemon("Pikachu", "Electrico");
        Pokemon pikachu2 = new Pokemon("Pikachu", "Electrico");
        Pokemon pikachu3 = new Pokemon("Pikachu", "Electrico");

        Pokemon charizard = new Pokemon("Charizard", "Fuego");
        Pokemon psyduck = new Pokemon("Psyduck", "Normal");
        Pokemon mewto = new Pokemon("Mewtwo", "Normal");
        Entrenador entrenador = new Entrenador("Ricardo David");

        // act
        entrenador.visualizarPokemon(psyduck);
        entrenador.visualizarPokemon(pikachu1);
        entrenador.visualizarPokemon(pikachu2);
        entrenador.visualizarPokemon(mewto);
        entrenador.visualizarPokemon(charizard);
        entrenador.visualizarPokemon(pikachu3);

        double cantPokemonsVistos = entrenador.getCantPokemonsVistos();

        assertEquals(4.0, cantPokemonsVistos);
    }
}
