import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Files{

    public int[] fileToIntArray(String fileName){
        File file; // Apuntar a un archivo físico del dd
        FileReader reader; //Llave con permiso de sólo lectura
        BufferedReader bufer; // Para recuperar información del archivo
        String linea; // Una línea del archivo
        int[] array = null; // arreglo de números resultante
        int i=0; // indice
        int t; //tamaño del arreglo
        try{
            t = countFileLines(fileName);
            array = new int[t];
            file = new File("C:\\archivos\\" + fileName);
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);
        } catch( Exception e){
            System.out.println("Error al leer el archivo: " + e.toString());
        }

    }

}