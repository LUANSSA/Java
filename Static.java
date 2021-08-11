//Atributos estáticos dentro de uma classe X
//possuem um endereço e todos os objetos
//instânciados da classe X irão utilizar esse mesmo endereço
//ao acessar esse atributo estático


//Métodos static servem para exercutar operações sem a necessidade
//de instanciação de uma classe
//por exemplo a classe Utils
public class Escola(){
  //Todos os objetos instânciados terão o mesmo nome_escola
  private static String nome_escola = "Biriboubou";
  private double mensalidade;
  
  //Um método static é um método de classe
  public static getEscola(){
    //Não é necessário o this pois não se trata deste
    //Mas sim de todos, da classe!
    return nome_escola;
  }
  
  public static String getMensalidade(){
    /*
      //erro pois this.semalidade é uma variável não static e métodos estáticos
      //Métodos static se relacionam com atributos static
      return this.mensalidade;
    */
    /*
      //erro pois this.semalidade é uma variável não static e métodos estáticos
      //Métodos static se relacionam com atributos static
      return mensalidade;
    */
  }
  
}
