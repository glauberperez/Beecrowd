package iniciante;
import java.util.Scanner;
public class uri1013 {
	public static void main(String[] args) {
		int num [] = new int [3];
		Scanner in = new Scanner(System.in);
		for(int i=0 ;i!=3 ;i++) {
			num[i] = in.nextInt();
		}
        if (num[0] > num[1] && num[1] > num[2]) {
        	System.out.println(num[0] + " eh o maior");
        } else if (num[1] > num[2]) {
        	System.out.println(num[1] + " eh o maior");
        } else {
        	System.out.println(num[2] + " eh o maior");
        }
        in.close();
	}
}

/*

Faça um programa que leia três valores e apresente o maior dos 
três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada

O arquivo de entrada contém três valores inteiros.
Saída

Imprima o maior dos três valores seguido por um espaço e a mensagem:
"eh o maior".

*/