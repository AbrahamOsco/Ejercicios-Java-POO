package PersonaTest;

import EjercicioSuperPoderes.Agua;
import EjercicioSuperPoderes.Fuego;
import EjercicioSuperPoderes.Persona;
import EjercicioSuperPoderes.Rayo;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    @Test
    public void testLaPersonaRicardoJoseDeElementoFuegoConPunto650DeFuerzaYPunto350DeAgilidadDeberiaHacerUnDañoDe23Puntos(){
        Persona ricardo = new Persona("Ricardo Jose", new Fuego(), 0.650, 0.350);
        double danioHecho = ricardo.atacar();
        //  (30* 0,650 + 10* 0,35) = 23
        assertEquals(23, danioHecho);
    }

    @Test
    public void testLaPersonaRicardoJoseDeElementoFuegoConPunto750DeFuerzaYPunto350DeAgilidadDeberiaHacerUnDañoDe23Puntos(){
        Persona ricardo = new Persona("Ricardo Jose", new Fuego(), 0.750, 0.350);
        double danioHecho = ricardo.atacar();
        //  (30* 0,750 + 10* 0,35) = 26
        assertEquals(26, danioHecho);
    }

    @Test
    public void testLaPersonaAnthonyGonzaloDeElementoAguaConPunto513DeFuerzaYPunto512DeAgilidadDeberiaHacerUnDañoDe17Con94Puntos(){
        Persona anthony = new Persona("Anthony gonzales", new Agua(), 0.513, 0.512);
        double danioHecho = anthony.atacar();
        //  ( 20 * 0,513 + 15 * 0,512 = 17,94)
        assertEquals(17.94, danioHecho,0.1);
    }

    @Test
    public void testLaPersonaAbrahamDeElementoAguaConPunto710DeFuerzaYPunto700DeAgilidadDeberiaHacerUnDañoDe26Con87Puntos(){
        Persona abraham = new Persona("Anthony gonzales", new Rayo(), 0.710, 0.700);
        double danioHecho = abraham.atacar();
        //   ( 27 * 0,710 + 11* 0,70 = 26,87)
        assertEquals(26.87, danioHecho,0.1);
    }
}
