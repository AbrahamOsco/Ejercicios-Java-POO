package PokemonTest;

import EntrenadorPokemon.Pokedex;
import EntrenadorPokemon.Pokemon;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokedexTest {

    @Test
    public void testPokedexVisualizaAPikachuSnorlaxYCharizardLaCantidadDePokemonesVistosDebeSer3(){
        // arrange
        Pokemon pikachu = new Pokemon("Pikachu", "Electrico");
        Pokemon charizard = new Pokemon("Charizard", "Fuego");
        Pokemon snorlax = new Pokemon("Snorlax", "Normal");
        Pokemon snorlax2 = new Pokemon("Snorlax", "Normal");
        Pokedex pokedex = new Pokedex();

        // act
        pokedex.visualizarPokemon(snorlax);
        pokedex.visualizarPokemon(pikachu);
        pokedex.visualizarPokemon(snorlax2);
        pokedex.visualizarPokemon(charizard);
        double cantPokemonsVistos = pokedex.getCantPokemonsVistos();

        assertEquals(3.0, cantPokemonsVistos);
    }

    @Test
    public void testPokedexVisualizaAPsyduck2PikachusMewtonPikachuYCharizardLaCantidadDePokemonesVistosDebeSer3(){
        // arrange
        Pokemon pikachu1 = new Pokemon("Pikachu", "Electrico");
        Pokemon pikachu2 = new Pokemon("Pikachu", "Electrico");
        Pokemon pikachu3 = new Pokemon("Pikachu", "Electrico");

        Pokemon charizard = new Pokemon("Charizard", "Fuego");
        Pokemon psyduck = new Pokemon("Psyduck", "Normal");
        Pokemon mewto = new Pokemon("Mewtwo", "Normal");
        Pokedex pokedex = new Pokedex();

        // act
        pokedex.visualizarPokemon(psyduck);
        pokedex.visualizarPokemon(pikachu1);
        pokedex.visualizarPokemon(pikachu2);
        pokedex.visualizarPokemon(mewto);
        pokedex.visualizarPokemon(charizard);
        pokedex.visualizarPokemon(pikachu3);

        double cantPokemonsVistos = pokedex.getCantPokemonsVistos();

        assertEquals(4.0, cantPokemonsVistos);
    }
}
