
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 * Collections Framework
 * Collection: An object that represents or stores a group of objects and is
 * dynamic in nature.
 * Reduces programming effort by providing data structures and algorithms so you
 * don't have to write them yourself.
 * Increases performance by providing high-performance implementations of data
 * structures and algorithms.
 * Provides interoperability between unrelated APIs by establishing a common
 * language to pass collections back and forth.
 * Reduces the effort required to learn APIs by requiring you to learn multiple
 * ad hoc collection APIs.
 * Reduces the effort required to design and implement APIs by not requiring you
 * to produce ad hoc collections APIs.
 * Fosters software reuse by providing a standard interface for collections and
 * algorithms with which to manipulate them.
 * 
 * Core Interfaces:
 * java.util.Collection: root of all collection classes except for maps
 */
public class CollectionsDemo {

  static void printCollection(Collection<String> list) {
    for (String item : list) {
      System.out.println(item);
    }
  }

  static void list() {
    /**
     * List:
     * ArrayList[Dynamic Array] : Faster random access, slow insertions and
     * deletions
     * LinkedList[Double Linked List] : Fast insertions/deletions, slower access
     * List allows duplicate values to be inserted
     */
    List<String> listOfNames = new ArrayList<>();
    listOfNames.add("John");
    listOfNames.add("Smith");
    listOfNames.add("Joseph");
    listOfNames.add("Joseph");
    listOfNames.add("Joseph");

    List<String> linkedListNames = new LinkedList<>();
    linkedListNames.add("Jane");
    linkedListNames.add("Jenny");
    linkedListNames.add("Robert");

    printCollection(linkedListNames);

    System.out.println();

    var iterator = linkedListNames.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println(linkedListNames);

    System.out.println(linkedListNames.size());
    System.out.println(linkedListNames.contains("Jenny"));
  }

  static void set() {
    /**
     * Set: Another collectiono object, this does not allows duplicate values
     * HashSet: Uses HashTable, No duplicates, one null value allowed
     */
    Set<String> setOfNames = new HashSet<>();
    setOfNames.add("John");
    setOfNames.add("Smith");
    setOfNames.add("Joseph");
    setOfNames.add("Joseph");
    setOfNames.add("Joseph");
    setOfNames.add(null);

    printCollection(setOfNames);
    System.out.println();
    /**
     * TreeSet: Red-Black Tree, sorted by default using natural order or custom
     * logic, No null values
     */
    Set<String> treeSet = new TreeSet<>();
    treeSet.add("John");
    treeSet.add("Smith");
    treeSet.add("Joseph");
    treeSet.add("Joseph");
    treeSet.add("Joseph");
    treeSet.add("Abe");
    treeSet.add("Bipin");
    // treeSet.add(null);

    printCollection(treeSet);
  }

  static void qAndDq() {
    /**
     * Queue and DeQueue: We can use the LinkedList class, but it slower
     * PriorityQueue: sorted using natural order or by comprator, no null values,
     * not thread safe
     * ArrayDeque: Based on resizable array, faster than linked list
     */
    Queue<String> qNames = new LinkedList<>();
    qNames.add("Ashish");
    qNames.add("Gokul");
    qNames.add("Ramesh");

    // Print the Q
    System.out.println(qNames);

    // Peek at the front of the Q
    System.out.println("Peek: " + qNames.peek());
    System.out.println(qNames);
    System.out.println();

    // Poll from the q
    System.out.println("Poll: " + qNames.poll());
    System.out.println();

    // Peek at the front of the Q
    System.out.println("Peek: " + qNames.peek());
    System.out.println(qNames);

    System.out.println();
    System.out.println("DQ");
    Deque<String> dqNames = new LinkedList<>();
    dqNames.addFirst("Ashish");
    dqNames.addFirst("Gokul");
    dqNames.addLast("Rahul");
    dqNames.add("Ramesh");
    System.out.println(dqNames);

    System.out.println();
    System.out.println("Peek First: " + dqNames.peekFirst());
    System.out.println("Peek Last: " + dqNames.peekLast());
  }

  static void map() {
    /**
     * Map: Stores data in Key-Value pairs
     * HashMap: No insertion order, one null key value, many null values
     */
    Map<String, String> users = new HashMap<>();
    users.put("E001", "Ashish");
    users.put("E002", "Arun");
    System.out.println(users);
    System.out.println(users.keySet());
    System.out.println(users.values());
    System.out.println(users.get("E001"));
    Set<Entry<String, String>> entrySet = users.entrySet();
    for (var element : entrySet) {
      System.out.println(element.getKey() + " = " + element.getValue());
    }
  }

  static List<String> getNames() {
    // Return an immutable list
    return List.of("Gokul", "Ashish", "Arya", "Ashwin");
  }

  static void someMore() {
    // Create a new multable array list
    List<String> names = new ArrayList<>(getNames());
    names.add("John");
    // Do not use this ever, creates an anonymous class
    List<String> greetings = new ArrayList<>() {
      {
        add("Hey");
        add("Hello");
        add("Welcome");
      }
    };
    System.out.println(greetings);
  }

  static void sort() {
    List<Integer> ranks = new ArrayList<>();
    ranks.add(5);
    ranks.add(1);
    ranks.add(4);
    ranks.add(3);
    ranks.add(2);
    System.out.println(ranks);
    System.out.println("Sorting...");
    Collections.sort(ranks);
    System.out.println(ranks);

  }

  public static void main(String[] args) {
  }
}
