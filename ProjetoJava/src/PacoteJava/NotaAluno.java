package PacoteJava;
/*
 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
 *  Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
 */
import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1,nota2,nota3,media;
		Scanner ler=new Scanner(System.in);
		System.out.println("Nota1: ");
		nota1=ler.nextInt();
		System.out.println("Nota2: ");
		nota2=ler.nextInt();
		System.out.println("Nota3: ");
		nota3=ler.nextInt();
		media=((nota1*2)+(nota2*3)+(nota3*5)/3);
		System.out.println("A média das notas é: "+media);
	}

}
