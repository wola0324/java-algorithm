package study03;
import java.util.Scanner;
import study03.Student; // Student를 가져다 쓰겠다.
public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // -> 레퍼런스를 만들어라.
		Student student = new Student();
		
		int flag = 0;
		while(true) {
			
			System.out.println("메뉴 : 0.종료,  1.BMI, 2. Ranking, 3. HowMuch, 4. ReportCard");
			
			
			flag = scan.nextInt();
			switch(flag) {
			case 0 :
				System.out.println("종료"); 
				return;
			case 1 :
				System.out.println("BMI");
				
				System.out.println("이름을 입력하세요.");
			      String name = "";
			      name = scan.next();
			      
			      System.out.println("몸무게를 입력하세요.");
			      double kg = 0;
			      kg = scan.nextDouble();
			      
			      System.out.println("키를 입력하세요.");
			      double cm = 0;
			      cm = scan.nextDouble();
			      
			      double bmi = 0;
				student.getBmi(name,kg,cm, kg);                       // .은  메소드 인보케이션
				break;
			case 2 :
				System.out.println("Ranking");
				student.getRank();
				break;
			case 3 :
				System.out.println("HowMuch");
				student.HowMuch();
				break;
			case 4 :
				System.out.println("ReportCard");
				student.getReportCard();
				break;
		     
			}
		}
			
	}

}
