import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Files{

    int countFileLines(String fileName){
        File file;
        FileReader reader;
        BufferedReader bufer;
        int numLines = 0;

        try{
            file = new File("C:\\archivos\\" + fileName);
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);
            while ( (bufer.readLine()) != null ){
                numLines++;
            }
            reader.close();
        }catch( Exception e ) {
            System.out.println("Error al leer el archivo: " + e.toString());
        }
        return numLines;
    }

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
            reader = new FileReader(file); // Abre el archivo en modo de sólo lectura
            bufer = new BufferedReader(reader);
            // leer cada línea del archivo y almacenarla en un arreglo de enteros
            while ( (linea = bufer.readLine()) != null ){
                array[i] = Integer.parseInt(linea);
                i++;
            }
            reader.close();
        } catch( Exception e){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
        return array;
    }

    public String[] fileToStringArray(String fileName){
        File file; // Apuntar a un archivo físico del dd
        FileReader reader; //Llave con permiso de sólo lectura
        BufferedReader bufer; // Para recuperar información del archivo
        String linea; // Una línea del archivo
        String[] array = null; // arreglo de números resultante
        int i=0; // indice
        int t; //tamaño del arreglo
        try{
            t = countFileLines(fileName);
            array = new String[t];
            file = new File("C:\\archivos\\" + fileName);
            reader = new FileReader(file); // Abre el archivo en modo de sólo lectura
            bufer = new BufferedReader(reader);
            // leer cada línea del archivo y almacenarla en un arreglo de enteros
            while ( (linea = bufer.readLine()) != null ){
                array[i] = linea;
                i++;
            }
            reader.close();
        } catch( Exception e){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
        return array;
    }

    // Crear un archivo con información de un arreglo
    public void writeIntArrayToFile(String fileName, int[] array){
        FileWriter file;
        PrintWriter writer;
        try{
            file = new FileWriter("c:\\archivos\\" + fileName);
            writer = new PrintWriter(file);
            for  ( int unDato : array )
                writer.println(unDato);
            file.close();
        } catch ( Exception e) {
            System.out.println("Error al crear el archivo: " + e.toString());
        }

    }

}