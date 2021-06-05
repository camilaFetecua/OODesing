package edu.escuelaing.arsw.Linked;
import edu.escuelaing.arsw.Linked.LinkedlistCami;
import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public  double calcularMedia(LinkedlistCami<Double> lista1){

        Double suma=0.0;
        for(Double x:lista1){
            suma += x;

        } return suma/lista1.size();
    }


    public  Double calcularDesviacion(LinkedlistCami<Double> lista1){
        Double calculo =0.0;
        for (Double i :lista1){
            calculo +=  Math.pow((i - calcularMedia(lista1)),2);

        }
        double var=calculo/(lista1.size()-1);
        return Math.sqrt(var);
    }
}
