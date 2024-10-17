package com.treesets;

import java.util.Set;
import java.util.TreeSet;

public class MainCollectionInfo {

	public static void main(String[] args) {
		Set<CollectionInfo> info = new TreeSet<>();
		
		info.add(new CollectionInfo("List ","1.2" ));
		info.add(new CollectionInfo("LinkedList ","1.2" ));
		info.add(new CollectionInfo("ArrayList ","1.2" ));
		info.add(new CollectionInfo("Queue ","1.5" ));
		info.add(new CollectionInfo("Set ","1.2" ));
		info.add(new CollectionInfo("HashSet ","1.2" ));
		info.add(new CollectionInfo("NavigableSet ","1.6" ));
		info.add(new CollectionInfo("Vector ","1.0" ));
		info.add(new CollectionInfo("TreeSet","1.2" ));
		info.add(new CollectionInfo("LinkedHashSet ","1.2" ));
		
		info.forEach(System.out::println);
	}
}
