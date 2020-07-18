package com.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest2 {
	
	public static void prn(Map map) {
		//모든 values를 Collection에 담아서 리턴.
		Collection values = map.values();
		System.out.println(values);
		
		System.out.println("===================================");
		//모든 key를 Set에 담아서 리턴.
		Set keys = map.keySet();
		System.out.println(keys);
		
		System.out.println("===================================");
		//Entry를 이용해서 출력
		Set<Entry> entry = map.entrySet();
		for(Map.Entry entrys : entry) {
			System.out.println(entrys.getKey() + " : " + entrys.getValue());
		}
	
		System.out.println("===================================");
		
		//Iterator을 이용한 출력
		Iterator<Entry> ir = entry.iterator();
		while(ir.hasNext()) {
			Entry element = ir.next();
			if(element.getValue().equals("김지후")) {
				System.out.println(element.getKey());
			}
		}
	}
	
	public static void main(String[] args) {
		
		Map map  = new HashMap();
		
		map.put(1, "윤용민");
		map.put(2, "위영석");
		map.put(3, "김지후");
		map.put(4, "배민경");
		map.put(5, "정윤식");
		map.put(6, "박건후");
		
		//key와 value값을 출력.
		System.out.println(map);
		System.out.println("===================================");
		//map에 key값이 1인 value를 출력
		System.out.println(map.get(1));
		System.out.println("===================================");
		//key값과 value값을 각각 출력.
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		System.out.println("===================================");
		
		prn(map);
	}

}
