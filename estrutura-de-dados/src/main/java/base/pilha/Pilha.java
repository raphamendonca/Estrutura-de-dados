package base.pilha;

import java.util.Stack;

public class Pilha {

    public static void main( String [] args){

        Stack<String> pilha = new Stack<String>();

        //inserir o(1)
        pilha.push("a");
        pilha.push("b");
        pilha.push("c");
        pilha.push("d");
        System.out.println(pilha.size());
        System.out.println(pilha.peek());

        System.out.println("-----");
        // excluir o(1)
        System.out.println("remover : "+ pilha.pop());
        System.out.println(pilha.peek());

        //buscar o(n)
        for (String item: pilha){
            System.out.println(item);
        }

        //acessar o(n)
    }

}
