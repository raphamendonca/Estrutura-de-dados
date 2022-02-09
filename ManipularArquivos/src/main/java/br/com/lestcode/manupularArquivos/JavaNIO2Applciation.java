package br.com.lestcode.manupularArquivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO2Applciation {

    static Path PATH_ENTRADA = Paths.get("docs/arquivos/listacompras.txt");
    static Path PATH_SAIDA = Paths.get("docs/arquivos/listacompras-saidaNIO.txt");
    static String ENCODE_UTF = "UTF-8";

    /* Buffers = nossos pacotes de dados
     Charset = encode decode ( UTF-8, US-ASCII, ISO )
     Channel = representa conexao com as entidades capaz de efetuar transacao IO
        valores
            - canal 1 -> processa a  \
            - canal 2 -  processa b   === canal resultante
            - canal 3 -  processa c  /

     Selectors/Selection keys = em conjunto com os canais define
     recurso nao bloqueante e agrega no canal de saida

     IO = facil de implementar porem nao é multithread
     NIO = Mais complexo de implementar, porem mais flexivel com tipos de arquivos.

     for o(n2) =

    */
    public static void main(String[] args){
        List<String> conteudoArquivo = ler(PATH_ENTRADA);
//        escrever(conteudoArquivo, PATH_SAIDA);
    }
    //xlsx Apache POI


    private static List<String> ler(Path path) {
        List<String> conteudoArquivo = new ArrayList();

        try (RandomAccessFile leitor = new RandomAccessFile(path.toString(), "r");
             FileChannel canal = leitor.getChannel();
                ){

            ByteBuffer buffer = ByteBuffer.allocate(200);
            int numeroTotalBytes = canal.read(buffer);
            Charset charset = Charset.forName(ENCODE_UTF);

            while (canal.read(buffer) >0){
                buffer.rewind();
                conteudoArquivo.addAll(
                        List.of(String.valueOf(charset.decode(buffer)).split("\n")));
                buffer.flip();
            }

            System.out.println(conteudoArquivo.size());
            conteudoArquivo.forEach(System.out::println);

            System.out.println(conteudoArquivo.get(4));

//            conteudoArquivo = Files.readAllLines(path);

        } catch (FileNotFoundException e) {
            System.out.println("arquivo nao existente");
        } catch (IOException e){
            System.out.println("Erro nao esperado ao tratar arquivo: " + e.getCause());
        }

        return conteudoArquivo;
    }


    private static void escrever(List<String> conteudo, Path path){
        if(Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*
        rws flushes the contents of the file and the modification date of the file.
        rwd flushs the contents of the file, but the modification date might not change until the file is closed.
        rw only flushes when you tell it to and doesn't change the modifcation date until you close the file.
         */
        try(RandomAccessFile escritor = new RandomAccessFile(path.toString(), "rw");
            FileChannel canal = escritor.getChannel()
        ){
            conteudo.forEach(linha -> {
                    try {
                        canal.write(ByteBuffer.wrap((linha+" - ").getBytes(Charset.forName("UTF-8"))));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            );

        } catch (FileNotFoundException e) {
            System.out.println("arquivo nao encontrado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
