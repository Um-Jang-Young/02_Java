package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Tiger tiger = new Tiger("호랑이");
		Monkey monkey = new Monkey("원숭이");
		
		zoo.addAnimal(tiger);
		zoo.addAnimal(monkey);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			zoo.displayMenu();
			System.out.print("선택 : ");
			int input = sc.nextInt();
			
			if(input == 2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				zoo.showAnimals();
			}
		}

	}

}
