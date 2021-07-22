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

