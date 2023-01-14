package SPproiect;

public class TableOfContentsVisitor implements Visitor{
    private TableOfContents contents = new TableOfContents();
    private int nrPage = 1;

    void incrementNrPage(){
        this.nrPage = this.nrPage+1;
    }

    public void print(){
        contents.print();
    }

    @Override
    public void visitBook(Book book) {
        this.incrementNrPage();
    }

    public TableOfContents getContents(){
        return contents;

    }
    @Override
    public void visitSection(Section section) {
        this.incrementNrPage();
        contents.addToTable(section.getTitle()+"   ...   pg "+Integer.toString(nrPage));
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.incrementNrPage();
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.incrementNrPage();
    }

    @Override
    public void visitImage(Image image) {
        this.incrementNrPage();
    }

    @Override
    public void visitTable(Table table) {
        this.incrementNrPage();
    }
}