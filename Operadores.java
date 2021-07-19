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
		//Somando
		System.out.println(n1+" + "+n1+" = "+(n1+n1));
		//Subtraindo
		System.out.println(n1+" - "+n1+" = "+(n1-n1));
		//Multiplicando
		System.out.println(n1+" * "+n1+" = "+(n1*n1));
		//Dividindo
		System.out.println(n1+" / "+n1+" = "+(n1/n1));
		//Cast
		System.out.println(n1+" *= "+1.2+" = "+(n1*=1.2));
		System.out.println((n1-=2)+" *= (cast)"+1.2+" = "+(n1*=(int)1.2));

		//Operadores de atribuição
		// =	recebe e substitui
		// -=	recebe e subtrai
		// +=	recebe e soma
		// *=	recebe e multiplica
		// /=	recebe e divide
		// %=	recebe o resto da divisão
		System.out.println(n1+" = "+4+" igual a "+(n1=4));
		System.out.println(n1+" -= "+4+" igual a "+(n1-=4));
		System.out.println(n1+" += "+4+" igual a "+(n1+=4));
		System.out.println(n1+" *= "+4+" igual a "+(n1*=4));
		System.out.println(n1+" /= "+4+" igual a "+(n1/=4));
		System.out.println(n1+" %= "+4+" igual a "+(n1%=4));

		
	}
}
