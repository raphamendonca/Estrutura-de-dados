package br.com.estudocollections;

import lombok.Builder;
import lombok.ToString;

import java.util.Objects;

@Builder
@ToString
public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private String matricula;

    @Override
    public int compareTo(Pessoa o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(matricula, pessoa.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
