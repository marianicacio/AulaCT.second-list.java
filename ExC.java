import java.util.Scanner;

public class ExC {

    public static void main(String[] args) {

    double N1, N2, N3 , N4 , NE, MD1, MD2;
    Scanner sc = new Scanner(System.in);
		System.out.print("Sua nota no Primeiro Bimestre: ");
		N1 = sc.nextDouble();
		System.out.print("Sua nota no Segundo Bimestre: ");
		N2 = sc.nextDouble();
		System.out.print("Sua nota no Terceiro Bimestre: ");
		N3 = sc.nextDouble();
		System.out.print("Sua nota no Quarto Bimestre: ");
		N4 = sc.nextDouble();
		
		MD1 = (N1 + N2 + N3 + N4) / 4;
		
		if (MD1 >= 7) {
			System.out.println("Aprovado");
			System.out.println("Média Final: " + MD1);
		} else {
			System.out.print("Digite a nota do exame NE: ");
			NE = sc.nextDouble();
            
            MD2 = (MD1 + NE) / 2;
            
            if (MD2 >= 5) {
            	System.out.print("Aprovado em exame");
            } else {
            	System.out.println("Reprovado");
            	System.out.println("Média Final: " + MD2);
            }
		}
		
    }

	}