package edu.escuelaing.arsw.Linked;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculadoraTest {

    public CalculadoraTest(){
    }

    @Test
    public void Calcularmedia(){
        LinkedlistCami<Double> prueba1=new LinkedlistCami();
        prueba1.add(50.10);
        prueba1.add(50.10);
        prueba1.add(50.10);
        Calculadora calculadora= new Calculadora();
        System.out.println(calculadora.calcularMedia(prueba1));
    }
    @Test
    public void CalcularDesvia(){
        LinkedlistCami<Double> prueba1=new LinkedlistCami();
        prueba1.add(50.10);
        prueba1.add(50.10);
        prueba1.add(50.10);
        Calculadora calculadora= new Calculadora();
        System.out.println(calculadora.calcularMedia(prueba1));

    }
}