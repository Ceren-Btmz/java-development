import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] quotes = { "You must be the change you wish to see in the world.",
                "Spread love everywhere you go.", "The only thing we have to fear is fear itself.",
                "Darkness cannot drive out darkness: only light can do that.", "Well done is better than well said.",
                "Do one thing every day that scares you.", "Be yourself; everyone else is already taken.",
                "You will face many defeats in life, but never let yourself be defeated.",
                "In the end, it's not the years in your life that count. It's the life in your years.",
                "Never let the fear of striking out keep you from playing the game."
        };

        boolean continueLoop = true;
        Random random = new Random();

        try {
            System.out.println("Select a number 1-10: ");
            System.out.println("Or enter R for a random quote: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("R")) {
                int randomIndex = random.nextInt(quotes.length);
                System.out.println(quotes[randomIndex]);
            } else {
                int index = Integer.parseInt(input);
                System.out.println(quotes[index - 1]);
            }
        }
        catch (Exception ex) {
            System.out.println("There has been an error.");
        }
    }
}
