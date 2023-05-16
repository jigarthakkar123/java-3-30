package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(101,"Harsh");
		map.put(781,"Anjali");
		map.put(340,"Vraj");
		map.put(908,"Heer");
		map.put(451,"Archana");
		map.put(765,"Shraddha");
		
		System.out.println(map);
		System.out.println(map.get(781));
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.put(101,"Jigar");
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
}
