package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기1 {
	
	public static void main(String[] args) {
		
		// 배열 생성
		int [] grade = new int[3];
		
		// 배열에 값 넣기
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < grade.length; i++) {
			System.out.print("숫자를 입력하시오 : ");
			grade[i] = keyboard.nextInt();
		}
		
		// for문을 이용하여 배열값을 출력
		System.out.print("배열의 값은 : ");
		for(int i = 0; i < grade.length; i++) {
			if(i == grade.length - 1) {
				System.out.print(grade[i] + ".");
			}
			else {
				System.out.print(grade[i] + ",");
			}
		}
		
	}

}
