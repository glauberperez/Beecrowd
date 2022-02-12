package iniciante;
import java.util.Scanner;
public class uri1009 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salFixo, vendasEfet, com; //vendasEfet = vendas efetuadas em dinheiro
		String nome = in.next();
		salFixo = in.nextDouble();
		vendasEfet = in.nextDouble();
		com = ((vendasEfet/100)*15);
		double finalPrec = com+salFixo;
		String finalText = String.format("TOTAL = R$ %.2f", finalPrec);
		System.out.println(finalText);
		in.close();
	}
}

/*

Faça um programa que leia o nome de um vendedor, o seu salário fixo e 
o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o total a receber no final do mês, com duas casas decimais.

Entrada

O arquivo de entrada contém um texto (primeiro nome do vendedor) e
2 valores de dupla precisão (double) com duas casas decimais,
representando o salário fixo do vendedor e montante total das vendas efetuadas 
por este vendedor, respectivamente.

Saída

Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

*/