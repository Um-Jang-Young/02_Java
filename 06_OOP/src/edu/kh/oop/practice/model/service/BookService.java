package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력

		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력

		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 7) 할인된 가격 = 가격 - (가격 * 할인율)
		/*
		 * =============================
			도서명 = C언어
			할인된 가격 = 27000원
			도서명 = 자바의정석
			할인된 가격 = 24000원
		 */
		
		Book b1 = new Book();
		Book b2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println("=============================");
		
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(b1.toString());
		
		System.out.println("=============================");
		
		System.out.println("도서명 = " + b1.getTitle());
		
		int price = (int)(b1.getPrice() - (b1.getPrice() * b1.getDiscountRate()));
		
		System.out.println("할인된 가격 = " + price + "원");
		
		System.out.println("도서명 = " + b2.getTitle());
		
		int price2 = (int)(b2.getPrice() - (b2.getPrice() * b2.getDiscountRate()));
		
		System.out.println("할인된 가격 = " + price2 + "원");
		
	}
	
}
