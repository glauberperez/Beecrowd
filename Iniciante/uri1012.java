package iniciante;
import java.util.Scanner;
public class uri1012 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double Val [] = new double [3];
		for(int i=0;i!=3; i++) {
			Val[i] = in.nextDouble();
		}
		double A = (Val[0]*Val[2])/2;
		double B = (Val[2]*Val[2])*3.14159;
		double C = (Val[2]*(Val[0]+Val[1])/2);
		double D = (Val[1]*Val[1]);
		double E = (Val[0]*Val[1]);
		System.out.println(String.format("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f",A,B,C,D,E));
		in.close();
	}
}
/*


Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
 Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada

O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída

O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde 
a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos
e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

Exemplos de Entrada 	

3.0 4.0 5.2
	
Exemplos de Saída

TRIANGULO: 7.800
CIRCULO: 84.949
TRAPEZIO: 18.200
QUADRADO: 16.000
RETANGULO: 12.000


*/