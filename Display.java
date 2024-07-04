public class Display {
    
    public void Menu(String[] books)
    {

        System.out.println("Books: ");

        for(int i = 0; i < books.length; i++) {

            System.out.println(books[i]);
        }

        System.out.println();
        System.out.println();

        System.out.println("   MENU   ");
        System.out.println("1.      4.");
        System.out.println("2.      5.");
        System.out.println("3.      6.");
        System.out.println();
        System.out.print("> ");
    }
     
}