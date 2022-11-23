package TestSp;

public class Student implements Element {
    private String nume;
    private String email;

    public Student(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public void print() {
        System.out.println("Nume" + nume + "Email" + email);
    }

    @Override
    public void add(Element e) {}
    public void remove(Element e) {}

    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }
}