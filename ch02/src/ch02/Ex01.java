package ch02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 1. Scanner를 이용해서 2자리 정수를 입력받으세요.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);	// 입력받은 문자열을 숫자로 변환

		/* 2. 입력받은 정수를 printf 메소드를 이용해서
		10진수, 8진수, 16진수로 출력하세요.*/
		System.out.printf("10진수=%d, 8진수=%o, 16진수=%x", num, num, num);
	}
}
