#### Java 8 Stream examples to sort a Map, by keys or by values. 
Steps to sort a Map in Java 8.
   1. Convert a Map into a Stream
   2. Sort it
   3. Collect and return a new LinkedHashMap (keep the order)

```java
Map result = map.entrySet().stream()
	.sorted(Map.Entry.comparingByKey()) 			
	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	(oldValue, newValue) -> oldValue, LinkedHashMap::new));
```

PS: By default, Collectors.toMap will returns a HashMap
