package iniciante;
import java.util.Scanner;
public class uri1008 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, horas;
		double ganhoHoras,salario;
		num = in.nextInt();
		horas = in.nextInt();
		ganhoHoras = in.nextDouble();
		salario = (horas*ganhoHoras);
		System.out.println("NUMBER = "+num);
		String salarioText = String.format("SALARY = U$ %.2f", salario);
		System.out.println(salarioText);
		in.close();
	}
}
/*


Escreva um programa que leia o número de um funcionário, 
seu número de horas trabalhadas, o valor que recebe por hora e 
calcula o salário desse funcionário. A seguir, mostre o número e o 
salário do funcionário, com duas casas decimais.

Entrada

O arquivo de entrada contém 2 números inteiros e 1 número
com duas casas decimais, representando o número, quantidade de horas 
trabalhadas e o valor que o funcionário recebe por hora trabalhada,
respectivamente.

Saída

Imprima o número e o salário do funcionário, 
conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade.
 No caso do salário, também deve haver um espaço em branco após o $.

*/