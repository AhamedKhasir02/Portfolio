package LibraryManagementSystem;

import java.util.ArrayList;

class Genre  {
    private String genre;
    
    public static ArrayList<Book> Books = new ArrayList<Book>();

    public Genre(String genre){
        this.genre=genre;
    }
    public void addBook(Book book){
        Books.add(book);
    }
    public void removeBook(Book book){
        Books.remove(book);
    }
    public static ArrayList<Book> getBooks() {
        return Books;
    }
    public void printBooks(){
        System.out.println(getBooks());
    }
    public void getGenre(){
        System.out.println(genre);
    }
}
