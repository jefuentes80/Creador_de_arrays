
import java.io.*;

public class Main{
    public static void main(String[] args) {
        
        int contador = 0;

        System.out.println("String data [][]={ ");

        for(int i = 0; i < Data.datos.length(); i++){
            
            // RECUPERACIÓN DE LA LETRA
            char letra = Data.datos.charAt(i);
            String letraToString = String.valueOf(letra);
        

            System.out.print("{");
            for(int j = 1; j <=5;j++){


                if( letraToString.equalsIgnoreCase(",") ){
                    System.out.print(",");
                }else{
                        System.out.print(letraToString);
                    }
            }
            System.out.println("},");
           

        }

        // fin del programa
        System.out.println("");

    }
}