package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{
	private Employee[] employees;
	private int employeeCount;
	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		if(employeeCount == employees.length) {
			System.out.println("인원이 모두 충원되었습니다");
			return;
		}
		
		System.out.print("직원이 추가되었습니다 - ");
		employees[employeeCount] = (Employee)person;
		
		System.out.println(employees[employeeCount].getInfo());
		
		employeeCount++;
		
	}

	@Override
	public void removePerson(String id) {
		
		boolean flag = true;
		Employee temp = null;
		
		for(int i = 0; i < employeeCount; i++) {
			if(employees[i].getId().equals(id)) {
				temp = employees[i];
				for(int j = i; j < employeeCount - 1; j++) {
					employees[j] = employees[j+1];
				}
				employees[employeeCount-1] = null;
				employeeCount--;
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 직원을 찾을 수 없습니다");
		} else {
			System.out.print("직원이 삭제되었습니다 ");
			System.out.println(temp.getInfo());
		}
		
	}

	@Override
	public void displayAllPersons() {
		for(int i = 0; i < employeeCount; i++) {
			System.out.println(employees[i].getInfo());
		}
		
	}
	
}
