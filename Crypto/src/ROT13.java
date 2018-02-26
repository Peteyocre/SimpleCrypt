import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder textSB = new StringBuilder();
        for (int i = 0; i < text.length(); i++ ) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'm') textSB.append(c += 13);

            else if (c >= 'n' && c <= 'z') textSB.append(c -= 13);

            else if (c >= 'A' && c <= 'M') textSB.append(c += 13);

            else if (c >= 'N' && c <= 'Z') textSB.append(c -= 13);

            else textSB.append(c);
        }
        return textSB.toString();
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        StringBuilder textSB = new StringBuilder();
        int startingIndex = s.indexOf(c);

        for (int i = startingIndex; i < s.length(); i++) {
            textSB.append(s.charAt(i));
        }
        for (int i = 0; i < startingIndex; i++) {
            textSB.append(s.charAt(i));
        }
        return textSB.toString();
    }

}
