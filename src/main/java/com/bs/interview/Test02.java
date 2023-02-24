package com.bs.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test02 {

	public static void main(String[] args) {
		String str = "nikhil aaa sd";

		str = str.replaceAll(" ", "");
		String[] split = str.split("");

		if (str != null || str.length() != 0) {
//			Map<String, Long> collect = Arrays.stream(split)
//					.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
//			System.out.println(collect);
//			
			LinkedHashMap<String , Integer> map2=new LinkedHashMap<>();
			for (int i = 0; i < split.length; i++) {
				if(map2.containsKey(split[i])) {
					map2.put(split[i], map2.get(split[i])+1);
				}else {
					map2.put(split[i], 1);
				}
			}
			System.out.println(map2);
			for (Map.Entry<String, Integer> map1 : map2.entrySet()) {
				if (map1.getValue() == 1 ) {
					System.out.println(map1.getKey());
					break;
//					continue;
				}
				if (map1.getValue() == 2) {
					System.out.println(map1.getKey());
					break;
//					continue;
				}
			}

//			for (Map.Entry<String, Integer> map3 : map2.entrySet()) {
//				if (map3.getValue() == 2) {
//					System.out.println(map3.getKey());
//					break;
//				}
//			}
			
			
			
			

		}

	}

}
