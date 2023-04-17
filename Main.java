import java.time.LocalTime;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.print("Enter opening symbol: ");
        char openingChar = scanner.nextLine().charAt(0);

        System.out.print("Enter closing symbol: ");
        char closingChar = scanner.nextLine().charAt(0);

        BetweenSymbolsRemover remover = new BetweenSymbolsRemover();
        String processedText = remover.removeWordsBetweenSymbols(text, openingChar, closingChar);
        int wordCount = remover.getWordCount(processedText);

        System.out.println("Original text: " + text);
        System.out.println("Processed text: " + processedText);
        System.out.println("Word count in processed text: " + wordCount);
    }
}
