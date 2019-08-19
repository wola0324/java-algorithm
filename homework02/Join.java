package homework02;

import java.util.Scanner;
public class Join {

   public static void main(String[] args) {
      /*to. 개발자님
여기는 비트헬스 입니다.
입력받을 정보는 아래와 같습니다.
값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
프로그램을 보여주세요

=== 회원가입 ===
아이디 : 
비밀번호 : 
이름 : 
생년월일(예) 1980-01-01 : 
성인여부(성인true,미성년false) : 
키(소수점 첫째자리까지) :
몸무게(소수점 첫째자리까지) : 
혈액형(A) : 

입력이 종료되면 ...아래처럼 보이게 해주세요

=== 회원정보 ===
아이디 : hong
비밀번호 : 1234
이름 : 홍길동
생년월일(예) 1990-05-05 : 
성인여부(성인true,미성년false) : 성인
키(소수점 첫째자리까지) : 178.5 cm
몸무게(소수점 첫째자리까지) : 75kg
혈액형(A) : B형
*/
      Scanner scan = new Scanner(System.in);
      System.out.println("아이디는 무엇 입니까?");
      String id = "";
      id = scan.next();
      System.out.println("비밀번호는 무엇 입니까?");
      String pass = "";
      pass = scan.next();
      System.out.println("이름은 무엇 입니까?");
      String name = "";
      name = scan.next();
      System.out.println("생년월일은 무엇 입니까?");
      String birth = "";
      birth = scan.next();
      System.out.println("성인이면 'true', 미성년이면'false'를 입력하세요?");
      String adult = "";
      adult = scan.next();
      System.out.println("키는 몇 cm입니까 입니까? (소수 첫째자리까지)");
      double cm = 0;
      cm = scan.nextDouble();
      System.out.println("몸무게는 몇 kg입니까? (소수 첫째자리까지)");
      double kg = 0;
      kg = scan.nextDouble();
      System.out.println("혈액형은 무엇입니까?");
      String blood = "";
      blood = scan.next();
      
      System.out.println("=== 회원정보 ===");
      System.out.println("아이디 : " + id);
      System.out.println("비밀번호 : " + pass);
      System.out.println("이름 : " + name);
      System.out.println("생년월일 : " + birth);
      System.out.println("성인여부 : " + adult);
      System.out.println("키 : " + cm + "cm");
      System.out.println("몸무게 : " + kg + "kg");
      System.out.println("혈액형 : " + blood + "형");
      
   }

}