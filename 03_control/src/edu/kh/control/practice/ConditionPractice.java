package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice { // 기능 작성 클래스

	Scanner sc = new Scanner(System.in);
	
	
	public void practice1(){
		// 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		// 짝수가 아니면 “홀수입니다.“를 출력하세요.
		// 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		String result;
		
		if(input >= 0) {
			if(input % 2 == 0) {
				result = "짝수입니다";
			} else {
				result = "홀수입니다";
			}
		} else {
			result = "양수만 입력해주세요";
		}
		
		System.out.println(result);
	}
	
	
	public void practice2(){
		
		// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		// 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		// (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

		// 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		// 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		int sum = 0;
		double avg = 0;
		
		sum = korean + english + math;
		avg = (double)sum / 3;
		
		if((korean > 40 && english > 40 && math > 40) && avg >= 60.0) {
		
			System.out.printf("국어 : %d\n", korean);
			System.out.printf("영어 : %d\n", english);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	
	public void practice3(){
		
		// 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
		// 잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
			//case 1, 3, 5, 7, 8, 10, 12 :
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.printf("%d월은 31일까지 있습니다.\n", month);
				break;
			//case 4, 6, 9, 11 : 
			case 4 : case 6: case 9: case 11 : 
				System.out.printf("%d월은 30일까지 있습니다.\n", month);
				break;
			case 2 :
				System.out.printf("%d월은 29일까지 있습니다.\n", month);
				break;
			default : 
				System.out.printf("%d월은 잘못 입력된 달입니다.\n", month);
				break;
		}
	}
	
	
	public void practice4(){
		//메소드 명 : public void practice4(){}
		//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		//저체중/정상체중/과체중/비만을 출력하세요.

		//BMI = 몸무게 / (키(m) * 키(m))
		//BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		//BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		//BMI가 30이상일 경우 고도 비만
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double tall = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		String result;
		
		double bmi = weight / (tall * tall);
		
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi >= 18.5 && bmi < 23) {
			result = "정상체중";
		} else if(bmi >= 23 && bmi < 25) {
			result = "과체중";
		} else if(bmi >= 25 && bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
		
	}
	
	
	public void practice5(){
		//메소드 명 : public void practice5(){}
		//중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		//평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		//이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		//70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		System.out.print("중간 고사 점수 : ");
		int middleScoreInput = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finalScoreInput = sc.nextInt();
		System.out.print("과제 점수 : ");
		int homeWorkScoreInput = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int attendCntInput = sc.nextInt();
		
		String result;
		
		if(attendCntInput <= 14) {
			result = "Fail [출석 횟수 부족 ("+attendCntInput+"/20)]";
		} else {
			System.out.println("===================결과===================");
			double middleScore = middleScoreInput * 0.2;
			double finalScore = finalScoreInput * 0.3;
			double homeWorkScore = homeWorkScoreInput * 0.3;
			double attendCntScore = ((double)attendCntInput / 20) * 20;
			double sum = middleScore + finalScore + homeWorkScore + attendCntScore;
			System.out.println("중간 고사 점수(20) : " + middleScore);
			System.out.println("기말 고사 점수(30) : " + finalScore);
			System.out.println("과제 점수             : " + homeWorkScore);
			System.out.println("출석 점수             : " + attendCntScore);
			System.out.println("총점 : " + sum);
			
			if(sum < 70) {
				result = "Fail [점수 미달]";
			} else {
				result = "Pass";
			}
		}
		
		System.out.println(result);
		
	}
	
	
}
