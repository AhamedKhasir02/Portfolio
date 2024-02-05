package LibraryManagementSystem;

import java.util.ArrayList;

class Languages extends Library {

    private String language;

    public static ArrayList<Genre> BookGenre =new ArrayList<Genre>(null);

    public Languages(String language){
        this.language=language;
    }
    public void addGenre(Genre genre){
        BookGenre.add(genre);
    }
    public void removeGenre(Genre genre){
        BookGenre.remove(genre);
    }
    public static ArrayList<Genre> getBookGenre(){
        return BookGenre;
    }
    public void printBookGenre(){
        System.out.println(getBookGenre());
    }
    public void getLanguage(){
        System.out.println(language);
    }
    
}
