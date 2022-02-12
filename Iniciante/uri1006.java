package iniciante;
import java.util.Scanner;
public class uri1006 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float A,B,C,med;
		A = in.nextFloat();
		B = in.nextFloat();
		C = in.nextFloat();
		med = (float) (((A*2) + (B*3) + (C*5)) / (2+3+5));
		String medSt = String.format("MEDIA = %,.1f", med);
		System.out.println(medSt);
		in.close();
	}
}
/*


Leia 3 valores, no caso, variáveis A, B e C,
que são as três notas de um aluno. A seguir, calcule a média do aluno, 
sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada

O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída

Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo,
com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
Assim como todos os problemas,não esqueça de imprimir o fim de linha após o resultado, 
caso contrário, você receberá "Presentation Error".

*/