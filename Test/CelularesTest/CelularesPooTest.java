package CelularesTest;

import EjercicioCelulares.Iphone;
import EjercicioCelulares.MotoG;
import EjercicioCelulares.MotoGConBateriaApagadaNoPuedeLlamarError;
import org.junit.Test; // solo usar estos 2 y el de abjao
import static org.junit.jupiter.api.Assertions.*; // esta linea me habilita a hacer un aassertDoesNotThrow

public class CelularesPooTest {
    @Test
    public void paolaQueUsaIphoneLlamaAMarianaQueUsaMotoGDurante3MinutosDeberianRestarleLaDurabilidadDeLaBateriaCorrectaACadaUna(){
        //Arrange
        Iphone paola = new Iphone(); // un objeto iphone cuyo nombre es paola
        MotoG mariana = new MotoG();  // un objeto MotoG cuyo nombre es  mariana

        //Act  acto ->
        paola.llamar(mariana, 3);
        double cantBatPaola = paola.getCantBateria(); //  5 - 3/100 = 4.97
        double cantBatMariana = mariana.getCantBateria(); // 5 - 0.25 = 4.75

        //Assert
        assertEquals(4.75, cantBatMariana); // alt + enter
        assertEquals(4.97, cantBatPaola); // alt + enter
    }

    @Test
    public void paolaQueUsaIphoneLlamaAMarianaQueUsaMotoGDurante5MinutosDeberianRestarleLaDurabilidadDeLaBateriaCorrectaACadaUna(){
        //Arrange
        Iphone paola = new Iphone();
        MotoG mariana = new MotoG();

        //Act  acto ->
        paola.llamar(mariana, 5);
        double cantBatPaola = paola.getCantBateria(); //  5 - 5/100 = 4.95
        double cantBatMariana = mariana.getCantBateria(); // 5 - 0.25 = 4.75

        //Assert
        assertEquals(4.75, cantBatMariana, 0.001); // alt + enter
        assertEquals(4.95, cantBatPaola, 0.001); // alt + enter
    }

    @Test
    public void marianaQueUsaMotoGLlamaAPaolaQueUsaIphoneDurante7MinutosDeberianRestarleLaDurabilidadDeLaBateriaCorrectaACadaUna(){
        //Arrange
        Iphone paola = new Iphone();
        MotoG mariana = new MotoG();

        //Act  acto ->
        mariana.llamar(paola, 7);
        double cantBatPaola = paola.getCantBateria(); //  5 - 7/100 = 4.93
        double cantBatMariana = mariana.getCantBateria(); // 5 - 0.25 = 4.75

        //Assert
        assertEquals(4.75, cantBatMariana, 0.001); // alt + enter
        assertEquals(4.93, cantBatPaola, 0.001); // alt + enter
    }

    @Test
    public void marianaQueUsaMotoGLlamaAPaolaQueUsaIphoneDurante1Minutos20VecesMarianDeberiaTenerElCelularApagado(){
        //Arrange
        Iphone paola = new Iphone();
        MotoG mariana = new MotoG();

        //Act  acto ->
        for(int i = 0; i < 20; i++){
            mariana.llamar(paola, 1); // se repita 20 veces.
        }

        //Assert
        assertTrue(mariana.estaApagado());
    }

    @Test
    public void marianaQueUsaMotoGLlamaAPaolaQueUsaIphoneDurante1Minutos20VecesMarianaLuegoIntentaLlamarAPaolaDeberiaLanzarExcepcion(){
        //Arrange
        Iphone paola = new Iphone();
        MotoG mariana = new MotoG();

        //Act  acto ->
        for(int i = 0; i < 20; i++){
            mariana.llamar(paola, 1); // se repita 20 veces.
        }

        //Assert
        assertThrows( MotoGConBateriaApagadaNoPuedeLlamarError.class, () -> {
            mariana.llamar(paola,1);
        } );
    }
    @Test
    public void marianaQueUsaMotoGLlamaAPaolaQueUsaIphoneDurante1Minutos19VecesMarianaPuedeLlamar1VezMasAPaolaYNoDeberiaLanzarExcepcion(){
        //Arrange
        Iphone paola = new Iphone();
        MotoG mariana = new MotoG();

        //Act  acto ->
        for(int i = 0; i < 19; i++){
            mariana.llamar(paola, 1); // se repita 20 veces.
        }

        //Assert
        assertDoesNotThrow( () -> {
            mariana.llamar(paola, 1);
        } );

    }

    @Test
    public void paolaQueUsaIphoneLlamaAMarianQueUsaMotorolaDurante499MinutosYLuegoLeLlama1MinutoMasNoDeberiaLanzarExcepcion(){
        //Arrange
        Iphone paola = new Iphone();
        MotoG mariana = new MotoG();

        //Act  acto ->
        paola.llamar(mariana, 499);

        //Assert
        assertDoesNotThrow( () -> {
            paola.llamar(mariana, 1);
        } );
    }

}
