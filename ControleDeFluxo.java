public class ControleDeFluxo{
	public static void main(String[] args){
		//idade <= 14 categoria infantil
		//idade > 14 && idade < 18 categoria juvenil		
		//idade >= 18 categoria adulto
		int idade = 14;
		//Neste exemplo todos os 3 if serão verficados		
		if(idade <= 14){
			System.out.println("Infantil");
		}
		if(idade > 14 && idade < 18){
			System.out.println("Juvenil");
		}
		if(idade >= 18){
			System.out.println("Adulto");
		}
		idade = 20;
		/*Neste exemplo se idade for < que 14, o sistema não irá ler o else if nem o else seguinte	
		*/		
		if(idade <= 14){
			System.out.println("Infantil");		
		}
		else if(idade > 14 && idade < 18){
			System.out.println("Juvenil");
		}
		else{
			System.out.println("Adulto");
		}
		
	}
}
