# Java

package aula_30_06_2021; //String - Array - ArrayList - ArrayList<String>

import java.util.ArrayList;
import java.util.HashMap;
public class Index {

	public static void main(String[] args) {
		
		String nome = "Paschoal";
		//Usando o método split para pegar cada caractere da String nome
		String[] arrayCharacter = nome.split("");
		
		for(int i = 0; i < arrayCharacter.length; i++) {
			System.out.println(arrayCharacter[i]);
		}
		
		
		//Acessando diretamente a String nome
		for(int i = 0; i < nome.length(); i++) {
			//Acessando cada caractere usando o método charAt(x)
			System.out.print(nome.charAt(i)+" ");
		}
		System.out.println();
		
		
		//Array List criada com generic <String>
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Luan");
		nomes.add("Nicole");
		nomes.add("Thayna");
		nomes.add("Júlia");
		
		
		
		//Arrays - tamanho estático - pré definido
		
		//ArrayString
		String[] arrayString = new String[4];
		arrayString[0] = "Lino";
		arrayString[1] = "Rubens";
		arrayString[2] = "Carlos";
		arrayString[3] = "Juriscreudo";
		
		//Arrays Double e Float
		Float[] arrayFloat = new Float[5];
		Double[] arrayDouble = {3.6,4.5,1.1,5.7,4.8};
		
		
		//Array List - tamanho dinámico - não pré definido
		ArrayList listaCardapio = new ArrayList();
		listaCardapio.add("Hamburger");
		listaCardapio.add("Patel");
		listaCardapio.add("Coxinha");
		//Um Array List sem Generics pode ter diferentes tipos de dados
		listaCardapio.add(20);
		System.out.println(listaCardapio);
		//Array List métodos
		//.remove(10);
		//.toString();
		
		//HashMap
		//Criando um HashMap dicionario
		HashMap<String,String> dicionario = new HashMap<String,String>();
		//Criando um HashMap produtos
		HashMap<Integer,String> produtos = new HashMap<Integer,String>();
		
		//Adicionando ao HashMap dicionario
		dicionario.put("Java", "Linguagem de programação");
		dicionario.put("C++", "Linguagem de programação");
		
		System.out.println(dicionario.toString());
	}
}

	package application;
import models.Funcionario;
import models.Aluno;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario());
		funcionarios.add(new Funcionario());
		funcionarios.get(0).setNome(sc.nextLine());
		funcionarios.get(0).setSalarioBruto(sc.nextDouble());
		funcionarios.get(0).setImposto(sc.nextDouble());
		
		System.out.println(funcionarios.get(0).toString());
		System.out.println("which percentage to increase salary?");
		funcionarios.get(0).setUpdateSalarioBruto(sc.nextDouble());
		
		
		sc.nextLine();
		
		funcionarios.get(1).setNome(sc.nextLine());
		funcionarios.get(1).setSalarioBruto(sc.nextDouble());
		funcionarios.get(1).setImposto(sc.nextDouble());
		System.out.println(funcionarios.get(1).toString());

		System.out.println("which percentage to increase salary?");
		funcionarios.get(1).setUpdateSalarioBruto(sc.nextDouble());

		System.out.println(funcionarios.get(0).toString());

		System.out.println(funcionarios.get(1).toString());
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno());
		alunos.add(new Aluno());
		sc.nextLine();
		System.out.println("Digite o Aluno e suas 3 notas");
		alunos.get(0).setNome(sc.nextLine());
		alunos.get(0).setNotas(sc.nextDouble());
		alunos.get(0).setNotas(sc.nextDouble());
		alunos.get(0).setNotas(sc.nextDouble());
		sc.nextLine();
		System.out.println("Digite o Aluno e suas 3 notas");
		alunos.get(1).setNome(sc.nextLine());
		alunos.get(1).setNotas(sc.nextDouble());
		alunos.get(1).setNotas(sc.nextDouble());
		alunos.get(1).setNotas(sc.nextDouble());
		
		System.out.println(alunos.get(0).toString());
		System.out.println(alunos.get(1).toString());
	}
}

	
	
//ATALHOS ECLIPSE
alt + ceta para o lado : ajuda ao navegar nas janelas
ctrl+shift+o : importa automaticamente
ctrl+q : volta no código na última alteração feita
seleciona linhas + alt + seta para cima ou para baixo: move linhas de código ou bloco de linhas
