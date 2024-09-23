package com.hw3.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.hw3.model.dto.Toy;

public class ToyFactory {
	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toySet = new HashSet<Toy>(); 
	// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Map<Integer, String> materialMap = new HashMap<Integer, String>(); 
	// 재료가 저장되어있는 map

	
	public void displayAllToy() {
		int count = 1;
		for(Toy t : toySet) {
			System.out.printf("%d. 이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 : %s / "
					,count++, t.getToyName(), t.getPrice(), t.getColor(), t.getAge(), t.getMadeDay());
		
			Iterator<String> it = t.getMaterial().iterator();
			while(it.hasNext()) {
				String temp = it.next();
				if(it.hasNext() == false) {
					System.out.print(temp);
					break;
				} else {
					System.out.print(temp + ", ");
				}
			}
			System.out.println();
		}
	}
	
	public void setMaterialMap() {
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
	}
	
	public void setAddToy() {
		System.out.println("<새로운 장난감 추가>");
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("색상 : ");
		String color = sc.next();
		System.out.print("제조일 (YYYYMMDD 형식으로 입력 : ");
		String madeDate = sc.next();
		System.out.println("사용 가능한 재료 목록 : ");
		
		Set<Integer> set = materialMap.keySet();
		// 향상된 for문
		for(Integer key : set) {
			System.out.printf("%d : %s\n", key, materialMap.get(key));
		}
		
		Set<String> material = new HashSet<String>();
		while(true) {
			System.out.print("추가할 재료의 번호를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			char input = sc.next().charAt(0);
			
			if(input == 'q' || input == 'Q') {
				break;
			}
			
			input -= '0';
			boolean flag = true;
			for(Integer key : set) {
				if(key == (int)input) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				break;
			} else {
				System.out.println("재료가 추가되었습니다 : " + materialMap.get((int)input));
				material.add(materialMap.get((int)input));
			}
		}
		
		toySet.add(new Toy(name, age, price, color, madeDate, material));
	}
	
	public void setRemoveToy() {
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		boolean flag = true;
		for(Toy toy : toySet) {
			if(name.equals(toy.getToyName())) {
				toySet.remove(toy);
				System.out.println("장난감이 삭제되었습니다.");
				flag = false;
				break;
			} 
		}
		
		if(flag) {
			System.out.println("삭제할 장난감이 없습니다.");
		}
	}
	
	public void displayMadeDate() {
		System.out.println("제조일 순으로 장난감을 정렬");
		Comparator<Toy> dateComparator = Comparator.comparing(Toy::getMadeDay);
		List<Toy> list = new ArrayList<Toy>(toySet);
		Collections.sort(list, dateComparator);
		
		int count = 1;
		for(Toy t : list) {
			System.out.printf("%d. 이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 : %s / "
					,count++, t.getToyName(), t.getPrice(), t.getColor(), t.getAge(), t.getMadeDay());
		
			Iterator<String> it = t.getMaterial().iterator();
			while(it.hasNext()) {
				String temp = it.next();
				if(it.hasNext() == false) {
					System.out.print(temp);
					break;
				} else {
					System.out.print(temp + ", ");
				}
			}
			System.out.println();
		}
	}
	
	public void displayMenu() {
		System.out.println("<< 플레이타임 공장 >>");
		System.out.println("1. 전체 장난감 조회하기");
		System.out.println("2. 새로운 장난감 만들기");
		System.out.println("3. 장난감 삭제하기");
		System.out.println("4. 장난감 제조일 순으로 조회하기");
		System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6. 재료 추가");
		System.out.println("7. 재료 제거");
	}
	public Set<Toy> getToySet() {
		return toySet;
	}
	public void setToySet(Set<Toy> toySet) {
		this.toySet = toySet;
	}
	public Map<Integer, String> getMaterialMap() {
		return materialMap;
	}
	public void setMaterialMap(Map<Integer, String> materialMap) {
		this.materialMap = materialMap;
	}
	
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public void addToy(Toy t) {
		toySet.add(t);
	}
	
}
