package com.hw3.run;

import java.util.HashSet;
import java.util.Set;

import com.hw3.model.dto.Toy;
import com.hw3.model.service.ToyFactory;

public class ToyRun {

	public static void main(String[] args) {
		ToyFactory toyFactory = new ToyFactory();
		toyFactory.setMaterialMap();
		Set<String> material = new HashSet<String> ();
		material.add("면직물");
		material.add("고무");
		toyFactory.addToy(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", material));
		material.clear();
		material.add("면직물");
		material.add("플라스틱");
		toyFactory.addToy(new Toy("허기위기", 5, 12000, "파란색", "19940312", material));
		material.clear();
		material.add("면직물");
		material.add("플라스틱");
		toyFactory.addToy(new Toy("키시미시", 5, 15000, "분홍색", "19940505", material));
		material.clear();
		material.add("면직물");
		material.add("플라스틱");
		toyFactory.addToy(new Toy("캣냅", 8, 27000, "보라색", "19960128", material));
		material.clear();
		material.add("면직물");
		material.add("플라스틱");
		material.add("고무");
		toyFactory.addToy(new Toy("파피", 12, 57000, "빨간색", "19931225", material));

		while(true) {
			toyFactory.displayMenu();
			System.out.print("선택 : ");
			int input = toyFactory.getSc().nextInt();

			switch(input) {
			case 1 : toyFactory.displayAllToy(); break;
			case 2 : toyFactory.setAddToy(); break;
			case 3 : toyFactory.setRemoveToy(); break;
			case 4 : toyFactory.displayMadeDate(); break;
			}
			
		}
		

	}

}
