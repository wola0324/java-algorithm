package homework03;

public class Student {
	public String getArithmeticCalculator(int a , int b, int c)  {
		String result = "";
		
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
		return result;
	}
	public String getBmi(String name , int kg, int cm, int m)  {
		String result = "";
		
		return result;
	}
	public String getHowMuch(int money, int num, int pay, int dcpay)  {
		String result = "";
		return result;
	}
	public String getJoin(String id, int pass, int birth, String adult, int cm, int kg, String blood)  {
		String result = "";
		return result;
	}
	public String getLeapYear(int year)  {
		String result = "";
		return result;
	}
	public String getMonthEndDay(int flag, String eval)  {
		String result = "";
		return result;
	}
	public String getPassOrFail(String name, int korea, int eng, int math, int add, int aver)  {
		String result = "";
		return result;
	}
	public String getRanking( double a, double b, double c)  {
		String result = "";
		return result;
	}
	public String getReportCard(String id, int pass, int birth, String adult, int cm, int kg, String blood)  {
		String result = "";
		return result;
	}
	public String getTax(String name, int money, int tax, int pay)  {
		String result = "";
		return result;
	}
	public String getTimeCalc(int year)  {
		String result = "";
		return result;
	}
	
	
}
