public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, String name, String surname, int rating, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = new Author(name, surname, rating);
        this.pages = pages;
    }
    public Book(String title, int releaseYear, Author author, int rating, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }

    public int estimatePrice() {
        int cost = (int) Math.floor(((3 * pages) *  Math.sqrt(author.rating)));
        return Math.max(cost, 250);
    }

}
