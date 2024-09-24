package com.hw4.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw4.model.dto.Book;

public class BookService {
	List<Book> bookList = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	
	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public BookService() {}

	public BookService(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}
	
	public void displayMenu() {
		System.out.println("===도서 목록 프로그램===");
		System.out.println();
		System.out.println("1. 도서 등록");
		System.out.println();
		System.out.println("2. 도서 조회");
		System.out.println();
		System.out.println("3. 도서 수정");
		System.out.println();
		System.out.println("4. 도서 삭제");
		System.out.println();
		System.out.println("5. 즐겨찾기 추가");
		System.out.println();
		System.out.println("6. 즐겨찾기 삭제");
		System.out.println();
		System.out.println("7. 즐겨찾기 조회");
		System.out.println();
		System.out.println("8. 추천도서 뽑기");
		System.out.println();
		System.out.println("0. 프로그램 종료");
		System.out.println();
	}
	
	public void addBook() {
		System.out.println("======도서 등록======");
		System.out.println();
		System.out.print("도서 번호 : ");
		String bookNum = sc.next();
		sc.nextLine();
		System.out.println();
		System.out.print("도서 제목 : ");
		String bookName = sc.nextLine();
		System.out.println();
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		System.out.println();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		System.out.println();
		System.out.print("도서 출판사 : ");
		String publish = sc.next();
		System.out.println();
		
		bookList.add(new Book(bookNum, bookName, author, price, publish));
		
		System.out.println("등록 완료");
	}
	
	public void displayBooks() {
		System.out.println();
		for(Book book : bookList) {
			System.out.printf("%s번 도서 : [도서제목 : %s / 도서저자 : %s / 도서가격 : %d / 출판사 : %s\n"
					, book.getBookNum(), book.getBookName(), book.getAuthor(), book.getPrice(), book.getPublish());
			System.out.println();
		}
	}
	
	public void editBook() {
		System.out.println();
		System.out.println("========도서 수정========");
		System.out.println();
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		String bookNum = sc.next();
		System.out.println();
		System.out.println("1. 도서명");
		System.out.println();
		System.out.println("2. 도서 저자");
		System.out.println();
		System.out.println("3. 도서 가격");
		System.out.println();
		System.out.println("4. 도서 출판사");
		System.out.println();
		System.out.println("0. 수정 종료");
		System.out.println();
		System.out.print("어떤 정보를 수정하시겠습니가?");
		int input = sc.nextInt();
		
		System.out.println();
		
		switch(input) {
		case 3 : 
			System.out.println("=====도서 가격 수정=====");
			System.out.println();
			System.out.print("수정할 가격을 입력하세요 : ");
			int price = sc.nextInt();
			for(Book book : bookList) {
				if(book.getBookNum().equals(bookNum)) {
					book.setPrice(price);
					System.out.println();
					System.out.println("수정 완료");
					System.out.println();
					break;
				}
			}
		}
	}
}
