//Collections
import java.util.HashMap;
public static void main(String[] args){
  //Instânciando um HashMap
  //Tipando a '<Chave,valor>' como String e String
  HashMap<String,String> dicionario = new HashMap<String,String>();
  dicionario.put("Java","Linguagem de Programação Orientada a Objetos");
  dicionario.put("C","Linguagem de Programação Estruturada");
  System.out.println(dicionario.toString());
  //{Java=Linguagem de Programação Orientada a Objetos, C=Linguagem de Programação Estruturada}
  
  //Instânciando um HashMap
  //Tipando a '<Chave,Valor>' como String e Double
  HashMap<String,Double> nota = new HashMap<String,Double>();
  nota.put("Luan",10);
  nota.put("July",10);
  System.out.println(nota.toString());
  //{Luan=10.0, July=10.0}
  
  nota.put("Luan",9.6);
  System.out.println(nota.toString());
  //{Luan=9.6, July=10.0}
  
  System.out.println(nota.containsKey("Luan"));
  //true
  System.out.println(nota.containsKey("Luca"));
  //false
  for(String chave: nota.keySet()) {
   System.out.println(chave);
   //Luan
   //July
   }
   for(String chave: nota.keySet()) {
    System.out.println(nota.get(chave));
    //9.6
    //10.0
   }
  
  
}
