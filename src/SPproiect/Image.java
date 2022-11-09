package SPproiect;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String name;
    private String url;
//  private ImageContent content;


    Image(String name) {
        this.name = name;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void print() {
        System.out.println("Image with name: "+name);
    }



//    public ImageContent content(){
//        return null;
//    }
    public void add(Element e){
    }
    public void remove(Element e){
    }
    public Element get(int index){
        return null;
    }
}