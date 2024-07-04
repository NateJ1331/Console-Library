import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Display display = new Display();

        int exit = 0;
        Scanner input = new Scanner(System.in);

        while (exit < 1) {
            
            String[] Books = {
                "The Clockwork Angel","Frankenstien","The Dare","Stalking Jack the Ripper",
                "Crazy Rich Asians","The Haunting","The Twin","Daughter of the Moon Godess",
                "Daugter of the Moon Godess","Kept Secrets","The Outsiders","Pride and Prejudice","Beowulf"};

            display.Menu(Books);

            String userinput = input.nextLine();

            switch (userinput) {
                case "6" -> exit = 1;
            
                default -> {
                }
            }

        }
    }
}
