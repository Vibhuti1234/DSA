package dsa_complete.hashtable;

import java.util.ArrayList;

public class HashTableTest {

	public static void main(String[] args) {
     HashTable table=new HashTable();
     table.set("a", 1);
     table.set("b", 2);
     table.set("c", 3);
     table.prinTable();
     int value=table.get("a");
     System.out.println(value);
     ArrayList<String> keys=table.getAllKeys();
     keys.forEach(System.out::print);
     

	}

}
