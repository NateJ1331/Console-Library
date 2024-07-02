
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Display display = new Display();

        int exit = 0;
        Scanner input = new Scanner(System.in);

        while (exit < 1) {
            
            display.Menu();

            String userinput = input.nextLine();

            switch (userinput) {
                case "6":
                    exit = 1;
                    break;
            
                default:
                    break;
            }

        }
    }
}
