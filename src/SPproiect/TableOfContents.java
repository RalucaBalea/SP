package SPproiect;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element{
    private List<String> contents = new ArrayList<>();
    private int nrPage = 0;


    @Override
    public void print() {
        for (String content: contents){
            System.out.println(content);
        }
    }

    void addToTable(String content){
        this.contents.add(content);
    }

    @Override
    public void add(Element e) {
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}