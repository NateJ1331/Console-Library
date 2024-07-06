import java.util.List;
public class Display {
    //Displays Menu
    public void Menu()
    {
        System.out.println("   MENU   ");
        System.out.println("1. Add Book        4. Display Books");
        System.out.println("2. Remove Book     5. Check Out Book");
        System.out.println("3. Search Books    6. Return Book");
        System.out.println("7. Exit");
        System.out.println();
        System.out.print("> ");
    }

    // Displays Books
    public void Books(List<String> books)
    {   
        System.out.println();
        System.out.println("Books: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }   
}