package TestTP2;

import Resueltos.TP2AlgoFix.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlgoFixTest {

    @Test
    public void testSeDebeObtenerElMejorPresupuestoParaPintarConPincel(){
        //Arrange
        AlgoFix algoFix = new AlgoFix();

        // Con la herramienta pincel se tarda 3 horas en pintar un metro cuadrado
        // y cada metro cuadrado tiene 4 libros de pintura

        //Act
        algoFix.registrarPintorDePincel("Ricardo Yoku", 500);
        // Colocamos el nombre del pintor que usa Pincel y el precio que cobra por hora.

        algoFix.registrarPintorDePincel("Ana Sandy", 800);
        // Colocamos el nombre del pintor que usa Pincel y el precio que cobra por hora.

        algoFix.registrarPintorDeRodillo("Kelvin Contreras", 600);
        // Colocamos el nombre del pintor que usa Rodillo y el precio que cobra por hora.


        var unaPintura = algoFix.crearPintura("Azul", 200); // creamos una pintura de color Azul que cuesta 200 el litro.
        var presupuesto = algoFix.presupuestoMasBaratoConPincel(5, unaPintura); // 5 metros cuadrados y usando la pintura azul.
        // es evidente que tanto unaPintura y presupuesto deben ser objetos claramente y deben eliminar el "var"

        // 5 metros cuadrado x 3 hora/metroCuadrado * 500 pesos/hora + 5 metrosCuadrados * 4 LitroPintura/metroCuadrado * 200 Pesos/LitroPintura
        // hacemos el calculo del precio y ademas tenemos que el que cobra mas barato es Ricardo Yoku  es evidente tiene menor precio hora.
        double precioEsperado = (5 * 3 * 500) + (5*4*200);
        String nombreEsperado  = "Ricardo Yoku";

        //Assert
        assertEquals(precioEsperado, presupuesto.getValor());
        assertEquals(nombreEsperado, presupuesto.getResponsable());
    }

    @Test
    public void testSeDebeObtenerElMejorPresupuestoParaPintarConRodillo(){
        //Arrange
        AlgoFix algoFix = new AlgoFix();
        // Con la herrmienta Rodillo se tarda 2 horas en pintar un metro cuadrado
        // y cada metro cuadrado tiene 6 libros de pintura

        //Act
        algoFix.registrarPintorDePincel("Angie Martinez", 100);
        // Colocamos el nombre del pintor que usa Pincel y el precio que cobra por hora.

        algoFix.registrarPintorDeRodillo("Sandy Mendez", 700);
        // Colocamos el nombre del pintor que usa Pincel y el precio que cobra por hora.

        algoFix.registrarPintorDeRodillo("Ross Contreras", 1000);
        // Colocamos el nombre del pintor que usa Rodillo y el precio que cobra por hora.


        var unaPintura = algoFix.crearPintura("Blanca", 400); // creamos una pintura de color Azul que cuesta 200 el litro.
        var presupuesto = algoFix.presupuestoMasBaratoConRodillo(7, unaPintura); // 5 metros cuadrados y usando la pintura azul.
        // es evidente que tanto unaPintura y presupuesto deben ser objetos claramente y deben eliminar el "var"

        // 7 metros cuadrado x 2 hora/metroCuadrado * 700 pesos/hora + 7 metrosCuadrados * 6 LitroPintura/metroCuadrado * 400 Pesos/LitroPintura
        // hacemos el calculo del precio y ademas tenemos que el que cobra mas barato es Sandy Mendez  es evidente tiene menor precio hora.
        double precioEsperado = (7 * 2 * 700) + (7 * 6 * 400);
        String nombreEsperado  = "Sandy Mendez";

        //Assert
        assertEquals(precioEsperado, presupuesto.getValor());
        assertEquals(nombreEsperado, presupuesto.getResponsable());
    }

    @Test
    public void testSeDebeObtenerElMejorPresupuestoParaPintarConRodilloHayEmpate(){
        //Arrange
        AlgoFix algoFix = new AlgoFix();
        // Con la herrmienta Rodillo se tarda 2 horas en pintar un metro cuadrado
        // y cada metro cuadrado tiene 6 libros de pintura

        //Act
        algoFix.registrarPintorDePincel("Angie Martinez", 100);
        // Colocamos el nombre del pintor que usa Pincel y el precio que cobra por hora.

        algoFix.registrarPintorDeRodillo("Marco Tantrum", 1000);
        // Colocamos el nombre del pintor que usa Pincel y el precio que cobra por hora.

        algoFix.registrarPintorDeRodillo("Davico Juan", 1000);
        // Colocamos el nombre del pintor que usa Rodillo y el precio que cobra por hora.


        var unaPintura = algoFix.crearPintura("Negro", 700); // creamos una pintura de color Azul que cuesta 200 el litro.
        var presupuesto = algoFix.presupuestoMasBaratoConRodillo(4, unaPintura); // 5 metros cuadrados y usando la pintura azul.
        // es evidente que tanto unaPintura y presupuesto deben ser objetos claramente y deben eliminar el "var"

        // 4 metros cuadrado x 2 hora/metroCuadrado * 1000 pesos/hora + 4 metrosCuadrados * 6 LitroPintura/metroCuadrado * 700 Pesos/LitroPintura
        // hacemos el calculo del precio y ademas tenemos que el que cobra mas barato es Sandy Mendez  es evidente tiene menor precio hora.

        // aca tenemos el empate ambos cobran lo mismo, devolvemos el primer minimo que encontramos que es de Marco Tantrum
        double precioEsperado = (4 * 2 * 1000) + (4 * 6 * 700);
        String nombreEsperado  = "Marco Tantrum";

        //Assert
        assertEquals(precioEsperado, presupuesto.getValor());
        assertEquals(nombreEsperado, presupuesto.getResponsable());
    }

    @Test
    public void testSePideCalculaElMejorPresupuestoParaPintarConPincelPeroNoHayPintoresConPincelDeberiaLanzarExcepcion(){
        //Arrange
        AlgoFix algoFix = new AlgoFix();

        //Act
        algoFix.registrarPintorDeRodillo("Nancy Prieto", 100);

        var unaPintura = algoFix.crearPintura("Marron", 900); // creamos una pintura de color Azul que cuesta 200 el litro.

        assertThrows( NoExistenPintoresConPincelError.class, () -> {
            algoFix.presupuestoMasBaratoConPincel(5, unaPintura);
        } );
    }

    @Test
    public void testSePideCalculaElMejorPresupuestoParaPintarConRodilloPeroNoHayPintoresConRodilloDeberiaLanzarExcepcion(){
        //Arrange
        AlgoFix algoFix = new AlgoFix();

        //Act
        algoFix.registrarPintorDePincel("Anthony Perez", 900);

        var unaPintura = algoFix.crearPintura("Marron", 900); // creamos una pintura de color Azul que cuesta 200 el litro.

        assertThrows( NoExistenPintoresConRodilloError.class, () -> {
            algoFix.presupuestoMasBaratoConRodillo(5, unaPintura);
        } );
    }

    @Test
    public void testSeDebeObtenerElMejorPresupuestoParaPintarConRodilloDescuentoDel50PorcientoAlPintarMasOIgualQue100MetrosCuadrados(){
        //Arrange
        AlgoFix algoFix = new AlgoFix();
        // Con la herrmienta Rodillo se tarda 2 horas en pintar un metro cuadrado
        // y cada metro cuadrado tiene 6 libros de pintura

        //Act
        algoFix.registrarPintorDePincel("Angie Martinez", 100);
        // Colocamos el nombre del pintor que usa Pincel y el precio que cobra por hora.

        algoFix.registrarPintorDeRodillo("Sandy Mendez", 700);
        // Colocamos el nombre del pintor que usa Pincel y el precio que cobra por hora.

        algoFix.registrarPintorDeRodillo("Ross Contreras", 1000);
        // Colocamos el nombre del pintor que usa Rodillo y el precio que cobra por hora.

        var unaPintura = algoFix.crearPintura("Blanca", 400); // creamos una pintura de color Azul que cuesta 200 el litro.
        var presupuesto = algoFix.presupuestoMasBaratoConRodillo(100, unaPintura); // 5 metros cuadrados y usando la pintura azul.
        // es evidente que tanto unaPintura y presupuesto deben ser objetos claramente y deben eliminar el "var"

        // 7 metros cuadrado x 2 hora/metroCuadrado * 700 pesos/hora + 7 metrosCuadrados * 6 LitroPintura/metroCuadrado * 400 Pesos/LitroPintura
        // hacemos el calculo del precio y ademas tenemos que el que cobra mas barato es Sandy Mendez  es evidente tiene menor precio hora.

        // Si la cantidad de metros cuadrados es >= 100 m2 entonces hacemos el descuento del 50% al presupuesto final.
        double precioEsperado = 0.5*( (100 * 2 * 700) + (100 * 6 * 400) );
        String nombreEsperado  = "Sandy Mendez";

        //Assert
        assertEquals(precioEsperado, presupuesto.getValor());
        assertEquals(nombreEsperado, presupuesto.getResponsable());
    }


    @Test
    public void testSeDebeObtenerElMejorPresupuestoParaPintarConPincelDescuentoDel50PorcientoPorPintarMasOIgualQue100MetrosCuadrados(){
        //Arrange
        AlgoFix algoFix = new AlgoFix();

        // Con la herramienta pincel se tarda 3 horas en pintar un metro cuadrado
        // y cada metro cuadrado tiene 4 libros de pintura

        //Act
        algoFix.registrarPintorDePincel("Ricardo Yoku", 500);
        // Colocamos el nombre del pintor que usa Pincel y el precio que cobra por hora.

        algoFix.registrarPintorDePincel("Ana Sandy", 800);
        // Colocamos el nombre del pintor que usa Pincel y el precio que cobra por hora.

        algoFix.registrarPintorDeRodillo("Kelvin Contreras", 600);
        // Colocamos el nombre del pintor que usa Rodillo y el precio que cobra por hora.


        var unaPintura = algoFix.crearPintura("Azul", 200); // creamos una pintura de color Azul que cuesta 200 el litro.
        var presupuesto = algoFix.presupuestoMasBaratoConPincel(105, unaPintura); // 5 metros cuadrados y usando la pintura azul.
        // es evidente que tanto unaPintura y presupuesto deben ser objetos claramente y deben eliminar el "var"

        // 5 metros cuadrado x 3 hora/metroCuadrado * 500 pesos/hora + 5 metrosCuadrados * 4 LitroPintura/metroCuadrado * 200 Pesos/LitroPintura
        // hacemos el calculo del precio y ademas tenemos que el que cobra mas barato es Ricardo Yoku  es evidente tiene menor precio hora.

        // Si la cantidad de metros cuadrados es >= 100 m2 entonces hacemos el descuento del 50% al presupuesto final.
        double precioEsperado = 0.5*((105 * 3 * 500) + (105*4*200));
        String nombreEsperado  = "Ricardo Yoku";

        //Assert
        assertEquals(precioEsperado, presupuesto.getValor());
        assertEquals(nombreEsperado, presupuesto.getResponsable());
    }
}

