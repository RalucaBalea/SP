package TestSp;

import java.util.ArrayList;
import java.util.List;

public class Grupa implements Element {
    private String numeGrupa;
    private List<Element> semigrupe = new ArrayList<>();

    public Grupa(String numeGrupa) {
        this.numeGrupa = numeGrupa;
    }

    @Override
    public void print() {
        System.out.println(numeGrupa);
        for(Element element: semigrupe){
            element.print();
        }
    }

    @Override
    public void add(Element e) {
        this.semigrupe.add(e);
    }

    @Override
    public void remove(Element e) {
        this.semigrupe.remove(e);
    }

    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
    }
}