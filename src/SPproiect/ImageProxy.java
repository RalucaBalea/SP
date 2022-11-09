package SPproiect;

import java.awt.*;
import java.util.List;

public class ImageProxy implements Element{
    private String url;
    private Dimension dim;
    private Image realImg;
    public void loadImage() {
        if (realImg == null){
            realImg = new Image(url);
        }

    }
    ImageProxy(String url){
        this.url = url;
    }

    public String url(){
        return url;
    }

    @Override
    public void print() {
        loadImage();
        realImg.print();
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
}