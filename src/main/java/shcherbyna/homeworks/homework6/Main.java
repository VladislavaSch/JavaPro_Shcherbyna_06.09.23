package shcherbyna.homeworks.homework6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(findSymbolOccurance("Vlada", 'a')); // Task 1
        System.out.println(findWordPosition("Astollo", "llo")); // Task 2
        System.out.println(stringReverse("Manipulation")); // Task 3
        System.out.println(isPalindrome("Hello")); // Task 4


        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Scanner scanner = new Scanner(System.in);
        int index = (int) (Math.random() * 25);
        String secretWord = words[index];

        while (true) {
            System.out.println("Please try to guess the word!");
            String word = scanner.nextLine();
            if (word.equals(secretWord)) {
                System.out.println("You guess the word: " + secretWord + ". Congratulations!");
                break;
            }
            StringBuilder rightAnswer = new StringBuilder();
            for (int i = 0; (i < word.length()) && (i < secretWord.length()); i++) {
                if (word.charAt(i) == secretWord.charAt(i)) {
                    rightAnswer.append(word.charAt(i));
                } else {
                    rightAnswer.append('#');
                }
            }
            if (rightAnswer.length() < 15){
                int x = 15 - rightAnswer.length();
                rightAnswer.append("#".repeat(Math.max(0, x)));

            }
            System.out.println("Hint: " + rightAnswer + " - Try again!");
        }
    }

    public static int findSymbolOccurance(String string, char a) {
        char[] array = string.toCharArray();
        int counter = 0;
        for (char chars : array) {
            if (chars == a) {
                counter++;
            }
        }
        return counter;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String a) {
        char[] reverse = a.toCharArray();
        for (int i = 0; i < reverse.length / 2; i++) {
            char temp = reverse[i];
            reverse[i] = reverse[reverse.length - i - 1];
            reverse[reverse.length - i - 1] = temp;
        }
        return new String(reverse);
    }

    public static boolean isPalindrome(String word) {
        char[] array = word.toCharArray();
        int j = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
}
