package com.hw4.run;

import com.hw4.model.dto.Book;
import com.hw4.model.service.BookService;

public class Run {

	public static void main(String[] args) {
		BookService service = new BookService();
		
		service.getBookList().add(new Book("1111", "세이노의 가르침", "세이노", 6480, "데이원"));
		service.getBookList().add(new Book("2222", "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		service.getBookList().add(new Book("3333", "역행자", "저청", 17550, "웅진지식하우스"));
		service.getBookList().add(new Book("4444", "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		service.getBookList().add(new Book("5555", "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
		
		while(true) {
			service.displayMenu();
			System.out.print("메뉴를 입력하세요 : ");
			int input = service.getSc().nextInt();
			
			if(input == 0) {
				break;
			}
			switch(input) {
			case 1 : service.addBook(); break;
			case 2 : service.displayBooks(); break;
			case 3 : service.editBook(); break;
			}	
		}
		
	}

}
