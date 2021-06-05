package edu.escuelaing.arsw.Linked;

public class Nodo<E>{

    private E valor;
    private Nodo<E> siguiente;

    /**
     * Constructor de la clase
     * @param  vcrear es el valor a crear en el nodo
     */
    public Nodo(E vcrear){
        valor= vcrear;
        siguiente=null;
    }

    /**
     * Establece el Valor
     * @param  valor es el valor que se le asigna al nodo
     */
    public void setValor(E valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el valor
     * @return valor
     */
    public E getValor() {
        return valor;
    }

    /**
     * Establece el siguiente nodo
     * @param siguiente es el siguiente nodo
     */
    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Obtiene el nodo siguiente
     * @return siguiente
     */
    public Nodo<E> getSiguiente() {
        return siguiente;
    }


    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                ", siguiente=" + siguiente +
                '}';
    }
}
