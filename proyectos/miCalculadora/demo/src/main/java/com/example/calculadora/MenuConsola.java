package com.example.calculadora;
import java.util.Scanner;

public class MenuConsola {
    private Calculadora calculadora;
    private Historial historial;
    private Scanner input;

    public MenuConsola(Calculadora calculadora, Historial historial){
    this.calculadora = calculadora;
    this.historial = historial;
    this.input = new Scanner(System.in);
    }
    public void iniciar (){
        boolean salir = false;
        while (salir == false){
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. ver historial ");
            System.out.println("6. salir");
            
          int numInsertado =  input.nextInt();
            input.nextLine();

            switch (numInsertado) {
                case 1:{
                 System.out.print("Primer número: "); double a = input.nextDouble(); input.nextLine();
                 System.out.print("segundo número: "); double b = input.nextDouble(); input.nextLine();
              Operacion resultadoDeSuma = calculadora.sumar(a, b);
              historial.agregarOperacion(resultadoDeSuma);
                System.out.println("resultado = " + resultadoDeSuma.getResultado());
                }
                 break;
            case 2:{ 
                 System.out.print("Primer número: "); double a = input.nextDouble(); input.nextLine();
                 System.out.print("segundo número: "); double b = input.nextDouble(); input.nextLine();
                 Operacion resultado = calculadora.restar(a, b);
                 historial.agregarOperacion(resultado);
                 System.out.println("resultado = " + resultado.getResultado());
            }
                break;
            case 3: 
           { 
                 System.out.print("Primer número: "); double a = input.nextDouble(); input.nextLine();
                 System.out.print("segundo número: "); double b = input.nextDouble(); input.nextLine();
                 Operacion resultado = calculadora.multiplicar(a, b);
                 historial.agregarOperacion(resultado);
                 System.out.println("resultado = " + resultado.getResultado());
            }
                break;
            case 4:
               { 
                 System.out.print("Primer número: "); double a = input.nextDouble(); input.nextLine();
                 System.out.print("segundo número: "); double b = input.nextDouble(); input.nextLine();
                 Operacion resultado = calculadora.dividir(a, b);
                 historial.agregarOperacion(resultado);
                 System.out.println("resultado = " + resultado.getResultado());
            }
                break;  
            case 5: 
         for (int i = 0; i < historial.obtenerHistorial().size(); i++ ){
            System.out.println(historial.obtenerHistorial().get(i).toString());
         }
            break;

                case 6: 
                salir = true;


                    break;
                

                     default: 
                     System.out.println("invalid entry");
            }
           }

    }


}
