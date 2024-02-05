package LibraryManagementSystem;
import java.util.ArrayList;

public class Library {
    
    public static ArrayList<Languages> BookShelf =new ArrayList<Languages>(null);

    public void addLanguage(Languages language){
        BookShelf.add(language);
    }
    public void removeLanguage(Languages language){
        BookShelf.remove(language);
    }
    public static ArrayList<Languages> getBookShelf(){
        return BookShelf;
    }
    public void printBookShelf(){
        System.out.println(getBookShelf());
    }

}
