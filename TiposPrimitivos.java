public class TiposPrimitivos{

  public static void main(String[] args){
    
    
    //int - 32 bytes de precisao
    int idade = 24;
    //double - 64 bytes de precisao
    double saldoBancario = 401.04;
    //float - 32 bytes de precisão
    float  altura = 170f;
    //boolean - aceita verdadeiro ou falso ( true or false )
    boolean trabalha = true;
    //char - 16 bytes de precisao
    char sexo = "M";
    //byte aceita números inteiros até o valor máximo 127
    int qtDedosNasMaos = 10;
    //short - 16 bytes de precisao
    short qtDedosNosPes = 10;
    //long - 64 bytes de precisao
    long numeroGrande = 10000L;
    //String
    String nome = "Luan";
    
    
    System.out.println("Nome: "+nome);
    System.out.println("Idade: "+idade);
    System.out.println("Altura: "+altura);
    System.out.println("Trabalha: "+trabalha);
    System.out.println("Sexo: "+sexo);
    System.out.println("Saldo Bancário: "+saldoBancario);
    System.out.println("Quantidade de dedos nas Mãos: "+qtDedosNasMaos);
    System.out.println("Quantidade de dedos nos Pés: "+qtDedosNosPes);
    System.out.println("Numero grade: "+numeroGrande);
  }
}
