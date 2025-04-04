import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestingFiles{

    public static void printIntArray(int[] array){
        for (int i=0; i<array.length; i++)
            System.out.println(array[i]);
    }

    public static void printStringArray(String[] array){
        for (int i=0; i<array.length; i++)
            System.out.println(array[i]);
    }

    public static void main(String[] args) throws IOException{
        Files files = new Files();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        int[]  numeros;
        String[] songs;
        int[] numeros2 = {27, 29, 33, 68, 10, 1, 15, 87, 95};

        System.out.println("--------------------------------------");
        System.out.println("Programa que lee archivos");
        System.out.println("Escribe el nombre del archivo a leer: ");
        fileName = bufer.readLine();
        numeros = files.fileToIntArray(fileName);
        System.out.println("Contenido del arreglo: ");
        printIntArray(numeros);
        System.out.println("Escribe el nombre del archivo a leer: ");
        fileName = bufer.readLine();
        songs = files.fileToStringArray(fileName);
        System.out.println("Contenido del arreglo: ");
        printStringArray(songs);

        System.out.println("Escribe el nombre del nuevo archivo de numeros: ");
        fileName = bufer.readLine();
        files.writeIntArrayToFile(fileName, numeros2);


    }
}