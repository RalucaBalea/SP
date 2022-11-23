package TestSp;

public class Main {
	public static void main(String[] args) {
		Element info3 = new An("Infofrmatica 3")
				.add(new Grupa("Grupa 1")
						.add(new Semigrupa("Semigrupa 1.1"))
							.add(new Student ("Popescu I", "popescu@acme.edu"))
							.add(new Student ("Ionescu E", "ionescu@acme.edu")))
						.add(new Semigrupa("Semigrupa 1.2")
							.add(new Student ("Vasilescu I", "vasilescu@acme.edu"))
							.add(new Student ("Georgescu E", "georgescu@acme.edu")))
				.add(new Grupa("Grupa 2"));
		Visitor printVisitor = new PrintVisitor;
		info3.accept(printVisitor);
	}
}
