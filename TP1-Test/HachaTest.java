/*
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.*;

public class HachaTest {

    @Test
    public void testHachaSiSeUsa5VecesDeberiaLanzarExcepcionAlUsarlaConDurabilidaNegativa(){
        //Arrange
        Hacha unaHacha = new Hacha();

        //Act
        unaHacha.usar(); // durabilidad 9
        unaHacha.usar(); // durabilidad 7
        unaHacha.usar(); // durabilidad 4
        unaHacha.usar(); // durabilidad 0

        // Assert
        assertThrows(NoSePuedeUsarLaHerramientaDurabilidadNegativaError.class, () -> {
            unaHacha.usar(); // durabilidad es cero si usamos la herramienta lanzamos la excpecion de arriba
        } );
    }

    @Test
    public void testHachaSiUsamos3VecesYLuegoUnaCuartaVezNoDeberiaLanzarExcpecion(){
        //Arrange
        Hacha unaHacha = new Hacha();

        //Act
        unaHacha.usar(); // durabilidad 9
        unaHacha.usar(); // durabilidad 7
        unaHacha.usar(); // durabilidad 4

        // Assert
        assertDoesNotThrow( () -> {
            unaHacha.usar(); //durabilidad 0 todo ok
        });
    }
}
*/

