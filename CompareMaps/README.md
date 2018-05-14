#### 线程安全的Map
  - Hashtable
  - ConcurrentHashMap
  - Synchronized Map
  
 
 ##### Hashtable （deprecate）
 Hashtable 源码中是使用 synchronized 来保证线程安全的。所以当一个线程访问 HashTable 的同步方法时，其他线程如果也要访问同步方法，会被阻塞住。因此Hashtable效率很低，基本被废弃。
 
 ##### ConcurrentHashMap
 ConcurrentHashMap沿用了与它同时期的HashMap版本的思想，底层依然由“数组”+链表+红黑树的方式思想，但是为了做到并发，又增加了很多辅助的类，例如TreeBin，Traverser等对象内部类。
 
 ##### SynchronizedMap
 SynchronizedMap是Collectionis的内部类。在 SynchronizedMap 类中使用了 synchronized 同步关键字来保证对 Map 的操作是线程安全的。
 
 For more see: 
 
 <http://www.cnblogs.com/yucfeng/p/9035308.html>