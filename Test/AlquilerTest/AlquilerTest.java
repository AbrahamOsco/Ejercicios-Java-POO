package AlquilerTest;

import EjercicioVehiculos.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlquilerTest {
    @Test
    public void testClienteAlquilaUnBMWCon5PlazasModelo2018DosDiasDeberiaCobrarleLoCorrecto(){
        //Arrange
        Vehiculo coche = new Coche(2, 5, new BMW());
        ((Coche) coche).presentar();
        //Act
        double precioAlquiler =  coche.alquilar();

        // Assert
        // 500  * 2 + 5 * 150 (premium)
        assertEquals(1750.0, precioAlquiler);
    }

    @Test
    public void testClienteAlquilaUnAutoViejoCategoriaViejoCon8PlazasModelo2018DTresDiasDeberiaCobrarleLoCorrecto(){
        //Arrange
        Vehiculo coche = new Coche(3, 8, new Viejo());

        //Act
        double precioAlquiler =  coche.alquilar();

        // Assert
        // 500  * 3
        assertEquals(1500, precioAlquiler);
    }

    @Test
    public void testClienteAlquilaUnCamionConPMADe1000DuranteUnos10DiasDeberiaCobrarleLoCorrecto(){
        //Arrange
        Vehiculo camion = new Camion(10, 1000.0);
        ( (Camion) camion).presentarKg();
        //Act
        double precioAlquiler =  camion.alquilar();

        // Assert
        // 500 * 10 + 300* 1000 = 305000
        assertEquals(305000, precioAlquiler);
    }

}
