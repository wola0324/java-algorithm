package homework02;

import java.util.Scanner;

public class TimeCalc {

   public static void main(String[] args) {
      /*
       *To.개발자님께
      초단위로 알려주는 시험이 있는데
      이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
      혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
      그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠. */
      Scanner scan = new Scanner(System.in);
      System.out.println("알고 싶은 시간을 숫자로 입력하세요.");
      
      int second = 0;
      second = scan.nextInt();
      
      if (second < 60) {
         
         System.out.println(second + "초 입니다.");
         
      } else if (second < 3600) {
         
         int min1 = 0;
         min1 = second / 60;
         int second1 = 0;
         second1 = second % 60; 
         
         System.out.println(min1 +"분 " + second1 + "초 입니다.");
         
      } else if (second < 86400) {
         
         int hour = 0;
         int min2 = 0;
         int second2 = 0;
         hour = second / 3600;
         min2 = (second - hour*3600) / 60;
         second2 = second % 60;
         
         System.out.println(hour + "시간 " + min2 + "분 "+ second2 + "초 입니다.");
         
         
         
         
      } else  {
         System.out.println("24시간이 넘었습니다.");
      }

   }

}