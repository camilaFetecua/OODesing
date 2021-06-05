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
 * Hello world!
 *
 */
public class App 
{
    public static Double media;
    public static Double desviacionEstandar;

    public static void main( String[] args )
    {
        String file =args[0];
        System.out.println(file);
       /* Path path = Paths.get(file);
        LinkedlistCami<Double> lista1 =new LinkedlistCami<>();
        try (Stream<String> stream = Files.lines(path)) {
            for (String i : stream.collect(Collectors.toList())) {
                lista1.add(Double.parseDouble(i.trim()));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        Calculadora calculadora = new Calculadora();
        media = calculadora.calcularMedia(lista1);
        desviacionEstandar = calculadora.calcularDesviacion(lista1);
        System.out.println(media);
        System.out.println(desviacionEstandar);*/

    }

}
