package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	private Product[] pro = null;
	public static int count = 0;
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new Product[10]; 
	}
	
	public void copy(Product p1, Product p2) {
		if(p2 == null) {
			return;
		}
		p1.setpId(p2.getpId());
		p1.setpName(p2.getpName());
		p1.setPrice(p2.getPrice());
		p1.setTax(p2.getTax());
	}
	
	public void mainMenu() {
		int input = 0;
		
		do {
			System.out.println("====== 제품 관리 메뉴 ======");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("3. 제품 정보 삭제");
			System.out.println("4. 제품 정보 수정");
			System.out.println("5. 제품 정보 검색");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 3 : productDelete(); break;
			case 4 : productUpdate(); break;
			case 5 : productSearch(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("메뉴를 다시 입력하세요");
			}
		} while(input != 0);
	}
	
	public void productInput() {
		if(count > 9) {
			System.out.println("제품을 추가할 수 없습니다.");
		}
		
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		System.out.print("제품명 : ");
		String pName = sc.next();
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pId, pName, price, tax);
	}
	
	public void productPrint() {
		for(int i = 0; i < count; i++) {
			System.out.println(pro[i].infomation());
		}
	}
	
	public void productDelete() {
		System.out.print("삭제할 제품번호를 입력하세요 : ");
		int pId = sc.nextInt();
		boolean flag = true;

		for(int i = 0; i < count; i++) {
			if(pro[i].getpId() == pId) {
				for(int j = i; j < count; j++) {
					copy(pro[j], pro[j+1]);
					flag = false;
				}
				pro[--count] = null;
			}
		}
		
		if(flag) {
			System.out.println("삭제할 제품정보가 존재하지 않습니다..");
		} else {
			System.out.println("제품 정보를 삭제하였습니다!");
		}
	}
	
	public void productUpdate() {
		System.out.println("수정할 정보를 입력하세요..");
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		System.out.print("제품명 : ");
		String pName = sc.next();
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		boolean flag = true;
		
		for(int i = 0; i < count; i++) {
			if(pro[i].getpId() == pId) {
				pro[i].setpId(pId);
				pro[i].setpName(pName);
				pro[i].setPrice(price);
				pro[i].setTax(tax);
				
				System.out.println("제품정보를 수정하였습니다..");
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 제품번호가 존재하지 않습니다..");
		}
		
	}
	
	public void productSearch() {
		System.out.print("검색할 제품 번호를 입력하세요 : ");
		int pId = sc.nextInt();
		boolean flag = true;
		
		for(int i = 0; i < count; i++) {
			if(pro[i].getpId() == pId) {
				System.out.println("검색한 제품 정보 입니다");
				System.out.println(pro[i].infomation());
				
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("검색한 제품의 정보가 존재하지 않습니다..");
		}
	}
}
