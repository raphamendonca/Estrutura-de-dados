# Linked List

Existe um elemento "raiz" e, então, cada elemento está ligado a outro. O tamanho é dinâmico e a lista pode ser "espalhada" pela memória. 

Essa estrutura costuma ser negligenciada devido suas semelhanças com `ArrayList` (a interface Java `java.util.List` implementada como um array). No entanto, a principal vantagem está em listas com tamanho dinâmico que costumam crescer quando necessário. Enquanto, no melhor caso da operação de adição ambas tem custo `O(1)` (em notação *Big O* - https://pt.wikipedia.org/wiki/Grande-O), caso seja necessário redimensionar o array, então o custo será `O(log(n))`. 

```java
class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>(List.of("maçã", "uva", "banana"));//cria uma nova lista encadeada 
		linkedList.push("laranja");//adiciona ao início
		String headElement = linkedList.poll();//remove o elemento da frente
		System.out.println("Removido: " + headElement);//imprime "Removido: laranja"
		String collect = linkedList.stream().sorted().collect(Collectors.joining(", "));//ordena e junta numa string separada por vírgula
		System.out.println(collect);/imprime "banana, maçã, uva"
	}
}
```

<center>
<img width="400px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/CPT-LinkedLists-addingnode.svg/474px-CPT-LinkedLists-addingnode.svg.png"><p>Diagram of inserting a node into a singly linked list</p></center>

---
<center>
<img width="400px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/CPT-LinkedLists-deletingnode.svg/380px-CPT-LinkedLists-deletingnode.svg.png"><p>Diagram of deleting a node from a singly linked list</p></center>

**Complexidade Big O**

 - Acessar: O(n)
 - Buscar: O(n)
 - Inserir: O(1)
 - Excluir: O(1)



-----------
Para LinkedList<E>

    get(int index)é O (n) (com n / 4 etapas em média), mas O (1) quando index = 0ou index = list.size() - 1(nesse caso, você também pode usar getFirst()e getLast()). Um dos principais benefícios de LinkedList<E>
    add(int index, E element)é O (n) (com n / 4 etapas em média), mas O (1) quando index = 0ou index = list.size() - 1(nesse caso, você também pode usar addFirst()e addLast()/ add()). Um dos principais benefícios de LinkedList<E>
    remove(int index)é O (n) (com n / 4 etapas em média), mas O (1) quando index = 0ou index = list.size() - 1(nesse caso, você também pode usar removeFirst()e removeLast()). Um dos principais benefícios de LinkedList<E>
    Iterator.remove()é O (1) . Um dos principais benefícios de LinkedList<E>
    ListIterator.add(E element)é O (1) . Um dos principais benefícios de LinkedList<E>

Nota: Muitas das operações precisam de n / 4 etapas, em média, número constante de etapas no melhor caso (por exemplo, índice = 0) e n / 2 etapas no pior caso (meio da lista)

Para ArrayList<E>

    get(int index)é O (1) . Principal benefício de ArrayList<E>
    add(E element)é O (1) amortizado, mas O (n) na pior das hipóteses, pois a matriz deve ser redimensionada e copiada
    add(int index, E element)é O (n) (com n / 2 passos em média)
    remove(int index)é O (n) (com n / 2 passos em média)
    Iterator.remove()é O (n) (com n / 2 passos em média)
    ListIterator.add(E element)é O (n) (com n / 2 passos em média)

Nota: Muitas das operações precisam de n / 2 etapas, em média, número constante de etapas no melhor caso (final da lista), n etapas no pior caso (início da lista)