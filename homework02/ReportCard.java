package homework02;
import java.util.Scanner;
public class ReportCard {

   public static void main(String[] args) {
      /*
       * To. 개발자님
  성적표 프로그램 을 하나 개발해야 합니다.
 교수는 학생과 국어, 영어, 수학점수만 입력하면
 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
 오더는 다음과 같이 화면에 출력하라고 합니다.
 
학생           국어        영어        수학        총점        평균        합격여부
 =======================================================
 홍길동     90       90      90     270      90       (장학생)

 합격여부는 다음과 같다고 합니다.
 평균이 90점 이상이면 장학생
 0점 이상 90점미만 이면 합격
 70미만이면 불합격이라고 하네요.
 단) 평균에서 소수점이하는 절삭입니다.*
       */
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