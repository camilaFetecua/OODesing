package edu.escuelaing.arsw.Linked;


import org.junit.Test;

public class LinkedlistCamiTest {
    public  LinkedlistCamiTest(){
    }
    @Test
    public void size(){
        LinkedlistCami<Integer> prueba1= new LinkedlistCami<>();
        prueba1.add(50);
        prueba1.add(20);
        prueba1.add(30);
        prueba1.add(40);
        System.out.println(prueba1);
        System.out.println(prueba1.size());

    }

    @Test
    public void ListaVacia(){
        LinkedlistCami<Integer> prueba2= new LinkedlistCami<>();
        System.out.println(prueba2);
        System.out.println(prueba2.size());
    }

    @Test
    public void Iterando(){
        LinkedlistCami<Integer> prueba3= new LinkedlistCami<>();
        prueba3.add(50);
        prueba3.add(20);
        prueba3.add(30);
        prueba3.add(40);
        System.out.println(prueba3);
        for (Integer n:prueba3){
            System.out.println("Valor del nodo: "+ n);
        }
    }

}