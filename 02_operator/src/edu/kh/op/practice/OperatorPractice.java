package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice { // 기능 제공용 클래스
	// 매서드 ..
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", input2 / input1);
		System.out.printf("남은 사탕 개수 : %d\n", input2 % input1);
		
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		System.out.print("반(정수만) : ");
		int classNum = sc.nextInt();
		System.out.print("번호(정수만) : ");
		int stdNum = sc.nextInt();
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.println();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다\n", grade, classNum, stdNum, name, gender, score );
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int score1 = sc.nextInt(); // 국어 점수
		System.out.print("영어 : ");
		int score2 = sc.nextInt(); // 영어 점수
		System.out.print("수학 : ");
		int score3 = sc.nextInt(); // 수학 점수
		
		int sum = score1 + score2 + score3;
		double avg = (double)sum / 3;
		
		System.out.println();
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
	}
	

	
	
}
