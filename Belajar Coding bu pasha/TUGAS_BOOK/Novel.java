public class Novel extends Book {
    private String genre;

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Novel() {
        super(); // mengakses constructor superclass
        genre = "";
    }

    public Novel(String title, int year, double price, String genre) {
        super(title, year, price);
        this.genre = genre;
    }

    public void print() {
        super.print();
        System.out.println("Genre: " +genre);
    }

}
