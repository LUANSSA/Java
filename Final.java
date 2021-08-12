//Modificador de acesso final
public class Escola(){
  //um atributo final não pode ser alterado e nem herdado por outra classe
  private final double PI = 3.14f;
  
  //um método final não pode ser herdado por outra classe
  //por isso ele não pode virar um Override
  public final double getPI(){
    return this.PI;
  }
  
}
