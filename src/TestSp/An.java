package TestSp;

import java.util.ArrayList;
import java.util.List;

public class An implements Element{
	public String numeAn;
	private List<Grupa> numeGrupa = new ArrayList<>();
	
	 public An(String numeAn) {
	        this.numeAn = numeAn;
	    }

	    @Override
	    public void print() {
	        System.out.println(numeAn);
	        for(Element element: numeGrupa){
	            element.print();
	        }
	    }

	    @Override
	    public void add(Element e) {
	        this.numeGrupa.add(e);
	    }

	    @Override
	    public void remove(Element e) {
	        this.numeGrupa.remove(e);
	    }

	    public void accept(Visitor visitor) {
	        visitor.visitAn(this);
	    
}
