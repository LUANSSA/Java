public class TiposPrimitivos{

  public static void main(String[] args){
    
    //********* TIPOS PRIMITIVOS **********
    
    //int - 32 bytes de precisao
    int idade = 24;
    //double - 64 bytes de precisao
    double saldoBancario = 401.04;
    //float - 32 bytes de precisão
    float  altura = 170f;
    //boolean - aceita verdadeiro ou falso ( true or false )
    boolean trabalha = true;
    //char - 16 bytes de precisao
    char sexo = 'M';
    //byte aceita números inteiros até o valor máximo 127
    int qtDedosNasMaos = 10;
    //short - 16 bytes de precisao
    short qtDedosNosPes = 10;
    //long - 64 bytes de precisao
    long numeroGrande = 10000L;
    //String
    String nome = "Luan";
    
    //IMPRIMINDO
    System.out.println("********* EXERCÍCIO 1 **********");
    System.out.println("Nome: "+nome);
    System.out.println("Idade: "+idade);
    System.out.println("Altura: "+altura);
    System.out.println("Trabalha: "+trabalha);
    System.out.println("Sexo: "+sexo);
    System.out.println("Saldo Bancário: "+saldoBancario);
    System.out.println("Quantidade de dedos nas Mãos: "+qtDedosNasMaos);
    System.out.println("Quantidade de dedos nos Pés: "+qtDedosNosPes);
    System.out.println("Numero grade: "+numeroGrande);
    
    //********** EXERCÍCIO **********
    /*
      Crie um algoritmo que possua variaveis para salvar os seguintes dados:
        Nome, Endereço e Telefone de uma pessoa
      
      Imprima essas variaveis da seguinte forma:
        "0 <nome> domiciliado no endereco <endereco> e telephone <telefone>
        não possui nenhum tipo de pendencia."
    */
    
    String pessoa = "Luan";
    String endereco = "Rua Professor Aristides Novis";
    String telefone = "(71) 9 3333 - 3333";
    
    System.out.println("********* EXERCÍCIO 2 **********");
    System.out.println("O "+pessoa+" domiciliado no endereco "+endereco+" e telephone "+
                      telefone+" não possui nenhum tipo de pendência");
    

    //********** EXERCÍCIO **********
    /*
      Crie um algoritmo que possua as variáveis nome, salário, sexo(M ou F),
      idade e estado civil.
	
      Imprima da seguinte forma:
	"O trabalhador(a) <nome> do sexo <sexo>, idade <idade>, estado civil
	<estadoCivil> e salario <salario> encontra-se empregado neste estabe
	lecimento."
    */

     String nomePessoa = "Nicole";
     double salarioPessoa = 8000;
     char sexoPessoa = 'F';
     byte idadePessoa = 20;
     String estadoCivil = "solteira";
     
     System.out.println("********* EXERCÍCIO 3 **********");
     System.out.println("O trabalhador(a) "+nomePessoa+" do sexo "+sexoPessoa+
			", idade "+idadePessoa+", estado civil "+estadoCivil+
			" e salario "+salarioPessoa+" econtra-se empregado(a) neste"+
			" estabelecimento");
  }
}
