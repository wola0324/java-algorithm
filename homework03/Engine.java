package homework03;

import java.util.Scanner;

import study04.Student;

public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while (true) {
			System.out.println("0.종료  1.AC 2.BMI");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 :
				
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요.");
			int a = 0;
			a = scan.nextInt();
	      
			System.out.println("숫자를 입력하세요.");
			int b = 0;
			b = scan.nextInt();
	      
			System.out.println("연산자를 입력하세요. 1.+ 2.- 3.* 4./");
			int c = 0;
			c = scan.nextInt();
			
			String result = student.getArithmeticCalculator(a, b, c);
			System.out.println(result);
			break;
			
			case 2 : 
				
			
			
			
			}
		}
}
}
