package br.com.lestcode.manupularArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class JavaIOApplciation {

    public  static void main(String[] args) {
//        String inputPath = "docs/arquivos/listacompras.txt";
        String inputPath = "docs/arquivos/produtos.csv";
        String outputPath = "docs/arquivos/listacompras-saida.txt";

        LinkedHashSet<String> listaCompra = lerArquivo(inputPath);
        listaCompra.remove(listaCompra.stream().findFirst().get());

        List<Produto> produtos = new ArrayList<>();

        for(String linha: listaCompra){
            List<String> atributos = Arrays.stream(linha.split(",")).toList();

            produtos.add(Produto.builder()
                            .codigo(Integer.parseInt(atributos.get(0)))
                            .nome(atributos.get(1))
//                            .valor(Double.parseDouble(atributos.get(2)))
                            .qtd(Integer.parseInt(atributos.get(3)))
                            .build()
            );
        }

        produtos.forEach(System.out::println);

//        listaCompra = listaCompra.stream()
//                .map(item -> item = item + " -> comprado")
//                .collect(Collectors.toSet());
        // envia msg notificao
        // salva no bd

//        escreverArquivo(listaCompra, outputPath);

    }

    private static void escreverArquivo(Set<String> listaCompra, String outputPath){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            listaCompra.forEach( item -> {
                try {
                    writer.append(item);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static LinkedHashSet<String> lerArquivo(String inputPath) {
        LinkedHashSet<String> listaCompra = new LinkedHashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath)); ){
            String linha = reader.readLine();

            while( linha != null ){
                listaCompra.add(linha);
                linha = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao buscar arquivo : " + inputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaCompra;
    }

}
