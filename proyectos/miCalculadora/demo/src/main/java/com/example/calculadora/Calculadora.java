package com.example.calculadora;

public class Calculadora {
    

    public Operacion sumar (double operandoA, double operandoB){
         double suma = operandoA + operandoB;


        return new Operacion("suma", operandoA, operandoB, suma);
    }
    public Operacion restar (double operandoA, double operandoB){
        double resta = operandoA - operandoB;

        return new Operacion("resta", operandoA, operandoB, resta);
    }

    public Operacion multiplicar (double operandoA, double operandoB){
        double multiplicacion = operandoA * operandoB;

        return new Operacion("multiplicacion", operandoA, operandoB, multiplicacion);
    }

    public Operacion dividir(double operandoA, double operandoB){
         if (operandoB == 0){
            throw new ArithmeticException("División por cero no permitida");
        }
        double division = operandoA / operandoB;
        
        return new Operacion("division", operandoA, operandoB, division);
    }


}
