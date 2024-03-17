import EntrenadorPokemon.Pokemon;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonTest {
    @Test
    public void PokemonPikachuDeTipoElectricoDeberiaTenerDeNombrePikachu(){
        // arrange
        Pokemon pikachu = new Pokemon("Pikachu", "Electrico");

        // act + assert
        assertEquals("Pikachu", pikachu.getNombre());
    }

    @Test
    public void PokemonSnorlaxDeTipoNormalDeberiaTenerDeNombreSnorlax(){
        // arrange
        Pokemon snorlax = new Pokemon("Snorlax", "Normal");

        // act + assert
        assertEquals("Snorlax", snorlax.getNombre());
    }
}
