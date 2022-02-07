package base;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class Estruturas {

    public static void main(String[] args){
        Aluno aluno = new Aluno("Raphael", 34);

        Map<UUID, Aluno> alunos = new HashMap<UUID, Aluno>();

        int ultimaChave = 0;
        UUID id = UUID.randomUUID();

        alunos.put(id, new Aluno("Raphael", 34));
        alunos.put(UUID.randomUUID(), new Aluno("Rosa", 40));
        alunos.put(UUID.randomUUID(), new Aluno("Sebastiao", 60));

//        System.out.println(alunos.get(id));

        //hash, url
        Map<String, String> shortUrl = new HashMap<String,String>();

        String url = "http://www.letscode.com.br";
        String chave = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
        shortUrl.put(chave, url);

//        System.out.println("short.url/"+chave);
//        System.out.println(shortUrl.get(chave));
//
//        LinkedList<String> linkedList = new LinkedList<>(List.of("maçã", "uva", "banana"));
//        for (String str: linkedList){
//            System.out.println(str);
//        }
//        System.out.println("----------");
//        linkedList.add(1,"laranja");
//        for (String str: linkedList){
//            System.out.println(str);
//        }

        Set<UUID> ids = new HashSet<UUID>();
        ids.add(UUID.randomUUID());
        System.out.println(ids.size());
        System.out.println("---");
        UUID testeId = UUID.randomUUID();

        System.out.println(ids.add(testeId));
        System.out.println(ids.size());
        for (UUID i: ids){
            System.out.println(i);
        }

        System.out.println("---");
//        insert = ids.add(testeId);
        System.out.println(ids.add(testeId));
        System.out.println(ids.size());
        for (UUID i: ids){
            System.out.println(i);
        }
        ids.add(UUID.randomUUID());
        System.out.println(ids.size());
    }

}
