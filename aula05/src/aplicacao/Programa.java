package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;
import entidade.ContaComercial;
import entidade.enums.Cores;
import entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		Cores cor;
		double saldo = 0;
		int numero = 0;
		
		Scanner scn1 = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		Scanner scn2 = new Scanner(System.in);
		List<Conta> lista = new ArrayList<>();
		
		System.out.println("Seja Bem vindo ao oreia bank!");
		System.out.print("Quantas contas deseja criar?: ");
		int numeroDeContas = scn2.nextInt();
		if (numeroDeContas <= 1){
			System.out.println("Qual será o nome da sua conta? ");
			nome = scn.nextLine().toLowerCase();	
			System.out.println("Digite o número da sua conta: ");
			numero = scn2.nextInt();
			System.out.println("Digite o saldo: ");
			saldo = scn.nextDouble();
			System.out.println("Qual o tipo de conta?");
			System.out.println("1 - Conta Corrente.");
			System.out.println("2 - Conta Poupança");
			System.out.println("3 - Conta Comercial");
			int tipo = scn.nextInt();
			
			switch(tipo) {
			
			case 1: ContaCorrente cr = new ContaCorrente(nome, numero, saldo, Cores.PINK);
			lista.add(cr);
			//System.out.println(lista);
			break;
			
			case 2: ContaPoupanca cp = new ContaPoupanca(nome, numero, saldo, Cores.RED);
			lista.add(cp);
			//System.out.println(lista);
			break;
			
			case 3: ContaComercial cc = new ContaComercial(nome, numero, saldo, Cores.BLACK);
			lista.add(cc);
			//System.out.println(lista);
			break;
			
			default:System.out.println("Digite um numero válido.");
			break;
			}
			
		}else {
			for (int i = 0; i < numeroDeContas; i++) {
				System.out.println("Qual será o nome da sua conta? ");
				nome = scn1.nextLine().toLowerCase();	
				System.out.println("Digite o número da sua conta: ");
				numero = scn2.nextInt();
				System.out.println("Digite o saldo: ");
				saldo = scn.nextDouble();
				System.out.println("Qual o tipo de conta?");
				System.out.println("1 - Conta Corrente.");
				System.out.println("2 - Conta Poupança");
				System.out.println("3 - Conta Comercial");
				int tipo = scn.nextInt();
				
				switch(tipo) {
				
				case 1: ContaCorrente cr = new ContaCorrente(nome, numero, saldo, Cores.PINK);
					lista.add(cr);
				
				break;
				
				case 2: ContaPoupanca cp = new ContaPoupanca(nome, numero, saldo, Cores.RED);
					lista.add(cp);
				
				break;
				
				case 3: ContaComercial cc = new ContaComercial(nome, numero, saldo, Cores.BLACK);
					lista.add(cc);
					break;
				
				default:
					System.out.println("Digite um número valido.");
					break;
				}

			}
		}

		System.out.println(lista);
		
	}

}
