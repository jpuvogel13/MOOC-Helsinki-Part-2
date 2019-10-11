public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        String word = characterString;
        String replaced = "";
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (character == fromCharacter) {
                replaced += toCharacter;
            } else {
                replaced += character;
            }
        }

        return replaced;
    }
}
