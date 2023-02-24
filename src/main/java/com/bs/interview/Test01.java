package com.bs.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {

	public static void main(String[] args) {
	List<Integer> number=Arrays.asList(12,-2);
	List<Integer> sorted = number.stream().sorted().collect(Collectors.toList());
	System.out.println(sorted.get(sorted.size()-2));
	
	int firstMax=number.get(0),secondMax=0;
	
	for(int i=0;i<number.size();i++) {
		if(number.get(i)>firstMax) {
			secondMax=firstMax;
			firstMax=number.get(i);
		}
	}
//	System.out.println(firstMax);
	System.out.println(secondMax);
	
	
	
	}

}
