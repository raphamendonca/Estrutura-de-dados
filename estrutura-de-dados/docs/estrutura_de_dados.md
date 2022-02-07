## Intro

Estrutura de dados é uma dos fundamentos de computação abordados pelos cursos( Ciencias da computação, Sistemas de Informação, Analise e desenvolvimento de sistemas, etc..)

Quando temos um grupo de determinados dados, ou seja, um conjunto de um determinado tipo de dado, a forma como armazenamos e trabalhos com esses dados pode ser definida como esturtura de dados. 

- Arrays
- Queue
- Stack
- Map
- LinkedList
- Set

### Compelxidade de Codigo
A analise de compexidade de um codigo pode ser temporal ou espacial

Analise temporal, é uma analise sobre a execucao do codigo e o tempo consumido para isso. utiliza a notacao BIG O para determinarl qual a complexidade do algoritmo
Podendo ser constante, linear, exponencial, logaritma, etc..

Dado o aumento do conjunto de entrada na sua funcao, o tempo aumentará de que maneira?

A analise espacial visa verificar o numero de objetos que serao criados e armazenados em memoria durante a execucao do seu codigo. 
Criacao de variaveis e seu mapeamento na memoria do computador determinarao o como o algoritmo se comporta. 
Tambem utiliza-se a notacao big-o para isso. 
Dado o aumento de  itens processados ou recebidos pela sua funcao como seu codigo fara uso da memoria do computador. 


### Arrays
A forma mais comum entre todas as linguagens de programação são os arrays, tambem podem ser denominados vetores. 

A diferença é que um vetor é um conjunto unidimensional de dados. E um array pode contemplar multiplas dimensões, também conhecidas como Matrizes. 

ex: int[] -> é um array unidimensional de inteiros
    int[][] -> é um array multidimensional de inteiros

#### Complexidade Big O

- Acessar: O(n)
- Buscar: O(n)
- Inserir: O(1)
- Excluir: O(1)

### Queue /  Filas
As Filas são estrutura de dados lineares, que repensetam uma ordem sequencial dada a entrada dos dados auqele conjunto.

Assim como as filas existente no nosso cotidiano o primeiro a chegar será o primeiro a sair, ou seja, First-In-First-Out ou FIFO. 


Pode ser utilizado em situações onde requer que essa ordem deva ser respeitada, exemplo de situacoes:

Exemplo de aplicacao no dia a dia
- filas de caixa de banco, mercado etc.

Exempo de aplicacao na programacao:
- agendamento e processsamento assincrono.
- ordenacao de eventos: ordem de salvar em banco de dados ou chamar servicos externos, a fim de garantir ordem correta.


O java possui uma classe Queue, que implementa diversos comportamentos de uma fila

```java
    // declarar um array
    Queue<String> fila = new ArrayDeque<>();

    // adicionar um array
    fila.add("teste");
    
    // consultar um 
    
    // remover item da fila
    fila.poll();
```

#### Complexidade Big O

 - Acessar: O(n)
 - Buscar: O(n)
 - Inserir: O(1)
 - Excluir: O(1)


### Stack / Pilhas

Exemplo de pilha no dia a dia:
 - armazenamento de itens 
   - numa caixa
   - mala de viagem
   - porta malas
   - sacola
   - pratos de louca

Exemplo de pilha na programacao. 
 - armazenamento de eventos/telas num fluxo do seu programa
   - telas de um sistema, armazenar a sequencia delas em uma pilha para saber para qual voltar.
   - Armazenar a sequencia de eventos(ex, diferentes bancos que se esta salvando ou apis que sao chamadas) para em uma situacao de rollback desfazer. 

```java
    // declarar
     Stack<String> navegacao = new Stack<>();
    
        //inserir
        navegacao.push("tela1");
        navegacao.push("tela1");

        //remover
        navegacao.pop();
```

### Map 

### LinkedList

### Set 
Um set é a representação de um conjunto de dados Unicos, sem repeticoes.

Para o set é importante que o hashcode e equals estejam implementados pois eles determinaram o comportamento do dado armazenado.

```java
    Set<String>  setSorteio = new HashSet<>();

    // inserir
    setSorteio.add("Aluno1");
    setSorteio.add("Aluno2");

    // remover

```
