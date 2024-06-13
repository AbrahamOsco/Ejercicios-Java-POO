package AlgoMailTest;

import EjercicioAlgoMail.AutenticacionSimple;
import EjercicioAlgoMail.Usuario;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlgoMailTest {

    @Test
    public void testUsuarioIngresaConSuNombreDeUsuarioYPasswordCorrectosDeberiaIniciarSeccion(){
        Usuario usuario = new Usuario("Ricardo123", "abcd123");
        AutenticacionSimple autenticacionSimple = new AutenticacionSimple();
        //boolean inicioSeccion =  autenticacionSimple.iniciarSeccion(usuario);
        boolean inicioSeccion =  usuario.iniciarSeccion(autenticacionSimple);

        assertTrue(inicioSeccion);
    }
    @Test
    public void testUsuarioIngresaConSuNombreDeUsuarioCorrectoYPasswordInCorrectoNoDeberiaIniciarSeccion(){
        Usuario usuario = new Usuario("Ricardo123", "manzana1234");
        AutenticacionSimple autenticacionSimple = new AutenticacionSimple();
        //boolean inicioSeccion =  autenticacionSimple.iniciarSeccion(usuario);
        boolean inicioSeccion =  usuario.iniciarSeccion(autenticacionSimple);
        assertFalse(inicioSeccion);
    }


    @Test
    public void testUsuarioIngresaConSuNombreDeUsuarioYCodigoDeSeguridadDeberiaIniciarSeccion(){
        Usuario usuario = new Usuario("Ricardo123", "abcd123", "123456789");
        //AutenticacionSimple autenticacionSimple = new AutenticacionSimple();
        // MultiFactor multiFactor = new MultiFactorCodSeguridad();
        //boolean inicioSeccion =  autenticacionSimple.iniciarSeccion(usuario);
        // boolean inicioSeccion =  usuario.iniciarSeccion(multiFactor);
        // assertTrue(inicioSeccion);
    }



}
