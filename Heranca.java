//this e super - SOBRECARGA DE MÉTODO

public class AlunoEspecial extends Aluno(){
    private String especialidade
      
  //existindo um método toString na classe Pai, o super chama esse método.
  public String toString(){
      return "";
  }
  
  //Dessa forma com o super.toString()
  //0 toString() que será chamado é o do pai
  public String imprimeAlunoEspecialComSuper(){
    return  super.toString()
            +"\n"
            +"Especialidade: "
            +this.getEspecialidade();
          
  }
  
  //Dessa forma com o this.toString()
  //O toString() que será chamado é o do próprio filho
  //Neste caso o retorno será ""
  public String imprimeAlunoEspecialComThis(){
    return  this.toString()
            +"\n"
            +"Especialidade: "
            +this.getEspecialidade();
          
  }
  
  
  public String getEspecialidade(){
    return this.especialidade;
  }
}

public static void main(String[] args){
    
    ///aluno0 terá todos os atributos e métodos da classe Aluno
    Aluno aluno0 = new Aluno();
    //aluno1 terá todas os atributos e métodos da classe Aluno
    //mais os atributos e métodos da classe AlunoEspecial
    AlunoEspecial aluno1 = new AlunoEspecial();
    
    ///aluno0 terá todos os atributos e métodos da classe Aluno
    //aluno2 teŕa todos os atributos e métodos da classe Aluno
    //mais os atributos da calsse AlunoEspecial
    //porém os métodos de aluno2 que referem a classe AlunoEspecial
    //só podem ser chamandos quando são Override da classe pai
    aluno aluno2 = new AlunoEspecial();
}
