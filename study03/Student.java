package study03;
import java.util.Scanner;
public class Student {
// 1. BMI, 2.Ranking, 3. HowMuch, 4.ReportCard
	public String getBmi(String name, double kg, double cm, double bmi) {
		
	      bmi = kg / (cm/100 * cm/100);
	      String eval = "";
	      if (bmi > 30.0) {
	    	  eval = "고도비만";
	         
	      } else if (bmi > 25.0) {
	    	  eval = "비만";
	      } else if (bmi > 23.0) {
	    	  eval = "과체중";
	      } else if(bmi > 18.5) {
	    	  eval = "정상";
	      } else {
	    	  eval = "저체중";
	      }
	      String result = String.format("%s의 bmi는 %s입니다.",name,bmi);
		return result;
	      
	   }

	
	public void getRank() {
		Scanner scan = new Scanner(System.in);
	      System.out.println("A 선수의 기록을 입력하세요");
	      double a = 0;
	      a = scan.nextInt();
	      System.out.println("B 선수의 기록을 입력하세요");
	      double b = 0;
	      b = scan.nextInt();
	      System.out.println("C 선수의 기록을 입력하세요");
	      double c = 0;
	      c = scan.nextInt();
	      
	      System.out.println("###### 성적 랭킹 #######");
	      System.out.println("");
	      
	      if (a<b) {
	         if (a<c) {
	            if (b<c) {
	               //abc
	               System.out.println("1등 : A 선수기록 (" + a + "초)");
	               System.out.println("2등 : B 선수기록 (" + b + "초)");
	               System.out.println("3등 : C 선수기록 (" + c + "초)");
	            } else {
	               //acb
	               System.out.println("1등 : A 선수기록 (" + a + "초)");
	               System.out.println("2등 : C 선수기록 (" + c + "초)");
	               System.out.println("3등 : B 선수기록 (" + b + "초)");
	            }
	         }
	         else {
	            //cab
	            System.out.println("1등 : C 선수기록 (" + c + "초)");
	            System.out.println("2등 : A 선수기록 (" + a + "초)");
	            System.out.println("3등 : B 선수기록 (" + b + "초)");
	         }
	      } else if (b<a) {
	         if (b<c) {
	            if (a<c) {
	               //bac
	               System.out.println("1등 : B 선수기록 (" + b + "초)");
	               System.out.println("2등 : A 선수기록 (" + a + "초)");
	               System.out.println("3등 : C 선수기록 (" + c + "초)");
	            }else {
	               //bca
	               System.out.println("1등 : B 선수기록 (" + b + "초)");
	               System.out.println("2등 : C 선수기록 (" + c + "초)");
	               System.out.println("3등 : A 선수기록 (" + a + "초)");
	            }
	         }
	         else {
	            //cba
	            System.out.println("1등 : C 선수기록 (" + c + "초)");
	            System.out.println("2등 : B 선수기록 (" + b + "초)");
	            System.out.println("3등 : A 선수기록 (" + a + "초)");
	         }
	      }
	}   // 동사로 써야한다.
	public void HowMuch() {
		Scanner scan = new Scanner(System.in);
	      System.out.println("얼마에요?");
	      int money = 0;
	      money = scan.nextInt();
	      System.out.println(money +"원 입니다.");
	      System.out.println("몇 개 드릴까요?");
	      int num = 0;
	      num = scan.nextInt();
	      System.out.println("얼마에요?");
	      
	      System.out.println(num +"개 주세요.");
	      int pay = 0;
	      pay = money * num;
	      System.out.println("총 금액은 "+ pay + "원 입니다.");
	      System.out.println("비싸요, 10% 깎아주세요.");
	      int dc = 0;
	      dc = pay / 10;
	      int dcpay = 0;
	      dcpay = pay - dc;
	      System.out.println("그럼 "+ dcpay + "원만 주세요.");


	}   	//동사면 get안써도 된다.
	public void getReportCard() {
		 Scanner scan = new Scanner(System.in);
	      System.out.println("학생 이름을 입력해주세요.");
	      String name = "";
	      name = scan.next();
	      System.out.println("국어 성적을 입력해주세요.");
	      int korea = 0;
	      korea = scan.nextInt();
	      System.out.println("영어 성적을 입력해주세요.");
	      int eng = 0;
	      eng = scan.nextInt();
	      System.out.println("수학 성적을 입력해주세요.");
	      int math = 0;
	      math = scan.nextInt();
	      
	      int add = 0;
	      add = korea + eng + math;
	      int aver = 0;
	      aver = add / 3;
	      String result = "";
	      if(aver >= 90) {
	         result = "장학생";
	      } else if (aver >= 70) {
	         result = "합격";
	      } else if(aver < 70) {
	         result = "불합격";
	      }
	      System.out.println("학생           국어          영어          수학          총점          평균          합격여부");
	      System.out.println("=================================================");
	      System.out.println(name +"        "+ korea +"     "+ eng +"     "+ math +"     "+ add +"     "+ aver +"     "+ result);
	   

	}
	
}
