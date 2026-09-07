package com.example.calculadora;

public class Operacion {
    private String tipo;
    private double operandoA;
    private double operandoB;
    private double resultado;

    public  Operacion(String tipo, double operandoA, double operandoB, double resultado) {
       this.tipo = tipo;
       this.operandoA = operandoA;
       this.operandoB = operandoB;
       this.resultado = resultado;
    
    }
    private String obtenerSimbolo() {
    if (tipo.equals("suma")) {
        return " + ";
    } else if (tipo.equals("resta")) {
        return " - ";
    }
     else if (tipo.equals("multiplicacion")){
         return " * ";
     }
   
    else {return " / ";}
    
}
    
    public String getTipo (){
        return tipo;
    }
    public double getOperandoA (){
        return operandoA;
    }
    public double getOperandoB (){
        return operandoB;
    
    }
    public double getResultado(){
        return resultado;
    }
    @Override 
    public String toString(){
       return tipo + " : " +  operandoA + obtenerSimbolo() + operandoB + " = " + resultado;
    }
}