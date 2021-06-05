package edu.escuelaing.arsw;

import edu.escuelaing.arsw.Linked.Calculadora;
import edu.escuelaing.arsw.Linked.LinkedlistCami;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Metodo principal , imprimela media y la desviacion estandar de los numeros que estan en el archivo
 */
public class App 
{
    public static Double media;
    public static Double desviacionEstandar;

    public static void main( String[] args )
    {
        String file =args[0];
        System.out.println(file);

    }

}
