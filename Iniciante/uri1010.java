package iniciante;
import java.util.Scanner;
public class uri1010 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double [] A = new double [3];
		double [] B = new double [3];
		for(int i=0; i!=3; i++) {
			A[i] = in.nextDouble();
		}
		for(int i=0; i!=3; i++) {
			B[i] = in.nextDouble();
		}
		double prodSA = (A[1]*A[2]);
		double prodSB = (B[1]*B[2]);
		double total = prodSA+prodSB;
		String totalText = String.format("VALOR A PAGAR: R$ %.2f", total);
		System.out.println(totalText);
		in.close();
	}
}
/*


Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada

O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
respectivamente dois inteiros e um valor com 2 casas decimais.

Saída

A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar
um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado 
com 2 casas após o ponto.

*/