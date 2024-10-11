In Java, the Comparator interface is used to define custom sorting logic for objects that don't implement the comparable interface or when we want to sort the objects in mulitple ways. 

It helps in comparing two objects of the same type and is often used with data structure like PriorityQueue, 
TreeSet, Collections.sort() and more. 

is often used with PriorityQueue, TreeSet, Collections.sort(). 

A comparator object compares two objects to determine their ordering, and it allows us to controll the sorting behaviour. 

1. compare(T o1, T o2): 0 if equal, -1 if o1<o2 and 1 if o1>o2 

In the Huffman Coding example above, we used a custom comparator in the PriorityQueue to order nodes by their frequency. This ensures that two nodes with lowesest frequencies are always processed first when building the Huffman tree. 

Comparable: Natural ordering, used when the class itself provides single method of comparison via the compareTo method (eg. strings, numbers)

Comparator: Custom Ordering allows sorting objects in different ways and works separately from the class being compared. 

I can use Comparator to sort intergers in descending oreder, which is different from their Natural ascending order. 