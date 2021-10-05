package data_structures.hashTable;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable {
	
	private static class MyNodes extends ArrayList<MyNode> {
		
	}
	
	private final int length;
	private MyNodes[] data;
	
	public MyHashTable(int size) {
		length = size;
		data = new MyNodes[length];
	}

	private int hash(String key) {
		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
			hash = (hash + key.charAt(i) * i) % length;
		}
		return hash;
	}
	
	
	// method to set key, value pair
	public void set(String key, int value) {
		// get the hash address
		int address = hash(key);
		
		if(data[address] == null) {
			data[address] = new MyNodes();
		}
		
		data[address].add(new MyNode(key, value));
	}
	
	
	// Method to get the value
	public int get(String key) {
		// get the hash address of the key
		int address = hash(key);
		
		if(data[address] == null) {
			return 0;
		}

		for(MyNode node : data[address]) {
			if(node.getKey().equals(key)) {
				return node.getValue();
			}
		}	
		return 0;
	}
	
	
	// Method to get all the keys
	public List<String> keys() {
		
		if(data.length == 0) {
			return null;
		}
		
		List<String> keys = new ArrayList<>();
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				for(MyNode node : data[i]) {
					keys.add(node.getKey());
				}
			}
		}
		
		return keys;
		
	}
	
	public static void main(String[] args) {
		
		
		MyHashTable hashTable = new MyHashTable(50);
	    
		hashTable.set("apple", 10);
		hashTable.set("banana", 20);
		hashTable.set("cat", 17);
		hashTable.set("virat", 18);
		
		
		System.out.println(hashTable.get("apple"));
		System.out.println(hashTable.get("virat"));
		
		
		System.out.println(hashTable.keys().toString());
	}

}
