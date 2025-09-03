import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public static String[] initializeDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffle(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static void distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            System.out.println("Not enough cards!");
            return;
        }
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ": ");
            for (int j = 0; j < cards; j++) {
                System.out.println("  " + deck[i * cards + j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards each: ");
        int cards = sc.nextInt();

        String[] deck = initializeDeck();
        shuffle(deck);
        distribute(deck, players, cards);
        sc.close();
    }
}
