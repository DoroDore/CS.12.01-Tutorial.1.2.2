public class HiddenWord {
    public String hiddenWord;
    public HiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord.toUpperCase();
    }
    public String getHiddenWord() {
        return hiddenWord;
    }
    public String getHint(String input) {
        if (!(input.toUpperCase().equals(input))) {
            throw new IllegalArgumentException("Your guess ( " + input + " ) does not contain all uppercase letters. " +
                    "Your guess must contain all uppercase letters!");
        }
        if (input.length() != hiddenWord.length()) {
            throw new IllegalArgumentException("Your guess ( " + input + " ) has " + input.length() + " characters. " +
                    "The hidden word has " + hiddenWord.length() + " characters. Your guess must be a word with " +
                    hiddenWord.length() + " characters!");
        }
        String thing = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == hiddenWord.charAt(i)) {
                thing += input.charAt(i);
            }
            //edit here I suck
            else if (hiddenWord.contains(String.valueOf(input.charAt(i)))) {
                thing += "+";
            }
            else {
                thing += "*";
            }
        }
        return thing;
    }
}
