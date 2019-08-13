package homework01;
import java.util.Scanner;
import java.util.Random;
public class homework081302 {
	public static void main(String [] args) {
		Random abc = new Random();
		Scanner scan = new Scanner(System.in);
		int dice = 0;
        dice = abc.nextInt(3)+1;
        System.out.println("dice값=" + dice);
        String qwe = "";
        
        String zxc = "";
        zxc = scan.next();
        
        String answer = "";
        
        //1. 가위 2, 바위 3.보
        switch (zxc) {
        case "가위" : 
        	switch(dice){
        	case 1 : answer = "비겼습니다."; break; 
        	case 2 : answer = "졌습니다."; break;  
        	case 3 : answer = "이겼습니다."; break; 
        }; break;
        case "바위" : 
        	switch(dice){
    		case 1 : answer = "이겼습니다." ; break;
    		case 2 : answer = "비겼습니다." ; break;
    		case 3 : answer = "졌습니다." ; break;
        }; break;
        case "보" : 
        	switch(dice){
    		case 1 : answer = "졌습니다." ; break;
    		case 2 : answer = "이겼습니다." ; break;
    		case 3 : answer = "비겼습니다." ; break;
        }; break;
        
        }System.out.println(answer);
		
	}
}
