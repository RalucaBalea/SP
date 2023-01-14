package SPproiect;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private List<Author> authors = new ArrayList<>();
    private TableOfContents tableOfContent = null;
    public Book(String title) {
        super(title);
    }
    public void addContent(Element content){
        add(content);
    }

    public void setTableOfContent(TableOfContents table){
        this.tableOfContent = table;
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public void print(){
        System.out.println("Authors:");
        for(Author author: authors){
            author.print();
        }

        super.print();
        System.out.println("-----Table of content----");
        if (tableOfContent != null) {
            tableOfContent.print();
        }

    }
}