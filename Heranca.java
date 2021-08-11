//this e super

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
