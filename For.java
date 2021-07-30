public static void main(String[] args){
  
	ArrayList<String> nomes = new ArrayList<String>();
	nomes.add("Luan");
	nomes.add("João");
	nomes.add("Tobias");
  
  for(java.util.Iterator<String> iterator = nomes.iterator(); iterator.hasNext();){
    System.out.println(iterator.next());
  }
  
  //forEach
  for(String nome : nomes){
    System.out.println(nome);
  }
  
  
}
