package excepcion1;

import javax.swing.JOptionPane;

public class Excepcion1 {

    public static void main(String[] args) {
      int x,y;
       
        try{
              x= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero 1","Solicito datos",3));
        }
             catch(NumberFormatException n){
                 System.out.println(n.getMessage() +"No es numero entero");
                 
        }
    }

    
}
