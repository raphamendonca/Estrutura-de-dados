package br.com.estudocollections;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Carro {
    private String marca;
    private String modelo;
}
