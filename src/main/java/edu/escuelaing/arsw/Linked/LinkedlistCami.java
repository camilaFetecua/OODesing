package edu.escuelaing.arsw.Linked;

import java.io.Serializable;
import java.util.*;

public class LinkedlistCami<E> implements List<E> , Deque<E>, Cloneable, Serializable {


    private Nodo<E> cabeza;
    private Nodo<E> cola;

    /**
     * Constructor de la clase
     */
    public LinkedlistCami() {
        cabeza = null;
        cola = null;
        int size = 0;
    }

    /**
     * Retorna el numero de elementos de la lista
     * @return contador que es el numero de elementos de la lista
     */
    public int size() {
        Nodo actual = cabeza;
        int contador = 0;
        while (actual != null) {
            actual = actual.getSiguiente();
            contador++;
        }
        return contador;
    }

    /**
     *Agrega elementos esfecificos a la lista
     * @return true si la cabeza es nula y false de lo contrario
     */
    public boolean isEmpty() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }


    public boolean contains(Object o) {
        return false;
    }

    /**
     * Retorna un iterador de los elementos que esta el las secuencia adecuada
     *
     */
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Nodo<E> actual = cabeza;

            @Override
            public boolean hasNext() {
                return actual != null;
            }

            @Override
            public E next() {
                if (hasNext()) {
                    E value = actual.getValor();
                    actual = actual.getSiguiente();
                    return value;
                }
                return null;
            }

            @Override
            public void remove() {

            }
        };
    }

    public Nodo derecha(Nodo data) throws IndexOutOfBoundsException {
        return data;
    }


    public Iterator<E> descendingIterator() {
        return null;
    }


    public Object[] toArray() {
        return new Object[0];
    }


    public <T> T[] toArray(T[] a) {
        return null;
    }


    public void addFirst(E e) {

    }


    public void addLast(E e) {

    }


    public boolean offerFirst(E e) {
        return false;
    }


    public boolean offerLast(E e) {
        return false;
    }


    public E removeFirst() {
        return null;
    }


    public E removeLast() {
        return null;
    }


    public E pollFirst() {
        return null;
    }

    public E pollLast() {
        return null;
    }

    public E getFirst() {
        return cabeza.getValor();
    }


    public E getLast() {
        return cola.getValor();
    }


    public E peekFirst() {
        return null;
    }


    public E peekLast() {
        return null;
    }


    public boolean removeFirstOccurrence(Object o) {
        return false;
    }


    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    /**
     * Agrega un elemento especifico a la lista
     *
     *
     */
    public boolean add(E e) {
        Nodo<E> nuevoNodo = new Nodo(e);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.setSiguiente(null);
            cabeza = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
        }
        cola = nuevoNodo;
        return true;
    }

    /**
     * Elimna el primer elemento especificado de la lista
     *
     * @return true si el elemento esta en la lista
     */


    public boolean remove(Object o) {
        Nodo nodo = cabeza;
        Nodo previo = null;
        E inf = null;
        boolean bandera = false;
        int tamano = size();
        while (tamano != size() && nodo != null) {
            inf = (E) nodo.getValor();
            if (inf.equals(o)) {
                bandera = true;
                if (previo != null) {
                    previo.setSiguiente(nodo.getSiguiente());
                    cabeza = previo;
                } else {
                    cabeza = cabeza.getSiguiente();
                }
            } else {
                tamano--;
                previo = nodo;
                nodo = nodo.getSiguiente();
            }
        }
        return bandera;
    }


    public boolean containsAll(Collection<?> c) {
        return false;
    }


    public boolean addAll(Collection<? extends E> c) {
        return false;
    }


    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }


    public boolean removeAll(Collection<?> c) {
        return false;
    }


    public boolean retainAll(Collection<?> c) {
        return false;
    }


    public boolean offer(E e) {
        return false;
    }

    public E remove() {
        return null;
    }


    public E poll() {
        return null;
    }


    public E element() {
        return null;
    }


    public E peek() {
        return null;
    }


    public void push(E e) {

    }


    public E pop() {
        return null;
    }


    public void clear() {

    }

    public E get(int index) {
        return null;
    }


    public E set(int index, E element) {
        return null;
    }


    public void add(int index, E element) {

    }


    public E remove(int index) {
        return null;
    }


    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public ListIterator<E> listIterator() {
        return null;
    }


    public ListIterator<E> listIterator(int index) {
        return null;
    }


    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }


    public String toString() {
        return "LinkedlistCami{" +
                "cabeza=" + cabeza +
                ", cola=" + cola +
                '}';

    }
}