package br.com.lestcode.manupularArquivos;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Builder
@Getter
@ToString
public class Produto {
    private Integer codigo;
    private String nome;
    private String valor;
    private Integer qtd;

}
