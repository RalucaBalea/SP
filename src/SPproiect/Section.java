package SPproiect;

import java.util.ArrayList;
import java.util.List;


public class Section implements Element{

    public Section(String title) {
        this.title = title;
    }

    private String title;


    private List<Element> elements = new ArrayList<>();
    public void print(){
        System.out.println(title);
        for(Element element: elements){
            element.print();
        }
    }

    public void add(Element e){
        this.elements.add(e);
    }
    public void remove(Element e){
        this.elements.remove(e);
    }
    public Element get(int index){
        return elements.get(index);
    }
}