package com.hw3.run;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.hw3.model.dto.Toy;
import com.hw3.model.service.ToyFactory;

public class ToyRun {

	public static void main(String[] args) {
		ToyFactory toyFactory = new ToyFactory();
		Set<Toy> set = new HashSet<Toy>();
		
		HashMap map = new HashMap<Integer, String> ();
		map.put(1, "면직물");
		map.put(2, "플라스틱");
		Toy t1 = new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", map);
		toyFactory.displayAllToy(t1);
//		while(true) {
//			toyFactory.displayMenu();
//		}
		

	}

}
