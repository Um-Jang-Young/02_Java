package edu.kh.inheritance.model.dto;
// 상속방법 : 자식   extends  부모
public class Student extends Person {
	// Student 클래스에 Person 클래스 내용을 연장한다
	// == Student 클래스에 Person 클래스의 필드, 메서드를 
	// 추가하여 확장한다

	// 속성(필드)
	/*
	private String name;
	private int age;
	private String nationlity;
	*/
	private int grade; // 학년
	private int classRoom; // 반
	
	//{
		// 초기화블록
		// : 객체가 생성될 때 변수들을 초기화하기 위해서 사용
	//}
	
	
	public Student() {}
	
	
	
	
	public Student(String name, int age, String nationality, 
						int grade, int classRoom) {
		
		// 왜 안될까??
		// -> this 참조변수는 본인 자신만을 의미함
		// -> 상속을 받았어도, name, age, nationality는 부모의 고유 필드이기떄문에
		//    자식인 Student에서 this 참조변수를 이용해 직접 접근 불가
		//this.name = name;
		//this.age = age;
		//this.nationality = nationality;
		
		// super(); : 부모의 기본생성자
		// super(매개변수...); : 부모의 매개변수생성자
		super(name, age, nationality);
		this.grade = grade;
		this.classRoom = classRoom;
	}




	// 기능(메서드)
	/*
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationlity() {
		return nationlity;
	}
	public void setNationlity(String nationlity) {
		this.nationlity = nationlity;
	}
	*/
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + grade + " / " + classRoom;
	}
	
}
