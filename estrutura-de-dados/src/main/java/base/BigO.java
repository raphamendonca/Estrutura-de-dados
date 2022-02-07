package base;

import java.util.ArrayList;
import java.util.List;

public class BigO {

    public static void main(String[] args){
        int[][] posicoes = new int[10][10];

        //o(n)
//        for (int i = 0; i < posicoes.length; i++) {
//            for (int j = 0; j < posicoes[i].length; j++) {
//
//            }
//        }

        List<Disciplina> disciplinas  = new ArrayList();
        disciplinas.add(new Disciplina("Portugues", 8.5));
        disciplinas.add(new Disciplina("Matematica", 9.5));
        disciplinas.add(new Disciplina("Historia", 7.5));

        List<Aluno> alunos = new ArrayList();
        alunos.add(new Aluno("raphael", 34, disciplinas));
        alunos.add(new Aluno("Sebastiao", 33, disciplinas));
//        alunos.add(new Aluno("Rosa", 35));

        System.out.println(calculaIdadeMedia(alunos));

        /*
        itero todos os alunos
            para cada aluno é iterada as disciplinas
            alunos  -> N -> n
                disciplinas - N -> n²
                    execicios - N n³ -cubica
           n*n
           n²  -> exponencial quadratica
         */
        int mediaAlunos = 0;
        for(Aluno aluno: alunos){
            mediaAlunos = calculaMediaAluno(aluno.getDisciplinas());
        }

        System.out.println(mediaAlunos/alunos.size());
    }

    private static int calculaMediaAluno(List<Disciplina> disciplinas){
        int somaNota = 0;
        for(Disciplina disciplina: disciplinas){
            somaNota += disciplina.getNota();
        }
        return somaNota / disciplinas.size();
    }


    // aumenta conforme numero de alunos aumenta O(N)
    /*
    1 aluno demora tempo igual a T
    10 alunos  ->  10*T
    N alunos -> n*T
     */
    private static int calculaIdadeMedia(List<Aluno> alunos){
        int somaIdade = 0;
        for(Aluno aluno: alunos){
            somaIdade += aluno.getIdade();
        }
        return somaIdade / alunos.size();
    }

    // constante 0(1)
    public static int soma(int a, int b){
        return a + b;
    }


}
