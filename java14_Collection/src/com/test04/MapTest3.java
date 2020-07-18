package com.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest3 {
	
	public static void prn(Map<Integer, String> map) {
		
	}
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "윤용민");
		map.put(2, "위영석");
		map.put(3, "김지후");
		map.put(4, "배민경");
		map.put(5, "정윤식");
		map.put(6, "박건후");
		
		System.out.println(map);
		
		Set<Entry<Integer ,String>> entry = map.entrySet();
		for(Map.Entry<Integer, String> m : entry) {
			System.out.println(m.getValue() + " : " + m.getKey());
		}
		System.out.println("===================================");
		System.out.println();
		
		//map은 iterator을 단독으로 사용할 수 없기 때문에 Set을 사용해서 담아주고 사용할 수 있다.
		Iterator<Entry<Integer, String>> ir = entry.iterator();
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		System.out.println("===================================");

		
		Iterator<Entry<Integer, String>> ir2 = entry.iterator();
		
		while(ir2.hasNext()) {
			Entry<Integer, String> element = ir2.next();
			if(element.getValue().equals("김지후")) {
				System.out.println(element.getKey());
			}
		}
	}

}
