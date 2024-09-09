package ex_mariaeduarda;

import java.util.Scanner;

public class ExE{

	public static void main(String[] args) {
		double A, B, C, menor, meio = 0, maior;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		C = sc.nextDouble();
			
		if (A<=B && A<=C) {
			menor = A;
			if (B<=C) {
				meio = B;
				maior = C;
			} else {
				meio = C;
				maior = B;
			}
		} else if (B<=A && B<=C) {
			menor = B;
			if (A<=C) {
				meio = A;
				maior = C;
			} else {
				menor = C;
				maior = A;
			}
		} else {
			menor = C;
			if (A<=B) {
				meio = A;
				maior = B;
			} else {
				meio = B;
				maior = A;
			}
		}
		
		System.out.println("Em ordem crescente é");
		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);
		
	}
}
