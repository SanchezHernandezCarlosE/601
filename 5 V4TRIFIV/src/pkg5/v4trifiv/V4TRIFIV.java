package pkg5.v4trifiv;

import funciones.funcionMultiple;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V4TRIFIV {
    public static void main(String[] args) throws IOException {
      //Declaracion de variables
        BufferedReader bufEntrada=new BufferedReader(new InputStreamReader(System.in));
        int numero;
      //Creo objeto
        funcionMultiple mult=new funcionMultiple();
      //Entrada de datos
        System.out.println("Dame el numero");
        numero= Integer.parseInt(bufEntrada.readLine());
        
      //Salida de datos
        System.out.println(mult.retornaMultiplo(numero));
    }
    
}
