package mychar;

public class MyChar {

    private char lang;

    public MyChar(char lang) {
        this.lang = lang;
    }

    public boolean isVowel() {
        if (isNumber() || isAlphabet()) {
            if (lang == 'A' || lang == 'a')
                return true;

            else if (lang == 'I' || lang == 'i')
                return true;

            else if (lang == 'E' || lang == 'e')
                return true;

            else if (lang == 'O' || lang == 'o')
                return true;

            else return lang == 'U' || lang == 'u';
        }
        return false;
    }

    public boolean isNumber() {
        return lang >= 48 && lang <= 57;
    }

    public boolean isAlphabet() {
        if (lang >= 'A' && lang <= 'Z')
            return true;

        return lang >= 'a' && lang <= 'z';
    }

    public void printLowerCaseAlphabets() {
        int n = 0;
        if (lang >= 'A' && lang <= 'Z') {
            n = lang + 32;
            lang = (char)n;
        }
        System.out.println(lang);
    }

    public void printUpperCaseAlphabets() {
        int n = 0;
        if (lang >= 'a' && lang <= 'z') {
            n = lang - 32;
            lang = (char)n;
        }
        System.out.println(lang);
    }
}
