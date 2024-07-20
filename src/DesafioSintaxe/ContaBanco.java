package DesafioSintaxe;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, informe o seu Nome Completo !");
		String nome = sc.nextLine();
		
		System.out.println("Por favor, digite o número da Conta !");
		int conta = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Por favor, digite o número da Agência !");
		String agencia = sc.nextLine();
				
		System.out.println("Por favor, faça um depósito inicial !");
		double saldo = sc.nextDouble();
	
	
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, conta, saldo);
		
		
		sc.close();
	}

}
