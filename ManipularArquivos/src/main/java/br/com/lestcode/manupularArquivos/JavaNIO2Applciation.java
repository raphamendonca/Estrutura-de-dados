package br.com.lestcode.manupularArquivos;

import java.awt.desktop.FilesEvent;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNIO2Applciation {


    public static void main(String[] args){
        Path path = Paths.get("docs/arquivos/listacompras.txt");
        System.out.println( Files.exists(path) );


    }


}
