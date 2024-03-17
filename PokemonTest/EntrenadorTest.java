import EntrenadorPokemon.Entrenador;
import EntrenadorPokemon.Pokedex;
import EntrenadorPokemon.Pokemon;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntrenadorTest {

    @Test
    public void testEntrenadorVisualizaAPikachuSnorlaxYCharizardLaCantidadDePokemonesVistosDebeSer3(){
        Pokemon pikachu = new Pokemon("Pikachu", "Electrico");
        Pokemon charizard = new Pokemon("Charizard", "Fuego");
        Pokemon snorlax = new Pokemon("Snorlax", "Normal");
        Pokemon snorlax2 = new Pokemon("Snorlax", "Normal");
        Entrenador entrenador = new Entrenador("Ricardo David");

        entrenador.visualizarPokemon(snorlax);
        entrenador.visualizarPokemon(pikachu);
        entrenador.visualizarPokemon(snorlax2);
        entrenador.visualizarPokemon(charizard);
        double cantPokemonsVistos = entrenador.getCantPokemonsVistos();

        assertEquals(3.0, cantPokemonsVistos);
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
