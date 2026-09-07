package com.example.calculadora;

import java.beans.EventHandler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculadoraGUI extends Application {


     private Calculadora calculadora = new Calculadora();
    private Historial historial = new Historial();
    private double primerOperando;    
    private double segundoOperando;    
    private String operacion;        
    private TextField texto;
    private Operacion resultado;

    @Override
    public void start(Stage primaryStage) {
        // 1. Crea un VBox con espaciado de 10 pixeles
        VBox root = new VBox(40);
        root.setFillWidth(false);
        
        
        
        // 2. Crea un Label con texto "Calculadora"
        Label titulo = new Label("calculadora");
        
        // 3. Agrega el Label al VBox
        root.getChildren().add(titulo);

        texto = new TextField();
        texto.setEditable(false);
        root.getChildren().add(texto);
        texto.setPrefSize(300, 50);

        GridPane cuadricula = new GridPane();
        String [][] textoBotones = {
             {"7", "8", "9", "/"},
            {"4", "5", "6", "*"},
            {"1", "2", "3", "-"},
            {"0", "C", "=", "+"}
        };
    
        
        for (int fila  = 0; fila <textoBotones.length; fila++ ){
            for(int col = 0; col < textoBotones[fila].length; col ++){
                Button boton = new Button(textoBotones  [fila] [col]);
                
              
                boton.setOnAction(e -> {if(boton.getText().matches("[0-9]")){
                    texto.appendText(boton.getText());
                }
                else if (boton.getText().equalsIgnoreCase("c")){
                    texto.clear();
                     operacion = boton.getText();
                } else if(boton.getText().equals("+") || boton.getText().equals("-") || boton.getText().equals("*") || boton.getText().equals("/")){
                    primerOperando = Double.parseDouble(texto.getText());
                    operacion = boton.getText();
                    texto.clear();
                }else if (boton.getText().equals("=")){
                     segundoOperando = Double.parseDouble(texto.getText());
                    if(operacion.equals("+")){
                      resultado =  calculadora.sumar(primerOperando, segundoOperando );
                    }
                    else if (operacion.equals("-")){
                      resultado =  calculadora.restar(primerOperando, segundoOperando);
                        
                    }
                    else if (operacion.equals("*")){
                      resultado = calculadora.multiplicar(primerOperando, segundoOperando);
                    }
                    else resultado = calculadora.dividir(primerOperando, segundoOperando);
                    texto.clear();
                   String result = primerOperando + operacion + segundoOperando + "=" + String.valueOf(resultado.getResultado());
                   texto.appendText(result);
                }
                }
                   );
                   

                boton.setPrefSize(75, 50);
                cuadricula.add(boton, col, fila);

            }
        }


       
        Scene scene = new Scene(root, 300, 400);
        
        // 5. Configura el Stage
        primaryStage.setTitle("calculadora");
        root.getChildren().add(cuadricula);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}