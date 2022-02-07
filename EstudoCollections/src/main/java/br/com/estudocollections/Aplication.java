package br.com.estudocollections;

import org.apache.commons.collections4.*;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.map.LinkedMap;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Aplication {

    public static void main(String[] args) {
        /*
        add(objetct)
        addAll(Collection)
        size()
        contains(Object)
        clear()
        isEmpty()
        remove(Object)
        toArray()
         */

        List<String> nomesA = new ArrayList<>();

        nomesA.add("Mariana da Conceição");
        nomesA.add("Pietra Barbosa");
        nomesA.add("Ana Lívia Aragão");
        nomesA.add("Sabrina Pinto");
        nomesA.add("Fernando Campos");

        List<String> nomesB = new ArrayList<>();
        nomesB.add("Benjamin da Cunha");
        nomesB.add("Vicente Campos");
        nomesB.add("Pedro Miguel Ramos");
        nomesB.add("Isadora Oliveira");
        nomesB.add("Marina Teixeira");



        CollectionUtils.addIgnoreNull(nomesA, null);
        CollectionUtils.addIgnoreNull(nomesB, "Sara");

//        nomesA.stream().forEach(System.out::println);
//        System.out.println("---");
//        nomesB.stream().forEach(System.out::println);

//        System.out.println("-------");
        List<String> todosNomes = CollectionUtils.collate(nomesA, nomesB);

//        todosNomes.stream().forEach(System.out::println);

        CollectionUtils.filter(nomesA, nome -> nome.contains("Mar"));
//        nomesA.stream().forEach(System.out::println);

//        System.out.println("-------");
        nomesB = nomesB.stream().filter(nome-> nome.contains("ira")).collect(Collectors.toList());
//        nomesB.stream().forEach(System.out::println);

//        Comparator<String> comparator = (String o1, String o2) -> o1.compareTo(o2);
//        Collections.sort(nomes, comparator);
//        nomes.sort(comparator);
//
//        for (String nome: nomes){
//            System.out.println(nome);
//        }

//        List<String> nomesFiltrados = nomes.stream()
//                                        .sorted()
//                                        .filter( nome -> nome.contains("Ana "))
//                                        .collect(Collectors.toList());
//


//        System.out.println(setDesordenado);
//        Set<String> garagem1 = new HashSet();
//        garagem1.add("Camaro");
//        garagem1.add("Fusca");
//
//        Set<String> garagem2 = new HashSet();
//        garagem2.add("Camaro");
//        garagem2.add("Mustang");

//        System.out.println(SetUtils.emptyIfNull(setDesordenado));
//        System.out.println(SetUtils.disjunction(garagem1,garagem2));


//                setDesordenado.
//        Set<String> setOrdenadoNaturalmente = new TreeSet();
//        Set<String> setOrdenadoPorInsercao = new LinkedHashSet();
//
//        Set<String> stringSet = new LinkedHashSet();
//        EnumSet<Dias> diasUteis = EnumSet.of(Dias.SEGUNDA,Dias.TERCA, Dias.QUARTA, Dias.QUINTA );
//        diasUteis.contains("quarta");
//
//        Queue<String> fila = new PriorityQueue<>();

        // chave e valor
        // chaves são UNICAS
        // valores podem ser duplicados
//        Map<Integer, String> mapDesordenada = new HashMap<>();
//        Map<Integer, String> mapOrdenadaPorKey = new TreeMap<>();
//        Map<Integer, String> mapOrdenadaPorInsercao = new LinkedHashMap<>();
//
        IterableMap alunos = new HashedMap();
        alunos.put(1, "Raphael");
        alunos.put(3, "Ruan");
        alunos.put(2, "Diogo");
        alunos.put(4, null);

        MapIterator alunosIterator = alunos.mapIterator();


//        Map<String, Integer> posicoestabuleiro = new HashMap<>();
//        posicoestabuleiro.put("A", 0);
//        posicoestabuleiro.put("B", 1);
//        posicoestabuleiro.put("C", 2);
//        posicoestabuleiro.put("D", 3);
//
//        posicoestabuleiro.get("A");

//        String temp = MapUtils.getString(posicoestabuleiro, "B", "0");
//        System.out.println(temp);

//        OrderedMap mapaOrdenado = new LinkedMap();
//        mapaOrdenado.put("Raphael", Pessoa.builder().nome("Raphael Mendonca").matricula("123123").build());
//        System.out.println(mapaOrdenado);

//        for (Map.Entry<Integer, String> item: alunos.entrySet()){
//            System.out.println(item.getKey());
//            System.out.println(item.getValue());
//        }

        Bag sacola = new HashBag();
        sacola.add(Moto.builder().marca("Honda").modelo("CBBR 300").build(), 5);
        sacola.add(Carro.builder().marca("Ford").modelo("Focus").build(), 3);

        System.out.println(sacola);

    }

    private static void imprime(String nome){
        System.out.println("Nome dos alunos: ");
        System.out.println(nome);
    }

}
