public class BetweenSymbolsRemover {
    public String removeWordsBetweenSymbols(String text , char openingChar , char closingChar) {
        StringBuilder sb = new StringBuilder();
        boolean inBetweenChars = false;

        for (char c : text.toCharArray()) {
            if (c == openingChar) {
                inBetweenChars = true;
                continue;
            } else if (c == closingChar) {
                inBetweenChars = false;
                continue;
            }

            if (!inBetweenChars) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public int getWordCount(String text) {
        int count = 0;
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                count++;
            }
        }
        return count;
    }
}
