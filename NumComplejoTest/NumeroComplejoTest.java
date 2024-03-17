import NumerosComplejos.NumeroComplejo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroComplejoTest {

    @Test
    public void testNumeroComplejoConParteReal3YParteImg4DeberiaCrearseConExitoYTenerParteReal3YParteImg4(){
        //Arrange
        NumeroComplejo numComplejo = new NumeroComplejo(3.0, 4.0);

        //Act
        double parteReal = numComplejo.getPartReal();
        double parteImg = numComplejo.getPartImg();

        //Assert
        assertEquals(3.0, parteReal);
        assertEquals(4.0, parteImg);
    }

    @Test
    public void testNumeroComplejoConParteReal5YParteImg7DeberiaCrearseConExitoYTenerParteReal5YParteImg7(){
        //Arrange
        NumeroComplejo numComplejo = new NumeroComplejo(5.0, 7.0);

        //Act
        double parteReal = numComplejo.getPartReal();
        double parteImg = numComplejo.getPartImg();

        //Assert
        assertEquals(5.0, parteReal);
        assertEquals(7.0, parteImg);
    }
    @Test
    public void testNumeroComplejoConParteReal3YParteImg3SeSumaConOtroComplejoDeParteReal2ParteImg4DeberiaDarUnNumeroComplejoParteReal5ParteImg7(){
        //Arrange  incializamos creamos las objetos aca
        NumeroComplejo numComplejo1 = new NumeroComplejo(3.0, 3.0);
        NumeroComplejo numComplejo2 = new NumeroComplejo(2.0, 4.0);

        //Act invocamos a los metodos
        NumeroComplejo numComplejo3 = numComplejo1.sumar(numComplejo2);

        //Assert  y un poquito de act
        assertEquals(5.0, numComplejo3.getPartReal());
        assertEquals(7.0, numComplejo3.getPartImg());
    }

    @Test
    public void testNumeroComplejoConParteReal3YParteImg4ElModuloDeberiaDar5(){
        //Arrange  incializamos creamos las objetos aca
        NumeroComplejo numComplejo1 = new NumeroComplejo(3.0, 4.0);

        //Act invocamos a los metodos
        double modulo = numComplejo1.getModulo();

        //Assert  y un poquito de act
        assertEquals(5.0, modulo, 0.01);
    }

    @Test
    public void testNumeroComplejoConParteReal10YParteImg5ElModuloDeberiaDar5(){
        //Arrange  incializamos creamos las objetos aca
        NumeroComplejo numComplejo1 = new NumeroComplejo(10.0, 5.0);

        //Act invocamos a los metodos
        double modulo = numComplejo1.getModulo();

        //Assert  y un poquito de act
        assertEquals(11.180, modulo, 0.01);
    }

    @Test
    public void testNumeroComplejoConParteReal10YParteImg5LoMultiplicamosPorUnFactorDe2DeberiaSerAhoraParteReal20YParteImg10(){
        //Arrange  incializamos creamos las objetos aca
        NumeroComplejo numComplejo1 = new NumeroComplejo(10.0, 5.0);

        //Act invocamos a los metodos
        numComplejo1.incrementar(2.0);

        //Assert  y un poquito de act
        assertEquals(20.0, numComplejo1.getPartReal());
        assertEquals(10.0, numComplejo1.getPartImg());
    }

    @Test
    public void testNumeroComplejoConParteReal3YParteImg4LoMultiplicamosPorUnFactorDe2DeberiaSerAhoraParteReal6YParteImg8(){
        //Arrange  incializamos creamos las objetos aca
        NumeroComplejo numComplejo1 = new NumeroComplejo(3.0, 8.0);

        //Act invocamos a los metodos
        numComplejo1.incrementar(3.0);

        //Assert  y un poquito de act
        assertEquals(9.0, numComplejo1.getPartReal());
        assertEquals(24.0, numComplejo1.getPartImg());
    }


}
