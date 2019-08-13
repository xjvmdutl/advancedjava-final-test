package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		Arithmetic ari;
		switch(operation) {
		case "*":
			ari = new Mul();
			System.out.println(ari.calculate(a, b));
			break;
		case "+":
			ari = new Add();
			System.out.println(ari.calculate(a, b));
			break;
		case "-":
			ari = new Sub();
			System.out.println(ari.calculate(a, b));
			break;
		case "/":
			ari = new Div();
			System.out.println(ari.calculate(a, b));
			break;
		default:
			System.out.println("연산자가 없습니다.");
			break;
		}
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
	}
}
