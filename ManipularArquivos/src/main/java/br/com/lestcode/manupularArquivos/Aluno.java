package br.com.lestcode.manupularArquivos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Aluno {

    private String nome;
    private String ra;
    private Integer nota1;
    private Integer nota2;
    private Integer media;
    private boolean aprovado;

}
