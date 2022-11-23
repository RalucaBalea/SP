package TestSp;

import java.util.ArrayList;
import java.util.List;


public class Semigrupa implements Element{
    private String numeSemigrupa;
    private List<Element> studenti = new ArrayList<>();

    public Semigrupa(String numeSemigrupa) {
        this.numeSemigrupa = numeSemigrupa;
    }

    public String getNumeSemigrupa() {
        return numeSemigrupa;
    }

    @Override
    public void print() {
        System.out.println(numeSemigrupa);
        for(Element element: studenti){
            element.print();
        }
    }

    @Override
    public void add(Element e) {
        this.studenti.add(e);
    }

    @Override
    public void remove(Element e) {
        this.studenti.remove(e);
    }

    public void accept(Visitor visitor) {
        visitor.visitSemigrupa(this);
    }
}
