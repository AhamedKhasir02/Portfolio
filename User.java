package LibraryManagementSystem;

class User {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Song of Ice and Fire", "RR Martin", "GOT003", 2000);
        Book b2 = new Book("east asian miracle", "world bank", "HPAE002",1300);
        Book b3 = new Book("Fall of US", "raynold", "FUS005",4000);
        Book b4 = new Book("Islamophobia", "Khaled Beydoun", "IKB001",3000);
        Book b5 = new Book("Harry Potter", "JK Rowling", "HP004",2500);
        Book b6 = new Book("Thirukkural", "Thiruvalluvar", "TV0765", 300);
        Book b7 = new Book("Ramayana", "Valmiki", "RAV0653", 543);
        Book b8 = new Book("Kitab e Tawheed", "Wahabi", "KTH0783", 4320);
        Book b9 = new Book("Kizhash Nikov", "Vladamir Zelensky", "NKV0353", 6430);
        Book b10 = new Book("Othello", "William Shakesphere", "OWS0675", 3420);

        Genre g1 = new Genre("Fantacy");
        Genre g2 = new Genre("Economics");
        Genre g3 = new Genre("Politics");
        Genre g4 = new Genre("Religious");
        Genre g5 = new Genre("Education");
        Genre g6 = new Genre("Romance");

        Languages l1 = new Languages("English");
        Languages l2 = new Languages("Tamil");
        Languages l3 = new Languages("Hindi");
        Languages l4 = new Languages("Russian");
        Languages l5 = new Languages("Arabic");

        lib.addLanguage(l1);
        lib.addLanguage(l2);
        lib.addLanguage(l3);
        lib.addLanguage(l4);
        lib.addLanguage(l5);

        l1.addGenre(g1);
        l1.addGenre(g2);
        l1.addGenre(g3);
        l1.addGenre(g4);
        l1.addGenre(g5);
        l1.addGenre(g6);

        l2.addGenre(g1);
        l2.addGenre(g2);
        l2.addGenre(g3);
        l2.addGenre(g4);
        l2.addGenre(g5);
        l2.addGenre(g6);

        l3.addGenre(g1);
        l3.addGenre(g2);
        l3.addGenre(g3);
        l3.addGenre(g4);
        l3.addGenre(g5);
        l3.addGenre(g6);

        l4.addGenre(g1);
        l4.addGenre(g2);
        l4.addGenre(g3);
        l4.addGenre(g4);
        l4.addGenre(g5);
        l4.addGenre(g6);

        l5.addGenre(g1);
        l5.addGenre(g2);
        l5.addGenre(g3);
        l5.addGenre(g4);
        l5.addGenre(g5);
        l5.addGenre(g6);
        
        g1.addBook(b1);
        g1.addBook(b5);
        g2.addBook(b2);
        g3.addBook(b3);
        g3.addBook(b9);
        g3.addBook(b4);
        g4.addBook(b7);
        g4.addBook(b8);
        g5.addBook(b6);
        g6.addBook(b10);
        




    }
}
