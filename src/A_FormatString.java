
public class A_FormatString
{

	public static void main(String[] args)
	{
		int age = 20;
		double height = 178.2;
		String name = "Hong Gil Dong";
		// printf에 들어갈 변수-상수는 미리 정의
		
		System.out.printf(" name: %s \n", name); // %s: String -- 그나마 실용적
		System.out.printf(" age: %d \n height: %e \n\n", age, height); // %d: deximal, %e: e표기법 (10의 승수 표현)
		
		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77); // %d: deximal, %o: octol, %x: hexa
		System.out.printf(" %g \n", 0.00014); // %g: e(%e), 또는 실수(!%) 표현
		System.out.printf(" %g \n", 0.000014);
	

	}

}
