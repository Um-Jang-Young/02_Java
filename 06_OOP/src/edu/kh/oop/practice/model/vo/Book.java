package edu.kh.oop.practice.model.vo;

/*
- title : String // 도서명
- price : int // 가격
- discountRate : double // 할인율
- author : String // 저자명
+ Book()
+ Book(title:String, price:int,
discountRate:double, author:String)
+ toString() : String
*/
public class Book {
	// 필드
	private String title; //도서명
	private int price; //가격
	private double discountRate; //할인율
	private String author; // 저자명
	
	// 생성자
	public Book() { // 기본생성자(ctrl + space + enter)
		
	}
	
	// 매개변수 생성자
	// alt + shift + s -> Generate Constructor using Fields.. -> generate
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	// 메서드
	// getter / setter
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	// 어노테이션 : 컴파일러용 주석
	// Overriding : 재정의(메서드)
	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	}
	
}

/*

현실 객체 : 자신의 속성(값, 데이터)과 기능(동작, 행동)이 다른것들과 구분하여 식별 가능한 것을 말함
객체 지향 언어 : 현실세계에 있는 속성과 기능을 객체로 정의하고 상호작용하는 것을 프로그래밍으로 작성함
자바 객체 : new 키워드를 통해서 heap영역에 객체를 생성하는 것을 말함
class : 클래스의 맴버 변수 + 메서드의 집합, 설계도 또는 빵틀이라고도 함.
new 연산자 : heap 메모리 영역에 객체를 생성하겠다는 의미
추상화 : 객체의 공통된 부분을 속성 및 기능을 추출
캡슐화 : 객체의 공통된 속성을 추출하고 외부로 부터의 접근을 보호하기위한 개념 
캡슐화 원칙 : 캡슐화는 객체의 맴버 변수 권한을 private으로 만들고 접근을 위한 getter / setter 메서드 구현을 말함
메서드/기능의 '정의'란 : 메서드/기능은 객체의 동작과 관련된 것을 작성함을 말함
메서드의 '호출' 이란 : 객체가 기능을 동작시키는 것을 말함
return : 함수를 종료하고 호출한 부분으로 돌아가는 키워드, 반환값이 있다면 반환값을 가지고 돌아감

public String ex1() {
    return "Hi";
}

위 메서드 상세히 해석 : 접근권한은 pulbic으로 프로젝트 내 어디서든 호출가능하고 
                        메서드명은 ex1이며 문자열 Hi를 반환해주는 기능을 수행함 

*/