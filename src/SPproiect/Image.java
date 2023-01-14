package SPproiect;

import SPproiect.Element;

import java.util.List;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class Image implements Element,Pictures {
    private String name;

    public Image(String name) {
        this.name = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Image with name: "+name);
    }

    public void add(Element e){
    }
    public void remove(Element e){
    }
    public Element get(int index){
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }

    @Override
    public String url() {
        return null;
    }
}