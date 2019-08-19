package study04;
import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while (true) {
			System.out.println("0.종료  1.BMI 2.은행");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			
			
			case 1 : 
				System.out.println("BMI : 이름, 키, 몸무게 입력");
				String name = scanner.next();
				double height = scanner.nextDouble();
				double weight = scanner.nextDouble();
				String result = student.getBmi(name, height, weight);
				System.out.println(result);
				break;
				
			case 2 :
				System.out.println("이름, 주소, 나이, 은행잔고, 신용도");
				name = scanner.next();
				String addr = scanner.next();
				int age = scanner.nextInt();
				int money = scanner.nextInt();
				String shin = scanner.next();
				result = student.daeChul(name, addr, age, money, shin);
				
				//이름, 주소, 나이, 은행잔고, 신용도
				//결과가 뭘 넣든간에 1억 대출
				System.out.println("1억 대출");
				break;
			}
		}

	}

}
