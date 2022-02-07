package base.fila;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Fila {

    public static void main( String [] args){

        Queue<String> fila = new ArrayDeque<String>();

//        O(1)
        fila.add("a");
        fila.add("b");
        fila.add("c");

        //o(n)
        for (String msg: fila.stream().toList()){
            System.out.println(msg);
        }
        System.out.println("---");

        System.out.println(fila.size());
        System.out.println(fila.peek());

        // O(1)  remover A
        fila.remove();

        System.out.println(fila.peek());

        // O(1) removo o b
        System.out.println(fila.poll());

        //imprimir o proximo -> C
        System.out.println(fila.peek());
        System.out.println(fila.size());
//
//        System.out.println("---");
//        fila.poll();
//        System.out.println(fila.peek());

//        Queue<String> bankline = new ArrayDeque<>();
//        bankline.add("Java");
//        bankline.add("Algoritmos");
//        bankline.add("Estruturas de Dados");
//        System.out.println("Topo: " + bankline.peek());
//        String collect = String.join(", ", bankline);
//        System.out.println("Todos: "+ collect);
//        System.out.println("poll(): " + bankline.poll());
//        System.out.println("poll(): " + bankline.poll());
//        System.out.println("poll(): " + bankline.poll());
    }


}
