package ok;

import java.util.Scanner;

public class SomarDoisNumeros {
    public static void main(String[] args) {
        int x = 0, y = 0, soma = 0;
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Digite o primeiro numero: ");
        x = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        y = sc.nextInt();

        soma = x + y;

        System.out.println("A soma de " + x + " e " + y + " é: " + soma);

        sc.close();  
        }
}