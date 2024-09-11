package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	private Prisoner[] prisoners;
	private int prisonerCount;
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		if(prisonerCount == prisoners.length) {
			System.out.println("인원이 모두 충원되었습니다");
			return;
		}
		
		System.out.print("직원이 추가되었습니다 - ");
		prisoners[prisonerCount] = (Prisoner)person;
		
		System.out.println(prisoners[prisonerCount].getInfo());
		
		prisonerCount++;
	}

	@Override
	public void removePerson(String id) {
		boolean flag = true;
		Prisoner temp = null;
		
		for(int i = 0; i < prisonerCount; i++) {
			if(prisoners[i].getId().equals(id)) {
				temp = prisoners[i];
				for(int j = i; j < prisonerCount - 1; j++) {
					prisoners[j] = prisoners[j+1];
				}
				prisoners[prisonerCount-1] = null;
				prisonerCount--;
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 수감자를 찾을 수 없습니다");
		}  else {
			System.out.print("수감자가 삭제되었습니다 ");
			System.out.println(temp.getInfo());
		}
	}

	@Override
	public void displayAllPersons() {
		for(int i = 0; i < prisonerCount; i++) {
			System.out.println(prisoners[i].getInfo());
		}
	}
	
	
}
