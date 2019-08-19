package homework02;

import java.util.Scanner;
public class ArithmeticCalculator {

   public static void main(String[] args) {
      /* To. 개발자님
      프로그램을 하나 개발해야 합니다.
      교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
      복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
      몫과 나머지값으로 출력하면 된답니다.
      출력결과물은 예를 들어
      5 + 5 = 10
      2 - 7 = -5
      이렇게 되고,
      10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
      그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
       */
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
      
      if (c == 1) {
         int d = 0;
         d = a + b;
         System.out.println(a + "+" + b + "=" + d );
      } else if (c == 2) {
         int d = 0;
         d = a - b;
         System.out.println(a + "-" + b + "=" + d );
      } else if (c == 3) {
         int d = 0;
         d = a * b;
         System.out.println(a + "*" + b + "=" + d );
      } else if (c == 4) {
         int d = 0;
         int e = 0;
         d = a / b;
         e = a % b;
         System.out.println(a + "/" + b + "=" + d + "["+ e +"]");
      } else {
      System.out.println("잘 못 입력했습니다.");
      }
   }
}

