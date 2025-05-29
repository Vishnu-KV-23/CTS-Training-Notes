package collections;

import java.util.*;

/**
 * Collections framework
 *
 * Collection: an object that represents or stores a group of objects and is dynamic in nature
 * Present in java.util packaage
 * is an object that is going to store a list of objects in a dynamic manner
 *
 *
 * The Java platform includes a collections framework. A collection is an object that represents a group of objects (such as the classic Vector class). A collections framework is a unified architecture for representing and manipulating collections, enabling collections to be manipulated independently of implementation details.
 * The primary advantages of a collections framework are that it:
 *
 * Reduces programming effort by providing data structures and algorithms so you don't have to write them yourself.
 * Increases performance by providing high-performance implementations of data structures and algorithms. Because the various implementations of each interface are interchangeable, programs can be tuned by switching implementations.
 * Provides interoperability between unrelated APIs by establishing a common language to pass collections back and forth.
 * Reduces the effort required to learn APIs by requiring you to learn multiple ad hoc collection APIs.
 * Reduces the effort required to design and implement APIs by not requiring you to produce ad hoc collections APIs.
 * Fosters software reuse by providing a standard interface for collections and algorithms with which to manipulate them.
 *
 * Core interfaces:
 * java.util.collection:root of all collections except for maps

 */
public class CollectionsDemo {

    public void map(){

        /**
         * Maps: if we want to store as key value pairs
         * can have one null key by many null values
         */
        Map<String,String> users = new HashMap<>();
        users.put("E001","Vishnu");
        users.put("E002","Ashish");
        System.out.println(users);
        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.get("E001"));
        Set<Map.Entry<String,String>> entrySet =users.entrySet();
        for (var element:entrySet){
            System.out.println(element.getKey() + "=" + element.getValue());
        }
    }
    public static void main(String args[]){
        /**
         * LIST:
         * 1.ArrayList[Dynamic Array] : Faster random access ,slower insertions and deletions
         * 2.LinkedList[Double Linked List] : Fast insertions / deletions ,slower access
         */
        List<String> listOfNames = new ArrayList<>();

        listOfNames.add("John");
        listOfNames.add("Joel");
        listOfNames.add("Ellie");


    }

}
