
import java.util.Scanner;

public class ExD {

	public static void main(String[] args) {
		 
		double A, B, C, del, x , x1, x2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor de A: ");
		A = sc.nextDouble();
		System.out.print("Qual o valor de B: ");
		B = sc.nextDouble();
		System.out.print("Qual o valor de C: ");
		C = sc.nextDouble();
		
		del =  B * B - 4 * A * C;
		
		x = -B / (2 * A);
		
		x1 = (-B - Math.sqrt(del)) / (2 * A);
		
		x2 = (-B + Math.sqrt(del)) / (2 * A);
		
		if (del > 0) {
			System.out.println("Há duas soluções: ");
			System.out.printf("O resultado do x1 é : %.1f" , x1);
			System.out.printf("O resultado do x2 é : %.1f" , x2);
		} else if (del == 0) {
			System.out.println("Há uma solução: ");
			System.out.printf("O resultado do x é : %.1f" + x);
		} else {
			System.out.println("Não há solução real");
		}

}
	
}

