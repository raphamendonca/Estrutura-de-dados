# HashMap

Usa funções hash para determinar a posição de cada elemento. Uma função hash é um algoritmo que mapeia dados de entrada de comprimento variável em dados de comprimento fixo. Assim, cada elemento a ser inserido na estrutura tem o seu endereço calculado. Isso evita "colisões" e acelera as operações de leitura. 

No código a seguir, vamos contar a ocorrência de cada caractere na frase "estruturas de dados java", desconsiderando os espaços em branco. A chave do nosso mapa, *key*, será o caractere e o valor, *value*, será o contador. Como esperado, a saída do programa será "a: 4, r: 2, s: 3, t: 2, d: 3, e: 2, u: 2, v: 1, j: 1, o: 1". 

```java
class HashMapDemo {
    public static void main(String[] args) {
        String demo = "hashmap java";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < demo.length(); i++) {
            char c = demo.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (char x : map.keySet()) {
            if (x == ' ') {
                continue;
            }
            System.out.println("count of " + x + " : " + map.get(x));
        }
    }
}
```

<center>
<img width="400px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Hash_table_3_1_1_0_1_0_0_SP.svg/630px-Hash_table_3_1_1_0_1_0_0_SP.svg.png"></center>

**Complexidade Big O**

 - Acessar: N/A
 - Buscar: O(n)
 - Inserir: O(n)
 - Excluir: O(n)
