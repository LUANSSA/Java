import java.util.ArrayList;
public static void main(String[]
    //Instanciando listaNotasMatematica
    ArrayList listaNotasMatematica = new ArrayList();
    listaNotasMatematica.add(10.0f);
    listaNotasMatematica.add(6.0f);
    listaNotasMatematica.add(7.0f);
    listaNotasMatematica.add(5.5f);
		  
    System.out.println(listaNotasMatematica.toString());
    System.out.println(listaNotasMatematica.contains(7.0f));
    //Instânciando listaTeste
    ArrayList listaTeste = new ArrayList();
    listaTeste.add(8.0f);
    listaTeste.add(8.0f);
    //Adicionando listaTeste á listaNotasMatematica                    
    listaNotasMatematica.addAll(listaTeste);
    System.out.println(listaTeste.toString());
    System.out.println(listaNotasMatematica.toString());
  
  
  
}
