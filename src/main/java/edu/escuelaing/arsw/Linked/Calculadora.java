package edu.escuelaing.arsw.Linked;
import edu.escuelaing.arsw.Linked.LinkedlistCami;
import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    /** Metodo para calcular la media
     * @return media
     * @param lista1 es la lista de tipo linkenlistCami
     */
    public  double calcularMedia(LinkedlistCami<Double> lista1){

        Double suma=0.0;
        for(Double x:lista1){
            suma += x;

        } return suma/lista1.size();
    }

    /** Metodo para calcular la desviacion Estandar
     * @return desviacionEstandar
     * @param lista1 es la lista de tipo linkenlistCami
     */

    public  Double calcularDesviacion(LinkedlistCami<Double> lista1){
        Double calculo =0.0;
        for (Double i :lista1){
            calculo +=  Math.pow((i - calcularMedia(lista1)),2);

        }
        double var=calculo/(lista1.size()-1);
        return Math.sqrt(var);
    }
}
