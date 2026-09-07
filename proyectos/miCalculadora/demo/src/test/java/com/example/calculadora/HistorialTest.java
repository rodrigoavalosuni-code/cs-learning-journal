package com.example.calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HistorialTest {
    @Test
    void deberiaMostrarHistorial(){
    Historial historial = new Historial();
    assertEquals( 0, historial.obtenerHistorial().size());
    }

    @Test
    void deberiaAgregarUnaOperacion(){
        Historial miHistorial = new Historial();
        Operacion miOperacion = new Operacion("suma", 2.0, 3.0, 5.0);
        miHistorial.agregarOperacion(miOperacion);
        assertEquals(1, miHistorial.obtenerHistorial().size());
    }
  @Test
  void deberiaSeguirOrden(){
    Historial miHistorial = new Historial();
    Operacion miOperacion = new Operacion("suma", 2.0, 3.0, 5.0);
    Operacion miOperacion2 = new Operacion("resta", 2.0, 3.0, -1.0);
    miHistorial.agregarOperacion(miOperacion);
    miHistorial.agregarOperacion(miOperacion2);
    ArrayList<Operacion> historial = miHistorial.obtenerHistorial();
    assertEquals(2, historial.size());
    assertEquals("suma", historial.get(0).getTipo());
    assertEquals("resta", historial.get(1).getTipo());
    
  }  
}
