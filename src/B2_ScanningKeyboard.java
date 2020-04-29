import java.util.Scanner;

public class B2_ScanningKeyboard
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); // 입력함
		
		System.out.println("숫자 + 엔터");
		int num1 = sc.nextInt(); // 엔터, 스페이스, 탭 으로 구분 가능
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);
		
		sc.close();	

	}

}

// 연결 대상에 의존적이지 않은 코드의 작성이 가능하다~