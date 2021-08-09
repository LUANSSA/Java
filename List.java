//List é uma interface!
//List não pode ser instânciada pois é uma interface
//List pode ser implementada por outras classes como ArrayList e LinkedList
//Umas lista possuí nodos onde cada valor guardado tem seu nodo apontando para próxima posição na lista
//Onde terá outro valor guardado
//Quando o nodo de uma posição na lista é null isso indica que a lista chegou ao fim
//Para acessar um valor na lista é preciso ir de nodo em nodo até a posição onde o valor está
//parecido com uma pilha

//ArrayList é um exemplo de classe que implementa a interface List
//Que possuí a qualidade de ter seus valores acessados dinâmicamente através de um i


package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
      //Exemplo de lista onde não está específicado o tipo de Wrapper classe
	    List list = new ArrayList();
	    
	    //adicionando elementos do tipo string á lista list
	    list.add("Luan");
	    list.add("Maria");
	    list.add("Ana");
	    list.add("Fátima");
	    list.add("Daniel");
	    list.add("Alex");
	    //pegando o tamanho da lista
	    int sizeList = list.size();
	    
	    //usando o for simples
	    for(int i = 0; i < sizeList; i++) {
	    	//imprimindo a posição de cada element e cada elemento na posição i
	    	System.out.println(list.indexOf(list.get(i))+" "+list.get(i));
	    }
	    System.out.println("--------------------------");
	    
	    //adicionando um elemento na lista na posição x
	    list.add(5,"Joana");
	    sizeList = list.size();
	    for(int i = 0; i < sizeList; i++) {
	    	//imprimindo a posição de cada element e cada elemento na posição i
	    	System.out.println(list.indexOf(list.get(i))+" "+list.get(i));
	    }
	    System.out.println("--------------------------");
	    
	    //removendo um elemento da lista na posição x
	    list.remove(6);
	    sizeList = list.size();
	    for(int i = 0; i < sizeList; i++) {
	    	//imprimindo a posição de cada element e cada elemento na posição i
	    	System.out.println(list.indexOf(list.get(i))+" "+list.get(i));
	    }
	    System.out.println("--------------------------");
	    
	    //removendo um elemento da lista passando um dado elemento referência
	    list.remove("Maria");
	    sizeList = list.size();
	    for(int i = 0; i < sizeList; i++) {
	    	//imprimindo a posição de cada element e cada elemento na posição i
	    	System.out.println(list.indexOf(list.get(i))+" "+list.get(i));
	    }
	    System.out.println("--------------------------");
	    
	    //remove elementos da lista segundo uma referência
	    list.add("Carlos");
	    list.add(3,"Cirilo");
	    list.add(5,"Cebola");
	    //list.add(9,"Cyclope"); erro pois a posição 9 não existe
	    sizeList = list.size();
	    for(int i = 0; i < sizeList; i++) {
	    	//imprimindo a posição de cada element e cada elemento na posição i
	    	System.out.println(list.indexOf(list.get(i))+" "+list.get(i));
	    }
	    System.out.println("Removendo os elementos que começam com 'C'");
	    //Como a lista é genérica e não tem um Wrapper pré definindo o tipo dela
	    //É necessário converter o retorno de x para String e assim verificar
	    //O x.charAt(0)
	    list.removeIf(x -> ((String) x).charAt(0) == 'C');
	    sizeList = list.size();
	    for(int i = 0; i < sizeList; i++) {
	    	//imprimindo a posição de cada element e cada elemento na posição i
	    	System.out.println(list.indexOf(list.get(i))+" "+list.get(i));
	    }
	    
	    System.out.println("--------------------------");
	    list.add("Laura");
	    list.add("Lorana");
	    sizeList = list.size();
	    for(int i = 0; i < sizeList; i++) {
	    	//imprimindo a posição de cada element e cada elemento na posição i
	    	System.out.println(list.indexOf(list.get(i))+" "+list.get(i));
	    }
	    //Filtrando elementos da lista que começam com L
	    /*
	    	NECESSÁRIO QUE list TIVESSE SIDO ESPECIFÍCADA COM UMA Wrapper CLASS
	    //List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
	    
	    */
	    //Filtro alternativo
	    List<String> result = (List<String>) list.stream().filter(x -> ((String) x).charAt(0) == 'L').collect(Collectors.toList());
	    System.out.println("Imprimindo lista result");
	    for(int i = 0; i < result.size(); i++) {
	    	//imprimindo a posição de cada element e cada elemento na posição i
	    	System.out.println(result.indexOf(result.get(i))+" "+result.get(i));
	    }
	    System.out.println("--------------------------");
	    //Filtrando primeiro elemento encontrado com inical 'A'
	    String name = (String) list.stream().filter(x ->((String) x).charAt(0) == 'A').findFirst().orElse(null);
	    System.out.println("Primeiro nome encontrado o a letra 'A': "+ name);
	    //Filtrando primeiro nome com inicial não contida na list 'U'
	    name = (String) list.stream().filter(x ->((String) x).charAt(0) == 'U').findFirst().orElse(null);
	    System.out.println("Primeiro nome encontrado o a letra 'U': "+ name);
	}
}

