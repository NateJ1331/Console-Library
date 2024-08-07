import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        Display display = new Display();
        //sets all the preset books
        String[] ArrayBooks = {
        "The Clockwork Angel","Frankenstien","The Dare","Stalking Jack the Ripper",
        "Crazy Rich Asians","The Haunting","The Twin","Daughter of the Moon Godess",
        "Daugter of the Moon Godess","Kept Secrets","The Outsiders","Pride and Prejudice","Beowulf"};
        
        //initalizes the checked out books list
        List<String> CheckedOutBooks = new ArrayList<>();
        // converts array to a lost
        List<String> Books = new ArrayList<>(List.of(ArrayBooks)); 


        int exit = 0;
        // sets up scanner wheever I need to check for user input
        Scanner input = new Scanner(System.in);

        while (exit < 1) {

            display.Menu();

            String option = input.nextLine();

            //Menu selection
            switch (option) {

                // adds inputed book to list
                case "1" -> { 
                System.out.println("What Book would you like to add? ");
                String newbook = input.nextLine();
                Books.add(newbook);
                }
                // removes inputed book to list
                case "2" ->{ 
                    System.out.println("What Book would you like to remove? ");
                    String removebook = input.nextLine();
                    Books.remove(removebook);
                }
                // search for book inputed by user
                case "3" ->{
                    System.out.println("What Book would you like to search for? ");
                    String search = input.nextLine();
                    if (Books.contains(search)) {
                        System.out.println("We have that book");
                    }
                    else if (CheckedOutBooks.contains(search))
                    {
                        System.out.println("That book is checked out");
                    }
                    else
                    {
                        System.out.println("That Book is not in our System");
                    }
                }

                case "4" -> display.Books(Books);
                // moved books from main list to check out list
                case "5" -> {
                    System.out.println("What Book would you like to check out? ");
                    String checkedBook = input.nextLine();
                    if(Books.contains(checkedBook))
                    {
                        Books.remove(checkedBook);
                        CheckedOutBooks.add(checkedBook);
                    }
                    else
                    {
                        System.out.println("We dont Have that Book");
                    }
                }
                //moved books from checked out list to main list
                case "6" ->
                {
                    System.out.println("What Book would you like to return? ");
                    String returnedBook = input.nextLine();
                    if(CheckedOutBooks.contains(returnedBook))
                    {
                        CheckedOutBooks.remove(returnedBook);
                        Books.add(returnedBook);
                    }
                    else
                    {
                        System.out.println("That book is not Checked out");
                    }
                }

                case "7" -> exit = 1;
            
            }

        }
    }
}
