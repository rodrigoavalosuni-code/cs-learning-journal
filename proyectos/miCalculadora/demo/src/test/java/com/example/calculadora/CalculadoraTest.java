package com.example.calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest{
    @Test
    void deberiaSumar(){
        Calculadora miCalculadora = new Calculadora();
        Operacion suma = miCalculadora.sumar(2.0, 3.0);
        assertEquals("suma", suma.getTipo());
        assertEquals(2.0, suma.getOperandoA(), 0.001);
        assertEquals(3.0, suma.getOperandoB(), 0.001);
        assertEquals(5.0, suma.getResultado(), 0.001);
    }

    @Test
     void deberiaRestar(){
         Calculadora miCalculadora = new Calculadora();
        Operacion resta = miCalculadora.restar(2.0, 3.0);
        assertEquals("resta", resta.getTipo());
        assertEquals(2.0, resta.getOperandoA(), 0.001);
        assertEquals(3.0, resta.getOperandoB(), 0.001);
        assertEquals( -1.0, resta.getResultado(), 0.001);

     }



     @Test
     void deberiaMultiplicar(){
         Calculadora miCalculadora = new Calculadora();
        Operacion multiplicar = miCalculadora.multiplicar(2.0, 3.0);
        assertEquals("multiplicacion", multiplicar.getTipo());
        assertEquals(2.0, multiplicar.getOperandoA(), 0.001);
        assertEquals(3.0, multiplicar.getOperandoB(), 0.001);
        assertEquals( 6.0, multiplicar.getResultado(), 0.001);

     }

     @Test
     void deberiaDividir(){
         Calculadora miCalculadora = new Calculadora();
        Operacion dividir = miCalculadora.dividir(2.0, 3.0);
        assertEquals("division", dividir.getTipo());
        assertEquals(2.0, dividir.getOperandoA(), 0.001);
        assertEquals(3.0, dividir.getOperandoB(), 0.001);
        assertEquals( 0.6666, dividir.getResultado(), 0.001);

     }


     @Test
     void deberiaMostrarErrorConCero(){
        Calculadora miCalculadora = new Calculadora();
      assertThrows (ArithmeticException.class, () ->  {
        miCalculadora.dividir(0, 0);

      });
        
    }
     


     }
