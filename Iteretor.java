public static void main(String[] args){
  ArrayList<String> nomes = new ArrayList<String>();
  nomes.add("Luan");
  nomes.add("João");
  nomes.add("Tobias");
  
  java.util.Iterator<String> iterator = nomes.iterator();
  while(iterator.hasNext()){
    System.out.println(iterator.next());
  }
}
