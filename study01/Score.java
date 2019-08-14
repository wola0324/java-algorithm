package study01;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		System.out.println("학생 이름을 입력하세요.");
		Scanner name = new Scanner(System.in);
		String a = name.next();
		
		System.out.println("국어성적을 입력하세요.");
		Scanner korea = new Scanner(System.in);
		
		int b = korea.nextInt();
		
		System.out.println("영어성적을 입력하세요.");
		Scanner usa = new Scanner(System.in);
		int c = usa.nextInt();
		
		System.out.println("수학성적을 입력하세요.");
		Scanner math = new Scanner(System.in);
		int d = math.nextInt();
		
		int e = b + c + d;
		System.out.println("학생           국어          영어         수학         총점        평균        합격여부");
		System.out.println("==============================================");
		System.out.println( a +""+ b +""+ c +""+ d + e );
		
	}

}
