package edu.diogbar.controle_fluxo;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite um número inteiro: ");
        int num2 = scanner.nextInt();

        try {
            contador(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
 
    }

    public static void contador(int num1, int num2) throws ParametrosInvalidosException {
        if(num1 > num2) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        else {
            int cont = num2 - num1;
            for(int i = 0; i < cont; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}