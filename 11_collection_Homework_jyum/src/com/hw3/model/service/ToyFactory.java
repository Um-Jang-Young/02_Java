package com.hw3.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.hw3.model.dto.Toy;

public class ToyFactory {
	//private Set<Toy> set = new HashSet<Toy>();
	
	public void displayAllToy(Toy t) {
		// Set에 저장된 객체를 이용해서 List를 생성
		//List<Toy> list = new ArrayList<Toy>(set);
				
		//for(int i = 0; i < list.size(); i++) {
			System.out.printf("1. 이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 : %s / "
					, t.getToyName(), t.getPrice(), t.getColor(), t.getAge(), t.getMadeDay());
			Set<Integer> set = t.getMaterial().keySet();
			Iterator<Integer> it = set.iterator();
			while(it.hasNext()) {
				// 다음 요소가 있으면 반복, 없으면 멈춤
				
				// E Iterator.next() : 다음 요소를 꺼내와 반환
				Integer temp = it.next();
				System.out.println(t.getMaterial().get(temp));
			}
//			for(Integer key : set) {
//				System.out.print(t.getMaterial().get(key));
//			}
		//}
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
}
