package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice { // 기능용 클래스

	
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1(){
		/* 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
         * 단, 입력한 수는 1보다 크거나 같아야 합니다.
         * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * */
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for(int i = 1; i <= num; i++) {
				System.out.print(i+" ");
			}
		}
	}
	
	
	public void practice2(){
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
         * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 
		 * 
		 * */
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for(int i = num; i >= 1; i--) {
				System.out.print(i+" ");
			}
		}
		
	}
		
	public void practice3(){
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		 * */
		
		System.out.print("정수를 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i < num; i++) {
			System.out.print(i + " + ");			
			sum += i;
		}
		System.out.print(num + " = " + (sum + num));
	}
	
	
	public void practice4(){
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
         * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * */
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			int min = 0;
			int max = 0;
			
			if(num1 >= num2) {
				min = num2;
				max = num1;
			} else {
				min = num1;
				max = num2;
			}
			
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	
	public void practice5(){
		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 * */
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("==== " + num + "단" + " ====");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
	}
	
	
	public void practice6(){
		/*
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
         * 단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		 * */
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요");
		} else {
			for(int i = num; i <= 9; i++) {
				System.out.println("==== " + i + "단" + " ====");
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
			}
		}
		
	}
	
		
	public void practice7(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void practice8(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = num-i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void practice9(){
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = i; j <= num - 1; j++)
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	
	public void practice10(){
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = num-i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void practice11(){
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int l = 1;
		
		for(int i = 0; i < num; i++) {
			for(int j = num-i; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= l; k++) {
				System.out.print("*");	
			}
			l += 2;
			System.out.println();
		}
		
		
		
	}
	
	
	public void practice12(){
		/*
		 * *****
           *   *
           *   *
           *   *
           *****
		 */
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++)
			System.out.print("*");
		System.out.println();
		for(int i = 1; i <= num-2; i++) {
			System.out.print("*");
			for(int j = 1; j <= num-2; j++) {
				System.out.print(" ");
			}
			System.out.print("*\n");	
		}
		for(int i = 1; i <= num; i++)
			System.out.print("*");
		
	}
	
	
	public void practice13(){
		/*
		 * 1부터 사용자에게 입력 받은 수까지 중에서
         * 1) 2와 3의 배수를 모두 출력하고
         * 2) 2와 3의 공배수의 개수를 출력하세요.
         *
         * * ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
         * 모두 나머지가 0이 나오는 수
		 * */
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		
		// 2와 3의 배수 모두 출력
		for(int i = 2; i <= num; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		
		System.out.println();
		System.out.println("count : " + count);
		
	}
	
	
	
	
	
	
}
