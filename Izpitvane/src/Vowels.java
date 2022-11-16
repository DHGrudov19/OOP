public class Vowels {

    public static boolean checkVowels(String word) {
        boolean result = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' ||
                    word.charAt(i) == 'i' || word.charAt(i) == 'o' ||
                    word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i) == 'E' ||
                    word.charAt(i) == 'I' || word.charAt(i) == 'O' ||
                    word.charAt(i) == 'U') {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String value="asdasd";
        System.out.println(checkVowels(value));

    }
}
