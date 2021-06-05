package edu.escuelaing.arsw.Linked;

public class Nodo<E>{

    private E valor;
    private Nodo<E> siguiente;

    public Nodo(E vcrear){
        valor= vcrear;
        siguiente=null;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public E getValor() {
        return valor;
    }

    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }


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
