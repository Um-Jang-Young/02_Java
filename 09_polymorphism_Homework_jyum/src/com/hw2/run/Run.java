package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {
	
	public static void main(String[] args) {
		Company c = new Company(10);
		ManagementSystem company = c;
		
		Prison p = new Prison(10);
		ManagementSystem prison = p;
		
		company.addPerson(new Employee("EMP001", "유재석", "기획팀"));
		company.addPerson(new Employee("EMP002", "정형돈", "개발팀"));
		
		System.out.println("전체 직원 명단 : ");
		company.displayAllPersons();
		
		System.out.println("========================================");
		
		prison.addPerson(new Prisoner("1205", "정준하", "밥도둑"));
		prison.addPerson(new Prisoner("0705", "박영수", "웃음연쇄살인"));
		
		System.out.println("전체 수감자 명단 : ");
		prison.displayAllPersons();
		
		System.out.println("========================================");
		
		company.removePerson("EMP001");
		prison.removePerson("1205");
		
		System.out.println("========================================");
		
		System.out.println("전체 직원 명단 : ");
		company.displayAllPersons();
		
		System.out.println("전체 수감자 명단 : ");
		prison.displayAllPersons();
	}
	
}
