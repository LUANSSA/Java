public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String original = " ASDFASDF ASDFASD FSDFFG AS";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(4);
		String s05 = original.substring(4,16);
		String s06 = original.replace('A','Z');
		String s07 = original.replace(" ", "");
		String s08 = original.replace("AS", "XX");
		int s09 = original.indexOf("A");
		int s10 = original.lastIndexOf("A");
		original = original.trim();
		String[] vet = original.split(" ");
		
		System.out.println(original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		System.out.println(s08);
		System.out.println(s09);
		System.out.println(s10);
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);
		System.out.println(vet[3]);
		double num = 4.5f;
		System.out.println(String.format("%.2f",num));
		scanner.close();
}
