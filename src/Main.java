
public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Da Vinci Code", 2003, "Dan", "Brown", 4, 689);
        System.out.println(book.isBig());
        System.out.println(book.matches("Code"));
        System.out.println(book.estimatePrice());

    }
}