package br.com.escola20241;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "";
		String matricula = "";
		String cpf = "";
		String email = "";
		
		System.out.println("Ola mundo");
		Aluno aluno = new Aluno();
		aluno.setMatricula("2025123456");
		System.out.println("Matricula: " + aluno.getMatricula());
		aluno.setNome("Jose da silva");
		System.out.println("Nome: " + aluno.getNome());
		aluno.setEmail("ze@gmail.com");
		System.out.println("email: " + aluno.getEmail());
		aluno.setCpf("11111111110");
		System.out.println("CPF: " + aluno.getCpf());
		
		System.out.println(" ");
		System.out.println("ALUNO 2");
		Aluno aluno2 = new Aluno("antonio onofre", "12345678910", "20258798745","tonho@gmail.com");
		System.out.println("Matricula: " + aluno2.getMatricula());
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("email: " + aluno2.getEmail());
		System.out.println("CPF: " + aluno2.getCpf());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno ");
		nome = sc.next();
		System.out.println("o nome digitado é: " + nome);
		
		System.out.println("Digite a Matricula do aluno: ");
		matricula = sc.next();
		System.out.println("Sua Matricula é: " + matricula);
		
		System.out.println("Digite cpf: ");
		cpf = sc.next();
		System.out.println("sua CPF é: " + cpf);
		
		System.out.println("Digite seu email: ");
		email = sc.next();
		System.out.println("sua email é: " + email);
		
		Aluno aluno3 = new Aluno(nome, cpf, matricula,email);
		System.out.println("Matricula: " + aluno3.getMatricula());
		System.out.println("Nome: " + aluno3.getNome());
		System.out.println("email: " + aluno3.getEmail());
		System.out.println("CPF: " + aluno3.getCpf());
		
		System.out.println("Aluno3: " + aluno3.toString());
	}

}
