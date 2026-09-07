package com.example.calculadora;

import java.util.ArrayList;

public class Historial {
     private  ArrayList<Operacion> operaciones;

    public Historial(){

   this.operaciones = new ArrayList<>();
}
public  ArrayList <Operacion> obtenerHistorial(){
    
     return  operaciones;
}

public void agregarOperacion(Operacion operacion){
    operaciones.add(operacion);
}

}
