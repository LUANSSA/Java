public class Operadores{
	public static void main(String[] args){
		//Operadores
		// ++ Increment
		// -- Decrement
		// +  Plus
		// -  Minus
		// *  Multiplication
		// /  Division
		// () Cast
		// !  Not 
	
		int n1 = 10;
		//O increment acontece na mesma linha pois o ++ vem antes
		System.out.println("Increment: "+(++n1));
		//O increment acontece quando o programa termina de ler essa linha
		System.out.println("Increment: "+(n1++));
		//Imprimindo o número incrementado			
		System.out.println("Post Increment: "+n1);
		//Imprimindo número decrementado
		System.out.println("Decrement: "+(--n1));
		System.out.println("Decrement: "+(n1--));
		System.out.println("Post Decrement: "+n1);
		
	}
}
