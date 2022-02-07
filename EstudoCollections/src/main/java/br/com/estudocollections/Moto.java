package br.com.estudocollections;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Moto {
    private String marca;
    private String modelo;
}
