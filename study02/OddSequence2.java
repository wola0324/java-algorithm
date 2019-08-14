package study02;
import java.util.Scanner;
public class OddSequence2 {

	public static void main(String[] args) {
		//입력된 시작 값 부터 마지막까지의 홀수의 합
		Scanner scanner = new Scanner(System.in);
		
		
		String squence = "";
		int series = 0;
		for (int i = 1; i<=10; i++) {
			squence += i + "+";
			series += i;
		}
		System.out.println(squence + series);
	}
	
}
