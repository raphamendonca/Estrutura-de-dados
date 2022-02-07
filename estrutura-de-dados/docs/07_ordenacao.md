
# Algoritmos de Ordenação

> Baseado em https://www.geeksforgeeks.org/sorting-algorithms

#  Selection Sort 

O algoritmo de ordenação `Selection Sort` é considerado de dificuldade fácil, sendo aquele que fazemos de forma mais expontânea. Ou seja, funciona, de forma repetitiva, localizando o menor elemento e modendo para as posições iniciais do array - ordenação crescente. 

> Sorts an array by repeatedly finding the minimum element.

O algoritmo trabalha com dois sub-arrays da seguinte forma: 

1. O sub-array que já está ordenado; 
2. O sub-array restante, ainda desordenado.

Considere o seguinte exemplo: 

---
arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4] and place it at beginning

**11** 25 12 22 64

// Find the minimum element in arr[1...4] and place it at beginning of arr[1...4]

11 **12** 25 22 64

// Find the minimum element in arr[2...4] and place it at beginning of arr[2...4]

11 12 **22** 25 64

// Find the minimum element in arr[3...4] and place it at beginning of arr[3...4]

11 12 22 **25** 64

---

## Fluxograma

<center><img width="300px" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/Selection-sort-flowchart.jpg"> </center>


# Bubble Sort

O algoritmo `Bubble Sort` também é considerado fácil e trabalha de forma repetitiva. A ideia é comparar cada par de elementos e, caso estejam na ordem errada, trocá-los. 

> Works by repeatedly swapping the adjacent elements if they are in wrong order

1. **First Pass:**  
( **5**  **1** 4 2 8 ) –> ( **1**  **5** 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.  
( 1 **5**  **4** 2 8 ) –> ( 1 **4**  **5** 2 8 ), Swap since 5 > 4  
( 1 4 **5**  **2** 8 ) –> ( 1 4 **2**  **5** 8 ), Swap since 5 > 2  
( 1 4 2 **5**  **8** ) –> ( 1 4 2 **5**  **8** ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.  
2. **Second Pass:**  
( **1**  **4** 2 5 8 ) –> ( **1**  **4** 2 5 8 )  
( 1 **4**  **2** 5 8 ) –> ( 1 **2**  **4** 5 8 ), Swap since 4 > 2  
( 1 2 **4**  **5** 8 ) –> ( 1 2 **4**  **5** 8 )  
( 1 2 4 **5**  **8** ) –> ( 1 2 4 **5**  **8** )  
Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one **whole** pass without **any** swap to know it is sorted.  
3. **Third Pass:**  
( **1**  **2** 4 5 8 ) –> ( **1**  **2** 4 5 8 )  
( 1 **2**  **4** 5 8 ) –> ( 1 **2**  **4** 5 8 )  
( 1 2 **4**  **5** 8 ) –> ( 1 2 **4**  **5** 8 )  
( 1 2 4 **5**  **8** ) –> ( 1 2 4 **5**  **8** )

**Fluxograma**

<center><img width="300px" src="https://www.softwareideas.net/i/DirectImage/1758/Bubble-Sort--Flowchart-"></center>

# Merge Sort

Embora os dois primeiros algoritmos sejam fáceis, ambos possuem complexidade `O(n^2)`. O algoritmo `Merge Sort` é baseado na estratégia "dividir e conquistar" e possui complexidade `O(n log(n))`. No entanto, já é considerado de dificuldade média. 

> Divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.

O método `merge(arr,l,m,r)` é usado para mesclar duas metades do array `arr`.  Tal método assume que cada metade já está ordenada e, assim, as une novamente. 

```
MergeSort(arr[], l,  r)
If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = l+ (r-l)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
```

**Fluxograma**

<center><img width="300px" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/Merge-Sort-Tutorial.png"></center>

# Quick Sort

O algoritmo `Quick Sort` também é do tipo "dividir e conquistar" e possui dificuldade média. A principal diferença para o `Merge Sort` é a escolha de um "pivô", em torno do qual, o array é original é dividido em dois (não necessariamente são metades). Com isso, a complexidade aumenta significativamente para `O(n^2)`. 

> Picks an element as pivot and partitions the given array around the picked pivot

**Fluxograma**

<center><img width="500px" src="https://www.geeksforgeeks.org/wp-content/uploads/gq/2014/01/QuickSort2.png"></center>

# Tree Sort

Consiste em adicionar os elementos numa estrutura de `Binary Search Tree`.  Depois, basta percorrer os elementos "em ordem" para obtê-los em ordem crescente. 

> Creates a binary search tree from the elements of the input list or array, then get the elements from the tree in sorted order. 

```
Step 1: Take the elements input in an array.
Step 2: Create a Binary search tree by inserting data items from the array into the
        binary search tree.
Step 3: Perform in-order traversal on the tree to get the elements in sorted order.
```

Assim como os demais algoritmos de dificuldade fácil, este também possui complexidade de tempo `O(n^2)` no pior caso. 

**Fluxograma - caminho "em ordem"**

<center><img width="300px" src="https://upload.wikimedia.org/wikipedia/commons/2/2b/Binary_tree_sort%282%29.png"></center>

