package POO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nomePessoa, endeco, telefone;
		
		Pessoa p = new Pessoa();
		
		Pessoa p1 = new Pessoa("Matheus");
		
		Pessoa p2 = new Pessoa("Icaro", "dsadasda", "1237561231");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ------------------ USANDO OS SETTERS -------------- \n");
		
		System.out.println("Informe o nome: ");
		nomePessoa = sc.nextLine();
		p.setNome(nomePessoa);
		
		System.out.println("Informe o Endereço: ");
		endeco = sc.nextLine();
		p.setEndereco(endeco);
		
		System.out.println("Informe o telefone: ");
		telefone = sc.nextLine();
		p.setEndereco(telefone);
		
		System.out.println(" ------------------ USANDO OS GETTERS -------------- \n");
		
		System.out.println(p.getNome());
		System.out.println(p.getEndereco());
		System.out.println(p.getTelefone());

	}

}
